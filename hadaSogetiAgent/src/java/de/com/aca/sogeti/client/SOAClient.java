package de.com.aca.sogeti.client;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDocument;
import net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDocument.GetLastMeasures;
import net.ip_label.ws.ws_datametrie_php.GetLastMeasuresResponseDocument;
import net.ip_label.ws.ws_datametrie_php.GetMonitorsDocument;
import net.ip_label.ws.ws_datametrie_php.GetMonitorsDocument.GetMonitors;
import net.ip_label.ws.ws_datametrie_php.GetMonitorsResponseDocument;
import net.ip_label.ws.ws_datametrie_php.GetMonitorsResponseDocument.GetMonitorsResponse;
import net.ip_label.ws.ws_datametrie_php.Location;
import net.ip_label.ws.ws_datametrie_php.Monitor;
import net.ip_label.ws.ws_datametrie_php.RefGetLocationsListDocument;
import net.ip_label.ws.ws_datametrie_php.RefGetLocationsListDocument.RefGetLocationsList;
import net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument;
import net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse;
import net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListDocument;
import net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListDocument.RefGetMeasurementsList;
import net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListResponseDocument;
import net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListResponseDocument.RefGetMeasurementsListResponse;
import net.ip_label.ws.ws_datametrie_php.Testvalues;
import net.ip_label.ws.ws_datametrie_php.impl.ArrayOflocationDescriptionImpl;
import net.ip_label.ws.ws_datametrie_php.impl.ArrayOfmeasurementsImpl;
import net.ip_label.ws.ws_datametrie_php.impl.ArrayOfmonitorImpl;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.quest.glue.api.services.LogService;

import de.com.aca.client.webservice.WS_datametrieServiceStub;
import de.com.aca.hada.agent.samples.hadaLocationData;
import de.com.aca.hada.agent.samples.hadaMeasureData;
import de.com.aca.hada.agent.samples.hadaScenarioData;
import de.com.aca.hada.agent.samples.hadaStepData;
import de.com.aca.sogeti.controller.DatametrieEnums;
import de.com.aca.sogeti.module.LocationMapping;
import de.com.aca.sogeti.module.MeasureMapping;
import de.com.aca.sogeti.module.StepMapping;
import de.com.aca.sogeti.utils.Configuration;

public class SOAClient {
	
	private static final String TRENNER = ".";

	/**
	 * Prepares data in the hierarchy of topology.
	 * 1. Gets the lest of scenarios (monitors) and its location
	 * 2. Sets steps and its measures for every location available
	 * @param url : SOA Target Endpoint
	 * @param username : HTTP Basic Auth user name
	 * @param password : HTTP Basic Auth password
	 * @param truststoreloc : Truststore location (used for HTTPS connection)
	 * @param trustsorepass : Truststore password
	 * @param logger : FglAM Logger variable initialized in agent class
	 * @return : List of scenarios -> locations -> steps -> measures
	 */
	public static List<hadaScenarioData> getData(String url, String username, String password, String truststoreloc, String trustsorepass, LogService.Logger logger) {
		
		Configuration config = Configuration.getInstance();
		LocationMapping locmap = new LocationMapping(getLocationList(url, username, password, truststoreloc, trustsorepass));
		MeasureMapping meamap = new MeasureMapping(getMeasurementList(url, username, password, truststoreloc, trustsorepass));
		StepMapping stepmap = new StepMapping(config.getProperties());
		
		try {
			WS_datametrieServiceStub stub = new WS_datametrieServiceStub(url);

			System.setProperty("javax.net.ssl.trustStore", truststoreloc);
			System.setProperty("javax.net.ssl.trustStorePassword", trustsorepass);
			Options options = stub._getServiceClient().getOptions();
			HttpTransportProperties.Authenticator auth = new HttpTransportProperties.Authenticator();
			auth.setPreemptiveAuthentication(true);
			auth.setPassword(password);
			auth.setUsername(username);
			options.setProperty(HTTPConstants.AUTHENTICATE, auth);

			GetMonitorsDocument gmd = GetMonitorsDocument.Factory.newInstance();
			GetMonitors gm = GetMonitors.Factory.newInstance();
			gmd.setGetMonitors(gm);
			GetMonitorsResponseDocument gmrd = stub.get_Monitors(gmd);

			GetMonitorsResponse retElement = gmrd.getGetMonitorsResponse();
			ArrayOfmonitorImpl arr = (ArrayOfmonitorImpl) retElement.getReturn();

			List<hadaScenarioData> sces = new ArrayList<hadaScenarioData>();

			NodeList list = arr.getDomNode().getChildNodes();
			// iterate all scenarios
			for (int i = 0; i < list.getLength(); i++) {
				Node scenario = list.item(i); // monitor(scenraio)
				String scenario_id = getChildNodeToName(scenario, DatametrieEnums.IDCONTRAT.toString()).getChildNodes().item(0).getNodeValue();
				hadaScenarioData scetemp = new hadaScenarioData(scenario_id);
				scetemp.setDescription(getChildNodeToName(scenario, DatametrieEnums.DESCRIPTION_OFFRE.toString()).getChildNodes().item(0).getNodeValue());
				scetemp.setShortname(getChildNodeToName(scenario, DatametrieEnums.NOMCONTRAT.toString()).getChildNodes().item(0).getNodeValue());
				scetemp.setStatus(getChildNodeToName(scenario, DatametrieEnums.ETATCONTRAT.toString()).getChildNodes().item(0).getNodeValue());
				scetemp.setType(getChildNodeToName(scenario, DatametrieEnums.DESCRIPTION_OFFRE.toString()).getChildNodes().item(0).getNodeValue());
				String idclient = getChildNodeToName(scenario, DatametrieEnums.IDCLIENT.toString()).getChildNodes().item(0).getNodeValue();
				String perio = getChildNodeToName(scenario, DatametrieEnums.PERIODICITE.toString()).getChildNodes().item(0).getNodeValue();
				scetemp.setVersion("1"); // TODO change to version
				Node locs = getChildNodeToName(scenario, DatametrieEnums.LOCATIONS.toString());
				NodeList locitems = locs.getChildNodes();
				//iterate location ids
				for (int k = 0; k < locitems.getLength(); k++) {
					Node item = locitems.item(k);
					String locid = getChildNodeToName(item, DatametrieEnums.SITEID.toString()).getChildNodes().item(0).getNodeValue();
					hadaLocationData loctmp = new hadaLocationData(scenario_id+TRENNER+locid);
					loctmp.setShortname(locmap.getName(locid));
					scetemp.getLocations().add(loctmp);
					//for every location get measures
					setMeasures(idclient, perio, scetemp, locid, loctmp, stub, logger, meamap, stepmap);
				}
				sces.add(scetemp);
			}
			return sces;
		} catch (AxisFault axisFault) {
			logger.log("Axis Fault on SOAClient.getData()", axisFault);
			return new ArrayList<hadaScenarioData>();
		} catch (Exception ex) {
			logger.log("Exception on SOAClient.getData()", ex);
			return new ArrayList<hadaScenarioData>();
		}
	}

	/**
	 * Sets the steps and measures for a location
	 * @param idclient : Client ID of Scenario
	 * @param perio : Periodicity 
	 * @param sce : Scenario object 
	 * @param loc : Location object
	 * @param stub : Web Service Stub for the SOA calls
	 * @param logger : FglAM Logger variable initialized in agent class
	 */
	private static void setMeasures(String idclient, String perio, hadaScenarioData sce, String locid, hadaLocationData loc, WS_datametrieServiceStub stub, LogService.Logger logger, MeasureMapping meamap, StepMapping stepmap) {
		//initializing the input parameter
		GetLastMeasuresDocument glmd = GetLastMeasuresDocument.Factory.newInstance();
		GetLastMeasures glm = GetLastMeasures.Factory.newInstance();
		Monitor monitor = glm.addNewMonitor();
		monitor.setIDCONTRAT(Integer.parseInt(sce.getName()));
		monitor.setETATCONTRAT(sce.getStatus());
		monitor.setDESCRIPTIONOFFRE(sce.getType());
		monitor.setNOMCONTRAT(sce.getName());
		monitor.setIDCLIENT(Integer.parseInt(idclient));
		monitor.setPERIODICITE(Integer.parseInt(perio));
		monitor.addNewLOCATIONS();
		Location location = glm.addNewLocation();
		location.setSITEID(Integer.parseInt(locid));
		glmd.setGetLastMeasures(glm);
		
		HashMap<String, hadaStepData> steps = new HashMap<String, hadaStepData>();
		
		try {
			GetLastMeasuresResponseDocument resp = stub.get_Last_Measures(glmd);
			Testvalues arr = resp.getGetLastMeasuresResponse().getReturn();
			Node measurelist = getChildNodeToName(arr.getDomNode(), DatametrieEnums.MEASURE_LIST.toString());
			NodeList measures = measurelist.getChildNodes();
			//iterate through the measures and classify to speps
			for (int k = 0; k < measures.getLength(); k++) {
				Node mea = measures.item(k);
				String mea_id = getChildNodeToName(mea, DatametrieEnums.ID_DONNEEMESURE.toString()).getChildNodes().item(0).getNodeValue();
				String mea_val = getChildNodeToName(mea, DatametrieEnums.VALEURMESUREE.toString()).getChildNodes().item(0).getNodeValue();
				String step_id = getChildNodeToName(mea, DatametrieEnums.REQUETE.toString()).getChildNodes().item(0).getNodeValue();
				hadaMeasureData dat = new hadaMeasureData(sce.getName()+TRENNER+locid+TRENNER+step_id+TRENNER+mea_id);
				dat.setShortname(meamap.getName(mea_id));
				dat.setValue(Double.parseDouble(mea_val));
				//logger.log(sce.getName() + " - "+locid+" - "+step_id+" - "+mea_id+" - "+mea_val);
				if(steps.containsKey(step_id)) {
					steps.get(step_id).getMeasures().add(dat);
				} else {
					hadaStepData step = new hadaStepData(sce.getName()+TRENNER+locid+TRENNER+step_id);
					step.setShortname(stepmap.getName(step_id));
					step.getMeasures().add(dat);
					steps.put(step_id, step);
				}
			}			
			loc.getSteps().addAll(steps.values());				
		} catch (RemoteException e) {
			logger.log("Exception on getMeasures()", e);
		}

	}
	
	
	public static HashMap<String, String> getLocationList(String url, String username, String password, String truststoreloc, String trustsorepass) {
		
		HashMap<String, String> idToName = new HashMap<String, String>();
		try {
			WS_datametrieServiceStub stub = new WS_datametrieServiceStub(url);

			System.setProperty("javax.net.ssl.trustStore", truststoreloc);
			System.setProperty("javax.net.ssl.trustStorePassword", trustsorepass);
			Options options = stub._getServiceClient().getOptions();
			HttpTransportProperties.Authenticator auth = new HttpTransportProperties.Authenticator();
			auth.setPreemptiveAuthentication(true);
			auth.setPassword(password);
			auth.setUsername(username);
			options.setProperty(HTTPConstants.AUTHENTICATE, auth);

			RefGetLocationsListDocument rgld = RefGetLocationsListDocument.Factory.newInstance();
			RefGetLocationsList rgll = RefGetLocationsList.Factory.newInstance();
			rgld.setRefGetLocationsList(rgll);
			RefGetLocationsListResponseDocument rglrd = stub.ref_Get_Locations_List(rgld);
			RefGetLocationsListResponse retElement = rglrd.getRefGetLocationsListResponse();
			ArrayOflocationDescriptionImpl arr = (ArrayOflocationDescriptionImpl) retElement.getReturn();
			
			NodeList list = arr.getDomNode().getChildNodes();
			for (int i = 0; i < list.getLength(); i++) {
				Node location = list.item(i);
				String location_id = getChildNodeToName(location, DatametrieEnums.SITEID.toString()).getChildNodes().item(0).getNodeValue();
				String location_name = getChildNodeToName(location, DatametrieEnums.NOMSITE.toString()).getChildNodes().item(0).getNodeValue();
				idToName.put(location_id, location_name);
			}
			
		} catch (Exception except) {
			
		}
		return idToName;
	}
	
	public static HashMap<String, String> getMeasurementList(String url, String username, String password, String truststoreloc, String trustsorepass) {
		
		HashMap<String, String> idToName = new HashMap<String, String>();
		try {
			WS_datametrieServiceStub stub = new WS_datametrieServiceStub(url);

			System.setProperty("javax.net.ssl.trustStore", truststoreloc);
			System.setProperty("javax.net.ssl.trustStorePassword", trustsorepass);
			Options options = stub._getServiceClient().getOptions();
			HttpTransportProperties.Authenticator auth = new HttpTransportProperties.Authenticator();
			auth.setPreemptiveAuthentication(true);
			auth.setPassword(password);
			auth.setUsername(username);
			options.setProperty(HTTPConstants.AUTHENTICATE, auth);

			RefGetMeasurementsListDocument rgld = RefGetMeasurementsListDocument.Factory.newInstance();
			RefGetMeasurementsList rgll = RefGetMeasurementsList.Factory.newInstance();
			rgld.setRefGetMeasurementsList(rgll);
			RefGetMeasurementsListResponseDocument rglrd = stub.ref_Get_Measurements_List(rgld);
			RefGetMeasurementsListResponse retElement = rglrd.getRefGetMeasurementsListResponse();
			ArrayOfmeasurementsImpl arr = (ArrayOfmeasurementsImpl) retElement.getReturn();
			
			NodeList list = arr.getDomNode().getChildNodes();
			for (int i = 0; i < list.getLength(); i++) {
				Node location = list.item(i);
				String location_id = getChildNodeToName(location, DatametrieEnums.ID_DONNEEMESURE.toString()).getChildNodes().item(0).getNodeValue();
				String location_name = getChildNodeToName(location, DatametrieEnums.DESC_DONNEEMESURE.toString()).getChildNodes().item(0).getNodeValue();
				idToName.put(location_id, location_name);
			}
			
		} catch (Exception except) {
			
		}
		return idToName;
	}

	/**
	 * Get the child node with the LocalName "name"
	 * @param n : Parent Node
	 * @param name : Name of the child node
	 * @return : Child node or nill
	 */
	private static Node getChildNodeToName(Node n, String name) {
		NodeList ls = n.getChildNodes();
		for (int k = 0; k < ls.getLength(); k++) {
			Node tmp = ls.item(k);
			if (name.equalsIgnoreCase(tmp.getLocalName())) {
				return tmp;
			}
		}
		return null;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {

		try {
			Configuration config = Configuration.getInstance();
			System.out.println("soa call, firing...");
			WS_datametrieServiceStub stub = new WS_datametrieServiceStub("https://ws.ip-label.net/WS_datametrie.php");
			//keytool -import -alias ca -file ~/sogeti.cer -keystore ~/cacerts

			System.setProperty("javax.net.ssl.trustStore", "C:\\temp\\cacerts");
			System.setProperty("javax.net.ssl.trustStorePassword", "changeit");

			String username = "atlascopcows", password = "dgx2014";
			// OMFactory omFactory = OMAbstractFactory.getOMFactory();
			// OMElement omSecurityElement = omFactory.createOMElement(new
			// QName(
			// "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd",
			// "Security", "wsse"), null);
			//
			//
			// OMElement omusertoken = omFactory.createOMElement(new
			// QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd",
			// "UsernameToken", "wsu"), null);
			//
			// OMElement omuserName = omFactory.createOMElement(new
			// QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd",
			// "Username", "wsse"), null);
			// omuserName.setText(username);
			//
			// OMElement omPassword = omFactory.createOMElement(new
			// QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd",
			// "Password", "wsse"), null);
			// omPassword.addAttribute("Type","http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText",null
			// );
			// omPassword.setText(password);
			//
			// omusertoken.addChild(omuserName);
			// omusertoken.addChild(omPassword);
			// omSecurityElement.addChild(omusertoken);
			// stub._getServiceClient().addHeader(omSecurityElement);

			Options options = stub._getServiceClient().getOptions();
			HttpTransportProperties.Authenticator auth = new HttpTransportProperties.Authenticator();
			auth.setPreemptiveAuthentication(true);
			auth.setPassword(password);
			auth.setUsername(username);
			options.setProperty(HTTPConstants.AUTHENTICATE, auth);
			
			RefGetMeasurementsListDocument rgld = RefGetMeasurementsListDocument.Factory.newInstance();
			RefGetMeasurementsList rgll = RefGetMeasurementsList.Factory.newInstance();
			rgld.setRefGetMeasurementsList(rgll);
			RefGetMeasurementsListResponseDocument rglrd = stub.ref_Get_Measurements_List(rgld);
			RefGetMeasurementsListResponse retElement = rglrd.getRefGetMeasurementsListResponse();
			ArrayOfmeasurementsImpl arr = (ArrayOfmeasurementsImpl) retElement.getReturn();
			
			NodeList list = arr.getDomNode().getChildNodes();
			for (int i = 0; i < list.getLength(); i++) {
				Node location = list.item(i);
				String location_id = getChildNodeToName(location, DatametrieEnums.ID_DONNEEMESURE.toString()).getChildNodes().item(0).getNodeValue();
				String location_name = getChildNodeToName(location, DatametrieEnums.DESC_DONNEEMESURE.toString()).getChildNodes().item(0).getNodeValue();
				System.out.println(location_id + " " + location_name);
				
			}

			GetMonitorsDocument gmd = GetMonitorsDocument.Factory.newInstance();
			GetMonitors gm = GetMonitors.Factory.newInstance();
			gmd.setGetMonitors(gm);
			GetMonitorsResponseDocument gmrd = stub.get_Monitors(gmd);

			//GetMonitorsResponse retElement = gmrd.getGetMonitorsResponse();
			//ArrayOfmonitorImpl arr = (ArrayOfmonitorImpl) retElement.getReturn();

			// System.out.println("Array XML: " + arr);
			System.out.println("Array size: " + arr.getDomNode().getChildNodes().getLength());

			//NodeList list = arr.getDomNode().getChildNodes();
			for (int i = 0; i < list.getLength(); i++) {
				Node nd = list.item(i);
				NodeList ls = nd.getChildNodes();
				System.out.println(DatametrieEnums.IDCONTRAT + " = "
						+ getChildNodeToName(nd, DatametrieEnums.IDCONTRAT.toString()).getChildNodes().item(0).getNodeValue());
				Node locs = getChildNodeToName(nd, DatametrieEnums.LOCATIONS.toString());
				NodeList locitems = locs.getChildNodes();
				for (int k = 0; k < locitems.getLength(); k++) {
					Node item = locitems.item(k);
					String locid = getChildNodeToName(item, DatametrieEnums.SITEID.toString()).getChildNodes().item(0).getNodeValue();
					System.out.println("--" + locid);

				}
				// for(int k=0; k<ls.getLength();k++) {
				// Node n = ls.item(k);
				// System.out.println("-Attr: "+n.getLocalName()+"   -Value: "+n.getChildNodes().item(0).getNodeValue());
				// }
				// for(int k=0; k<ls.getLength();k++) {
				// Node n = ls.item(k);
				// System.out.println("-Attr: "+n.getLocalName()+"   -Value: "+n.getChildNodes().item(0).getNodeValue());
				// }

			}
			
			
			MeasureMapping meamap = new MeasureMapping(null);
			StepMapping stepmap = new StepMapping(null);
			GetLastMeasuresDocument glmd = GetLastMeasuresDocument.Factory.newInstance();
			GetLastMeasures glm = GetLastMeasures.Factory.newInstance();
			Monitor monitor = glm.addNewMonitor();
			monitor.setIDCONTRAT(94215);
			monitor.setETATCONTRAT("PROCESSING");
			monitor.setDESCRIPTIONOFFRE("Rich Internet Application");
			monitor.setNOMCONTRAT("Atlascopco without Limelight RIA");
			monitor.setIDCLIENT(19040);
			monitor.setPERIODICITE(30);
			monitor.addNewLOCATIONS();
			Location location = glm.addNewLocation();
			location.setSITEID(958);
			glm.setLocalTime(true);
			glmd.setGetLastMeasures(glm);

			
			try {
				GetLastMeasuresResponseDocument resp = stub.get_Last_Measures(glmd);
				Testvalues arr2 = resp.getGetLastMeasuresResponse().getReturn();
				Node measurelist = getChildNodeToName(arr2.getDomNode(), DatametrieEnums.MEASURE_LIST.toString());

				NodeList measures = measurelist.getChildNodes();
				System.out.println("size"+measures.getLength());
				for (int k = 0; k < measures.getLength(); k++) {
					Node mea = measures.item(k);
					String mea_id = getChildNodeToName(mea, DatametrieEnums.ID_DONNEEMESURE.toString()).getChildNodes().item(0).getNodeValue();
					String mea_val = getChildNodeToName(mea, DatametrieEnums.VALEURMESUREE.toString()).getChildNodes().item(0).getNodeValue();
					String step_id = getChildNodeToName(mea, DatametrieEnums.REQUETE.toString()).getChildNodes().item(0).getNodeValue();
					System.out.println(step_id+" - "+mea_id+" - "+mea_val);
				}				
				
			} catch (RemoteException e) {
				System.out.println("Exception on getMeasures(): "+ e);
				e.printStackTrace();
			}
			

			System.out.println("soa call completed!!!");

		} catch (AxisFault axisFault) {
			axisFault.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}