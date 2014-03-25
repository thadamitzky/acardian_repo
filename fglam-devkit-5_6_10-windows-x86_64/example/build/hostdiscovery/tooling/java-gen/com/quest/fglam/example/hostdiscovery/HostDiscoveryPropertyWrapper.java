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
package com.quest.fglam.example.hostdiscovery;

import com.quest.glue.api.annotation.DevKitGenerated;
import com.quest.glue.api.services.*;
import java.util.*;
import javax.annotation.Generated;

/**
 * Wraps the defined Agent properties set in a typesafe implementation
 * that can be used when deploying on SPID.
 */
@Generated(value = "FglAM Developer's Kit 5.6.10 (5.6.10-201309231246-312109-302)", date = "2013-09-23T12:51:47-0400")
@DevKitGenerated(productVersion = "5.6.10", buildNumber = "5.6.10-201309231246-312109-302", date = "2013-09-23T12:51:47-0400")
public class HostDiscoveryPropertyWrapper {

private final ASPService3 mASPService;

/**
 * Creates a new instance of the PropertyWrapper around the ASPService forHostDiscovery agent
 * @param service delegate instance
 */
public HostDiscoveryPropertyWrapper(ASPService3 service) {
	mASPService = service;
}


/**
 * Get local property value
 * @return local value
 */
public boolean getLocal() {
	Object property = mASPService.getPrimaryASP("local");
	return ((Integer)property) == 1;
}

/**
 * Set the local property value
 * @param local field value
 * @throws ASPModificationException if set failure occurs
 */
public void setLocal(boolean local) throws ASPModificationException {
	mASPService.setPrimaryASP("local", local ? 1 : 0);
}

/**
 * Get osinfo property value
 * @return osinfo value
 */
public boolean getOsinfo() {
	Object property = mASPService.getPrimaryASP("osinfo");
	return ((Integer)property) == 1;
}

/**
 * Set the osinfo property value
 * @param osinfo field value
 * @throws ASPModificationException if set failure occurs
 */
public void setOsinfo(boolean osinfo) throws ASPModificationException {
	mASPService.setPrimaryASP("osinfo", osinfo ? 1 : 0);
}

/**
 * Get timeout property value
 * @return timeout value
 */
public int getTimeout() {
	Object property = mASPService.getPrimaryASP("timeout");
	return (Integer) property;
}

/**
 * Set the timeout property value
 * @param timeout field value
 * @throws ASPModificationException if set failure occurs
 */
public void setTimeout(int timeout) throws ASPModificationException {
	mASPService.setPrimaryASP("timeout", timeout);
}

/**
 * Get the current Subnets  secondary asp list
 * @return read-only list of Subnets
 */
public List<Subnets> getSubnets() {
	List<Map<String,Object>> secondary = mASPService.getSecondaryASP("subnets");
	if(secondary == null) return Collections.emptyList();
	List<Subnets> values = new ArrayList<Subnets>();
	for(Map<String,Object> row : secondary) {
		values.add(new Subnets(
			(String)row.get("address"),
			(String)row.get("mask")));
	}
	return Collections.unmodifiableList(values);
}

/**
 * Change the property list of the Subnets Secondary ASP
 * @param listName Name of list to use
 * @throws ASPModificationException if list name provided is not available
 */
public void changeSubnetsList(String listName) throws ASPModificationException {
	mASPService.setPrimaryASP("subnets", listName);
}

/**
 * Adds a new Row to the Subnets Secondary ASP
 * @param address field value
 * @param mask field value
 * @throws ASPModificationException if a row addition failure occurs
 */
public void addSubnetsRow(String address, String mask) throws ASPModificationException {
	mASPService.addSecondaryASPRow("subnets",
			new Object[] { address, mask });
}

/**
 * Deletes an existing Row in the Subnets Secondary ASP
 * @param row index to remove
 * @throws ASPModificationException if a row deletion failure occurs
 */
public void deleteSubnetsRow(int row) throws ASPModificationException {
	mASPService.deleteSecondaryASPRow("subnets", row);
}

/**
 * Modifies an existing Row to the Subnets Secondary ASP
 * @param row index to remove
 * @param address field value
 * @param mask field value
 * @throws ASPModificationException if a row addition failure occurs
 */
public void modifySubnetsRow(int row, String address, String mask) throws ASPModificationException {
	mASPService.modifySecondaryASPRow("subnets", row,
			new Object[] { address, mask });
}

/**
 * Clones the current Subnets secondary asp
 * @param cloneName is the name for the new list
 * @param listener to be called when clone operation completes
 */
public void cloneSubnets(String cloneName, ASPCloneNotificationListener listener) {
	mASPService.cloneSecondaryASP("subnets", cloneName, listener);
}

/**
 * Wrapper class for typesafe access of the Subnets row values
 */
public static class Subnets {

private final String mAddress;
private final String mMask;

private Subnets(String address, String mask) {
	mAddress = address;
	mMask = mask;
}
/**
* Implementation of the equals() method
*/
public boolean equals(Object o) {
	if (this == o) return true;
	if (!(o instanceof Subnets)) return false;
	Subnets subnets = (Subnets) o;

	if (mAddress != null ? !mAddress.equals(subnets.mAddress) : subnets.mAddress != null) return false;
	if (mMask != null ? !mMask.equals(subnets.mMask) : subnets.mMask != null) return false;
	return true;
}
/**
* Implementation of the hashCode() method
*/
public int hashCode() {
	int result =  (mAddress != null ? mAddress.hashCode() : 0);
	result = 31 * result + (mMask != null ? mMask.hashCode() : 0);
	return result;
}

/**
 * Get address property value
 * @return String value
 */
public String getAddress() {
	return mAddress;
}

/**
 * Get mask property value
 * @return String value
 */
public String getMask() {
	return mMask;
}


} // end Subnets inner class

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
			(String)row.get("interval"),
			FglamCollectorConfig.Unit.fromValue(((String)row.get("unit"))),
			(String)row.get("fastModeInterval"),
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
public void addFglamCollectorConfigRow(String name, FglamCollectorConfig.MethodName methodName, String interval, FglamCollectorConfig.Unit unit, String fastModeInterval, FglamCollectorConfig.FastModeUnit fastModeUnit, int fastModeMaxCount) throws ASPModificationException {
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
public void modifyFglamCollectorConfigRow(int row, String name, FglamCollectorConfig.MethodName methodName, String interval, FglamCollectorConfig.Unit unit, String fastModeInterval, FglamCollectorConfig.FastModeUnit fastModeUnit, int fastModeMaxCount) throws ASPModificationException {
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
private final String mInterval;
private final FglamCollectorConfig.Unit mUnit;
private final String mFastModeInterval;
private final FglamCollectorConfig.FastModeUnit mFastModeUnit;
private final int mFastModeMaxCount;

private FglamCollectorConfig(String name, FglamCollectorConfig.MethodName methodName, String interval, FglamCollectorConfig.Unit unit, String fastModeInterval, FglamCollectorConfig.FastModeUnit fastModeUnit, int fastModeMaxCount) {
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
	if (mInterval != null ? !mInterval.equals(fglamCollectorConfig.mInterval) : fglamCollectorConfig.mInterval != null) return false;
	if (mUnit != fglamCollectorConfig.mUnit) return false;
	if (mFastModeInterval != null ? !mFastModeInterval.equals(fglamCollectorConfig.mFastModeInterval) : fglamCollectorConfig.mFastModeInterval != null) return false;
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
	result = 31 * result + (mInterval != null ? mInterval.hashCode() : 0);
	result = 31 * result + (mUnit != null ? mUnit.hashCode() : 0);
	result = 31 * result + (mFastModeInterval != null ? mFastModeInterval.hashCode() : 0);
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
 * @return String value
 */
public String getInterval() {
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
 * @return String value
 */
public String getFastModeInterval() {
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
	SCANNOW("scanNow");

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
	DAYS("days"),
	CRON("cron");

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
	DAYS("days"),
	CRON("cron");

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
	final HostDiscoveryPropertyWrapper that = (HostDiscoveryPropertyWrapper) o;
	return mASPService.equals(that.mASPService);
}

public int hashCode() {
	return mASPService.hashCode();
}

public String toString() {
	return mASPService.toString();
}
}
