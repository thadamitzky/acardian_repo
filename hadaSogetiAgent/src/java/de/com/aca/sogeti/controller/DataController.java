package de.com.aca.sogeti.controller;

import java.util.List;

import com.quest.glue.api.services.LogService;

import de.com.aca.hada.agent.samples.hadaScenarioData;
import de.com.aca.sogeti.client.SOAClient;

/**
 * @author Hurshid Kadirov
 * 
 */
public class DataController {
	private static DataController instance = null;

	private DataController() {

	}

	public static DataController getInstance() {
		if (instance == null) {
			instance = new DataController();
		}
		return instance;
	}

	public List<hadaScenarioData> getData(String url, String username, String password, String truststoreloc, String trustsorepass, LogService.Logger logger) {
		return SOAClient.getData(url, username, password, truststoreloc, trustsorepass, logger);
	}
}
