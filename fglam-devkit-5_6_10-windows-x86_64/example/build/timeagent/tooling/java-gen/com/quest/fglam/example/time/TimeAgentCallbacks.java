
package com.quest.fglam.example.time;

import javax.annotation.Generated;
import com.quest.glue.api.agent.CallbackAware;
import com.quest.glue.api.annotation.DevKitGenerated;


/**
 * WARNING:  THIS IS GENERATED CODE, DO NOT EDIT
 * 
 * This interface defines the set of methods that are export to the 
 * server for callbacks.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.10 (5.6.10-201309231246-312109-302)", date = "2013-09-23T12:51:31-0400")
@DevKitGenerated(productVersion = "5.6.10", buildNumber = "5.6.10-201309231246-312109-302", date = "2013-09-23T12:51:31-0400")
public interface TimeAgentCallbacks
    extends CallbackAware
{


    void resetSampleCount();

}
