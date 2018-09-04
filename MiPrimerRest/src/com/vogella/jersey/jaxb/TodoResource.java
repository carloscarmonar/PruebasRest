package com.vogella.jersey.jaxb;


import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/todo")
public class TodoResource {
	// This method is called if XML is requested
    @GET
    @Path("/APPLICATION_XML")
    @Produces({MediaType.APPLICATION_XML})
    public Todo getXML() {
        Todo todo = new Todo();
        todo.setSummary("Application XML Todo Summary");
        todo.setDescription("Application XML Todo Description");
        return todo;
    }

    // This method is called if JSON is requested
    @GET
    @Path("/APPLICATION_JSON")
    @Produces({MediaType.APPLICATION_JSON})
    public Todo getJSON() {
        Todo todo = new Todo();
        todo.setSummary("Application JSON Todo Summary");
        todo.setDescription("Application JSON Todo Description");
        return todo;
    }

    // This can be used to test the integration with the browser
    @GET
    @Path("/TEXT_XML")
    @Produces({ MediaType.TEXT_XML })
    public Todo getHTML() {
        Todo todo = new Todo();
        todo.setSummary("XML Todo Summary");
        todo.setDescription("XML Todo Description");
        return todo;
    }
    
    @GET
    @Path("/personas")
    @Produces({MediaType.APPLICATION_JSON})
    public ArrayList<PersonaDTO> personas() {
    	
    	ArrayList<PersonaDTO> lista = new ArrayList<>();
    	PersonaDTO personaDTO = new PersonaDTO();
    	personaDTO.setNombre("Carlos");
    	personaDTO.setApellido("Carmona");
    	CiudadDTO ciudadDTO = new CiudadDTO();
    	ciudadDTO.setNombreCiudad("Rionegro");
    	personaDTO.setCiudadDTO(ciudadDTO);
    	
    	lista.add(personaDTO);
    	
    	PersonaDTO personaDTO1 = new PersonaDTO();
    	personaDTO1.setNombre("Mamá");
    	personaDTO1.setApellido("Tequiero");
    	CiudadDTO ciudadDTO1 = new CiudadDTO();
    	ciudadDTO1.setNombreCiudad("Montones");
    	personaDTO1.setCiudadDTO(ciudadDTO);
    	
    	lista.add(personaDTO1);
    	
    	return lista;
    }
}
