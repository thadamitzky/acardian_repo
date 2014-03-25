
package com.quest.fglam.example.time;

import javax.annotation.Generated;
import com.quest.glue.api.agent.CollectorAware;
import com.quest.glue.api.annotation.DevKitGenerated;


/**
 * WARNING:  THIS IS GENERATED CODE, DO NOT EDIT
 * 
 * This interface defines the set of methods that are required for a Cartridge Developer to implement
 * in order to enable Data Collection
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.10 (5.6.10-201309231246-312109-302)", date = "2013-09-23T12:51:31-0400")
@DevKitGenerated(productVersion = "5.6.10", buildNumber = "5.6.10-201309231246-312109-302", date = "2013-09-23T12:51:31-0400")
public interface TimeAgentCollectors
    extends CollectorAware
{


    /**
     * Normal Collection Data Collector
     * 
     * @param expectedFrequency
     *     The expected frequency expressed in milliseconds
     */
    void normalCollection(long expectedFrequency);

    /**
     * Full Detail Data Collector
     * 
     * @param expectedFrequency
     *     The expected frequency expressed in milliseconds
     */
    void fullDetailCollection(long expectedFrequency);

}
