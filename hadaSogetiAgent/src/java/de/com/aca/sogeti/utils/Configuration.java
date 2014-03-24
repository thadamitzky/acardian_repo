package de.com.aca.sogeti.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;


public class Configuration {
	
	private String filePath = "C:\\temp\\steps.txt";
	private static Configuration instance = new Configuration();
	private Properties arguments = new Properties();
	
	public Configuration() {
		try {
			File file = new File(filePath);
			BufferedInputStream is = new BufferedInputStream(new FileInputStream(file));
			arguments.load(is);
			System.out.println("Die Datei (" + filePath + ") wurde erfolgreich gelesen!");
		} catch (Exception e) {
			System.out.println("Die Datei (" + filePath + ") konnte nicht geladen werden, die Defaultwerte werden benutzt!");
		}
	}
	
	
	
	public void load(String filePath) {

	}
	
	
	/**
	 * Statische Methode, liefert die einzige Instanz dieser Klasse zurueck
	 */

	public static Configuration getInstance() {
		return instance;
	}
	
	public String getValue(String key) {
		return arguments.getProperty(key);
	}
	
	public HashMap<String, String>  getProperties() {
		
		HashMap<String, String> retval = new HashMap<String,String>();
		for (final String name: arguments.stringPropertyNames())
			retval.put(name, arguments.getProperty(name));		   
		return retval;
	}

}
