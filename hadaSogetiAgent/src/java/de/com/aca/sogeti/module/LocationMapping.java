package de.com.aca.sogeti.module;

import java.util.HashMap;

public class LocationMapping {

	private HashMap<String, String> idToName;

	public LocationMapping(HashMap<String, String> idname) {
		if (idname == null) {
			idToName = new HashMap<String, String>();
		}
		else {
			idToName = idname;
		}
	}

	
	
	public String getName(String id) {
		String name = idToName.get(id);
		if (name == null) {
			return id;
		}
		else {
			return name;
		}
	}
}
