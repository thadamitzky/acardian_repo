/*
 Copyright 2013 Dell Inc.
 ALL RIGHTS RESERVED.

 This software is the confidential and proprietary information of
 Dell Inc. ("Confidential Information"). You shall not
 disclose such Confidential Information and shall use it only in
 accordance with the terms of the license agreement you entered
 into with Dell Inc.

 DELL INC. MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT
 THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED,
 INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
 MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
 NON-INFRINGEMENT. DELL SHALL NOT BE LIABLE FOR ANY
 DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING
 OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package com.quest.fglam.example.url;

import com.quest.glue.api.annotation.DevKitGenerated;
import com.quest.glue.api.services.*;
import java.util.*;
import javax.annotation.Generated;

/**
 * Wraps the defined Agent properties set in a typesafe implementation
 * that can be used when deploying on SPID.
 */
@Generated(value = "FglAM Developer's Kit 5.6.10 (5.6.10-201309231246-312109-302)", date = "2013-09-23T12:52:02-0400")
@DevKitGenerated(productVersion = "5.6.10", buildNumber = "5.6.10-201309231246-312109-302", date = "2013-09-23T12:52:02-0400")
public class URLAvailabilityAgentPropertyWrapper {

private final ASPService3 mASPService;

/**
 * Creates a new instance of the PropertyWrapper around the ASPService forURLAvailabilityAgent agent
 * @param service delegate instance
 */
public URLAvailabilityAgentPropertyWrapper(ASPService3 service) {
	mASPService = service;
}


/**
 * Get the current UrlList  secondary asp list
 * @return read-only list of UrlList
 */
public List<UrlList> getUrlList() {
	List<Map<String,Object>> secondary = mASPService.getSecondaryASP("urlList");
	if(secondary == null) return Collections.emptyList();
	List<UrlList> values = new ArrayList<UrlList>();
	for(Map<String,Object> row : secondary) {
		values.add(new UrlList(
			(String)row.get("hostname"),
			(String)row.get("url"),
			(Integer)row.get("port"),
			(String)row.get("customHeader")));
	}
	return Collections.unmodifiableList(values);
}

/**
 * Change the property list of the UrlList Secondary ASP
 * @param listName Name of list to use
 * @throws ASPModificationException if list name provided is not available
 */
public void changeUrlListList(String listName) throws ASPModificationException {
	mASPService.setPrimaryASP("urlList", listName);
}

/**
 * Adds a new Row to the UrlList Secondary ASP
 * @param hostname field value
 * @param url field value
 * @param port field value
 * @param customHeader field value
 * @throws ASPModificationException if a row addition failure occurs
 */
public void addUrlListRow(String hostname, String url, int port, String customHeader) throws ASPModificationException {
	mASPService.addSecondaryASPRow("urlList",
			new Object[] { hostname, url, port, customHeader });
}

/**
 * Deletes an existing Row in the UrlList Secondary ASP
 * @param row index to remove
 * @throws ASPModificationException if a row deletion failure occurs
 */
public void deleteUrlListRow(int row) throws ASPModificationException {
	mASPService.deleteSecondaryASPRow("urlList", row);
}

/**
 * Modifies an existing Row to the UrlList Secondary ASP
 * @param row index to remove
 * @param hostname field value
 * @param url field value
 * @param port field value
 * @param customHeader field value
 * @throws ASPModificationException if a row addition failure occurs
 */
public void modifyUrlListRow(int row, String hostname, String url, int port, String customHeader) throws ASPModificationException {
	mASPService.modifySecondaryASPRow("urlList", row,
			new Object[] { hostname, url, port, customHeader });
}

/**
 * Clones the current UrlList secondary asp
 * @param cloneName is the name for the new list
 * @param listener to be called when clone operation completes
 */
public void cloneUrlList(String cloneName, ASPCloneNotificationListener listener) {
	mASPService.cloneSecondaryASP("urlList", cloneName, listener);
}

/**
 * Wrapper class for typesafe access of the UrlList row values
 */
public static class UrlList {

private final String mHostname;
private final String mUrl;
private final int mPort;
private final String mCustomHeader;

private UrlList(String hostname, String url, int port, String customHeader) {
	mHostname = hostname;
	mUrl = url;
	mPort = port;
	mCustomHeader = customHeader;
}
/**
* Implementation of the equals() method
*/
public boolean equals(Object o) {
	if (this == o) return true;
	if (!(o instanceof UrlList)) return false;
	UrlList urlList = (UrlList) o;

	if (mHostname != null ? !mHostname.equals(urlList.mHostname) : urlList.mHostname != null) return false;
	if (mUrl != null ? !mUrl.equals(urlList.mUrl) : urlList.mUrl != null) return false;
	if (mPort != urlList.mPort) return false;
	if (mCustomHeader != null ? !mCustomHeader.equals(urlList.mCustomHeader) : urlList.mCustomHeader != null) return false;
	return true;
}
/**
* Implementation of the hashCode() method
*/
public int hashCode() {
	int result =  (mHostname != null ? mHostname.hashCode() : 0);
	result = 31 * result + (mUrl != null ? mUrl.hashCode() : 0);
	result = 31 * result + mPort;
	result = 31 * result + (mCustomHeader != null ? mCustomHeader.hashCode() : 0);
	return result;
}

/**
 * Get hostname property value
 * @return String value
 */
public String getHostname() {
	return mHostname;
}

/**
 * Get url property value
 * @return String value
 */
public String getUrl() {
	return mUrl;
}

/**
 * Get port property value
 * @return int value
 */
public int getPort() {
	return mPort;
}

/**
 * Get customHeader property value
 * @return String value
 */
public String getCustomHeader() {
	return mCustomHeader;
}


} // end UrlList inner class

/**
 * Get the current FglamCollectorConfig  secondary asp list
 * @return read-only list of FglamCollectorConfig
 */
public List<FglamCollectorConfig> getFglamCollectorConfig() {
	List<Map<String,Object>> secondary = mASPService.getSecondaryASP("fglamCollectorConfig");
	if(secondary == null) return Collections.emptyList();
	List<FglamCollectorConfig> values = new ArrayList<FglamCollectorConfig>();
	for(Map<String,Object> row : secondary) {
		values.add(new FglamCollectorConfig(
			(String)row.get("name"),
			FglamCollectorConfig.MethodName.fromValue(((String)row.get("methodName"))),
			(Integer)row.get("interval"),
			FglamCollectorConfig.Unit.fromValue(((String)row.get("unit"))),
			(Integer)row.get("fastModeInterval"),
			FglamCollectorConfig.FastModeUnit.fromValue(((String)row.get("fastModeUnit"))),
			(Integer)row.get("fastModeMaxCount")));
	}
	return Collections.unmodifiableList(values);
}

/**
 * Change the property list of the FglamCollectorConfig Secondary ASP
 * @param listName Name of list to use
 * @throws ASPModificationException if list name provided is not available
 */
public void changeFglamCollectorConfigList(String listName) throws ASPModificationException {
	mASPService.setPrimaryASP("fglamCollectorConfig", listName);
}

/**
 * Adds a new Row to the FglamCollectorConfig Secondary ASP
 * @param name field value
 * @param methodName field value
 * @param interval field value
 * @param unit field value
 * @param fastModeInterval field value
 * @param fastModeUnit field value
 * @param fastModeMaxCount field value
 * @throws ASPModificationException if a row addition failure occurs
 */
public void addFglamCollectorConfigRow(String name, FglamCollectorConfig.MethodName methodName, int interval, FglamCollectorConfig.Unit unit, int fastModeInterval, FglamCollectorConfig.FastModeUnit fastModeUnit, int fastModeMaxCount) throws ASPModificationException {
	mASPService.addSecondaryASPRow("fglamCollectorConfig",
			new Object[] { name, methodName.getName(), interval, unit.getName(), fastModeInterval, fastModeUnit.getName(), fastModeMaxCount });
}

/**
 * Deletes an existing Row in the FglamCollectorConfig Secondary ASP
 * @param row index to remove
 * @throws ASPModificationException if a row deletion failure occurs
 */
public void deleteFglamCollectorConfigRow(int row) throws ASPModificationException {
	mASPService.deleteSecondaryASPRow("fglamCollectorConfig", row);
}

/**
 * Modifies an existing Row to the FglamCollectorConfig Secondary ASP
 * @param row index to remove
 * @param name field value
 * @param methodName field value
 * @param interval field value
 * @param unit field value
 * @param fastModeInterval field value
 * @param fastModeUnit field value
 * @param fastModeMaxCount field value
 * @throws ASPModificationException if a row addition failure occurs
 */
public void modifyFglamCollectorConfigRow(int row, String name, FglamCollectorConfig.MethodName methodName, int interval, FglamCollectorConfig.Unit unit, int fastModeInterval, FglamCollectorConfig.FastModeUnit fastModeUnit, int fastModeMaxCount) throws ASPModificationException {
	mASPService.modifySecondaryASPRow("fglamCollectorConfig", row,
			new Object[] { name, methodName.getName(), interval, unit.getName(), fastModeInterval, fastModeUnit.getName(), fastModeMaxCount });
}

/**
 * Clones the current FglamCollectorConfig secondary asp
 * @param cloneName is the name for the new list
 * @param listener to be called when clone operation completes
 */
public void cloneFglamCollectorConfig(String cloneName, ASPCloneNotificationListener listener) {
	mASPService.cloneSecondaryASP("fglamCollectorConfig", cloneName, listener);
}

/**
 * Wrapper class for typesafe access of the FglamCollectorConfig row values
 */
public static class FglamCollectorConfig {

private final String mName;
private final FglamCollectorConfig.MethodName mMethodName;
private final int mInterval;
private final FglamCollectorConfig.Unit mUnit;
private final int mFastModeInterval;
private final FglamCollectorConfig.FastModeUnit mFastModeUnit;
private final int mFastModeMaxCount;

private FglamCollectorConfig(String name, FglamCollectorConfig.MethodName methodName, int interval, FglamCollectorConfig.Unit unit, int fastModeInterval, FglamCollectorConfig.FastModeUnit fastModeUnit, int fastModeMaxCount) {
	mName = name;
	mMethodName = methodName;
	mInterval = interval;
	mUnit = unit;
	mFastModeInterval = fastModeInterval;
	mFastModeUnit = fastModeUnit;
	mFastModeMaxCount = fastModeMaxCount;
}
/**
* Implementation of the equals() method
*/
public boolean equals(Object o) {
	if (this == o) return true;
	if (!(o instanceof FglamCollectorConfig)) return false;
	FglamCollectorConfig fglamCollectorConfig = (FglamCollectorConfig) o;

	if (mName != null ? !mName.equals(fglamCollectorConfig.mName) : fglamCollectorConfig.mName != null) return false;
	if (mMethodName != fglamCollectorConfig.mMethodName) return false;
	if (mInterval != fglamCollectorConfig.mInterval) return false;
	if (mUnit != fglamCollectorConfig.mUnit) return false;
	if (mFastModeInterval != fglamCollectorConfig.mFastModeInterval) return false;
	if (mFastModeUnit != fglamCollectorConfig.mFastModeUnit) return false;
	if (mFastModeMaxCount != fglamCollectorConfig.mFastModeMaxCount) return false;
	return true;
}
/**
* Implementation of the hashCode() method
*/
public int hashCode() {
	int result =  (mName != null ? mName.hashCode() : 0);
	result = 31 * result + (mMethodName != null ? mMethodName.hashCode() : 0);
	result = 31 * result + mInterval;
	result = 31 * result + (mUnit != null ? mUnit.hashCode() : 0);
	result = 31 * result + mFastModeInterval;
	result = 31 * result + (mFastModeUnit != null ? mFastModeUnit.hashCode() : 0);
	result = 31 * result + mFastModeMaxCount;
	return result;
}

/**
 * Get name property value
 * @return String value
 */
public String getName() {
	return mName;
}

/**
 * Get MethodName property value
 * @return FglamCollectorConfig.MethodName value
 */
public FglamCollectorConfig.MethodName getMethodName() {
	return mMethodName;
}

/**
 * Get interval property value
 * @return int value
 */
public int getInterval() {
	return mInterval;
}

/**
 * Get Unit property value
 * @return FglamCollectorConfig.Unit value
 */
public FglamCollectorConfig.Unit getUnit() {
	return mUnit;
}

/**
 * Get fastModeInterval property value
 * @return int value
 */
public int getFastModeInterval() {
	return mFastModeInterval;
}

/**
 * Get FastModeUnit property value
 * @return FglamCollectorConfig.FastModeUnit value
 */
public FglamCollectorConfig.FastModeUnit getFastModeUnit() {
	return mFastModeUnit;
}

/**
 * Get fastModeMaxCount property value
 * @return int value
 */
public int getFastModeMaxCount() {
	return mFastModeMaxCount;
}


/**
 * Enum holding values for the methodName property.
 */
public enum MethodName {
	COLLECTMETRICS("collectMetrics");

	private final String mName;

	/**
	 * Create a MethodName enum with a string value.
	 * @param name value for this enum
	 */
	private MethodName(String name) {
		mName = name;
	}

	/**
	 * Get the name of this enum
	 * @return enum name string
	 */
	public String getName() {
		return mName;
	}

	/**
	 * Create an instance of MethodName
	 * If you are using labels when you defined your enum,
	 * then you must use the label value as the 'name' value in this method.
	 * Otherwise you may use the enum's constant name.
	 * @param name label value
	 * @return enum instance
	 */
	protected static MethodName fromValue(String name) {
		for (MethodName c: MethodName.values()) {
			if (c.getName().equals(name)) {
				return c;
			}
		}
		throw new IllegalArgumentException(name);
	}
}

/**
 * Enum holding values for the unit property.
 */
public enum Unit {
	MILLISECONDS("milliseconds"),
	SECONDS("seconds"),
	MINUTES("minutes"),
	HOURS("hours"),
	DAYS("days");

	private final String mName;

	/**
	 * Create a Unit enum with a string value.
	 * @param name value for this enum
	 */
	private Unit(String name) {
		mName = name;
	}

	/**
	 * Get the name of this enum
	 * @return enum name string
	 */
	public String getName() {
		return mName;
	}

	/**
	 * Create an instance of Unit
	 * If you are using labels when you defined your enum,
	 * then you must use the label value as the 'name' value in this method.
	 * Otherwise you may use the enum's constant name.
	 * @param name label value
	 * @return enum instance
	 */
	protected static Unit fromValue(String name) {
		for (Unit c: Unit.values()) {
			if (c.getName().equals(name)) {
				return c;
			}
		}
		throw new IllegalArgumentException(name);
	}
}

/**
 * Enum holding values for the fastModeUnit property.
 */
public enum FastModeUnit {
	MILLISECONDS("milliseconds"),
	SECONDS("seconds"),
	MINUTES("minutes"),
	HOURS("hours"),
	DAYS("days");

	private final String mName;

	/**
	 * Create a FastModeUnit enum with a string value.
	 * @param name value for this enum
	 */
	private FastModeUnit(String name) {
		mName = name;
	}

	/**
	 * Get the name of this enum
	 * @return enum name string
	 */
	public String getName() {
		return mName;
	}

	/**
	 * Create an instance of FastModeUnit
	 * If you are using labels when you defined your enum,
	 * then you must use the label value as the 'name' value in this method.
	 * Otherwise you may use the enum's constant name.
	 * @param name label value
	 * @return enum instance
	 */
	protected static FastModeUnit fromValue(String name) {
		for (FastModeUnit c: FastModeUnit.values()) {
			if (c.getName().equals(name)) {
				return c;
			}
		}
		throw new IllegalArgumentException(name);
	}
}

} // end FglamCollectorConfig inner class

public boolean equals(Object o) {
	if (this == o) return true;
	if (o == null || getClass() != o.getClass()) return false;
	final URLAvailabilityAgentPropertyWrapper that = (URLAvailabilityAgentPropertyWrapper) o;
	return mASPService.equals(that.mASPService);
}

public int hashCode() {
	return mASPService.hashCode();
}

public String toString() {
	return mASPService.toString();
}
}
