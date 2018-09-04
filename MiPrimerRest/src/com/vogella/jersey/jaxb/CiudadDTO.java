package com.vogella.jersey.jaxb;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CiudadDTO {
	private String nombreCiudad;

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	
	
}
