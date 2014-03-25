
package com.quest.fglam.example.url.samples;

import javax.annotation.Generated;


/**
 * WARNING:  THIS IS GENERATED CODE, DO NOT EDIT
 * <p/>
 * This enumeration contains no data of its own,
 * but is used by other topology classes.
 * <p/>
 * This class was generated using version 5.6.10 (5.6.10-201309231246-312109-302) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.10 (5.6.10-201309231246-312109-302)", date = "2013-09-23T12:52:03-0400")
public enum HostDiscoveryStatus {

    INACTIVE("Inactive", "0", "1"),
    ACTIVE("Active", "1", "0");
    private final String mName;
    private final String mValue;
    private final String mIndex;

    private HostDiscoveryStatus(String name, String value, String index) {
        mName = name;
        mValue = value;
        mIndex = index;
    }

    public String getName() {
        return mName;
    }

    public String getValue() {
        return mValue;
    }

    public String getIndex() {
        return mIndex;
    }

}
