package com.vogella.jersey.jaxb;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PersonaDTO {
	private String nombre;
	private String apellido;
	private CiudadDTO ciudadDTO;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public CiudadDTO getCiudadDTO() {
		return ciudadDTO;
	}
	public void setCiudadDTO(CiudadDTO ciudadDTO) {
		this.ciudadDTO = ciudadDTO;
	}
	
	
	
}
