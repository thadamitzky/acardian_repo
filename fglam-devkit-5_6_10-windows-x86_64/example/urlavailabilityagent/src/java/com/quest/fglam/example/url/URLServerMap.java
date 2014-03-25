/*
 * Copyright 2013 Dell Inc.
 * ALL RIGHTS RESERVED.
 * 
 * This software is the confidential and proprietary information of
 * Dell Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered
 * into with Dell Inc.
 * 
 * DELL INC. MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT
 * THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
 * NON-INFRINGEMENT. DELL SHALL NOT BE LIABLE FOR ANY
 * DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING
 * OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */

package com.quest.fglam.example.url;

import com.quest.fglam.example.url.URLAvailabilityAgentPropertyWrapper.UrlList;

import java.util.*;

/**
 * Creates a map of url server hosts associated with a list of port numbers and urls
 */
public class URLServerMap {

private Map<String, Map<Integer, List<UrlList>>> mURLServerMap = new HashMap<String, Map<Integer, List<UrlList>>>();

public URLServerMap(List<UrlList> urlList) {
    for(UrlList urlEntry : urlList) {
        String hostname = urlEntry.getHostname();
        Integer port = urlEntry.getPort();
        Map<Integer, List<UrlList>> portMap = mURLServerMap.get(hostname);
        if(portMap == null) {
            portMap = new HashMap<Integer, List<UrlList>>();
            mURLServerMap.put(hostname, portMap);
        }
        List<UrlList> subList = portMap.get(port);
        if(subList == null) {
            subList = new ArrayList<UrlList>();
            portMap.put(port, subList);
        }
        subList.add(urlEntry);
    }
}

/**
 *  Returns a list of port #s and Urls 
 *
 * @param hostname
 * @param port
 * @return
 */
public List<UrlList> getURLList(String hostname, Integer port) {
    Map<Integer, List<UrlList>> portMap = mURLServerMap.get(hostname);
    if(portMap != null) {
        return portMap.get(port);
    } else {
        return null;
    }
}

/**
 * Returns a set of hostnames used as keys
 * 
 * @return
 */
public Set<String> getHostnameList() {
    return mURLServerMap.keySet();
}

/**
 * Returns a set of port #s
 *
 * @param hostname
 * @return
 */
public Set<Integer> getPortList(String hostname) {
    Map<Integer, List<UrlList>> portMap = mURLServerMap.get(hostname);
    if(portMap!=null) {
        return portMap.keySet();
    } else {
        return null;
    }
}
}
