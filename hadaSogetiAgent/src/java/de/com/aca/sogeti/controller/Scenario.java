package de.com.aca.sogeti.controller;

public enum Scenario {
	IDCONTRAT, NOMCONTRAT, IDCLIENT, DESCRIPTION_OFFRE, ETATCONTRAT, PERIODICITE, 
	LOCATIONS, SITEID, 
	MEASURE_LIST, ID_DONNEEMESURE, VALEURMESUREE, REQUETE;
	
	public String toString() {
		return this.name();
	}
}
