
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
public enum HostServiceState {

    STOPPED("Stopped", "Stopped", "1"),
    START_PENDING("Start Pending", "Start Pending", "2"),
    STOP_PENDING("Stop Pending", "Stop Pending", "3"),
    RUNNING("Running", "Running", "4"),
    CONTINUE_PENDING("Continue Pending", "Continue Pending", "5"),
    PAUSE_PENDING("Pause Pending", "Pause Pending", "6"),
    PAUSED("Paused", "Paused", "7"),
    UNKNOWN("Unknown", "Unknown", "8");
    private final String mName;
    private final String mValue;
    private final String mIndex;

    private HostServiceState(String name, String value, String index) {
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
