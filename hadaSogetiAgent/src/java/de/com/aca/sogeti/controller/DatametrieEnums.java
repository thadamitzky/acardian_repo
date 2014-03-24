package de.com.aca.sogeti.controller;

public enum DatametrieEnums {
	IDCONTRAT, NOMCONTRAT, IDCLIENT, DESCRIPTION_OFFRE, ETATCONTRAT, PERIODICITE, 
	LOCATIONS, SITEID, 
	MEASURE_LIST, ID_DONNEEMESURE, VALEURMESUREE, REQUETE, NOMSITE, DESC_DONNEEMESURE;
	
	public String toString() {
		return this.name();
	}
}
