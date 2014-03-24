/*
  Copyright 2014 Dell Inc.
  ALL RIGHTS RESERVED.

  This software is the confidential and proprietary information of
  Dell Inc. ("Confidential Information").  You shall not
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

package de.com.aca.hada.agent;

import com.quest.glue.api.services.ServiceFactory;

/**
 * This is (one of) the concrete implementations of the datqa provider interfacer for the
 * hadaSogetiAgent agent.
 */
public class hadaSogetiAgentDataProviderImpl implements hadaSogetiAgentDataProvider {

private final ServiceFactory mServiceFactory;

public hadaSogetiAgentDataProviderImpl(ServiceFactory factory) {
    mServiceFactory = factory;
}

}