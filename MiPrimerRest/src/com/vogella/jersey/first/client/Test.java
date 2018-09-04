package com.vogella.jersey.first.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class Test {
	public static void main(String[] args) {
		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(UriBuilder.fromUri("http://localhost:8080/MiPrimerRest/rest/hello").build());

		String response = target.path("hello1").request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString();

		String plainAnswer = target.path("hello1").request().accept(MediaType.TEXT_PLAIN).get(String.class);
		String xmlAnswer = target.path("hello2").request().accept(MediaType.TEXT_XML).get(String.class);
		String htmlAnswer = target.path("hello3").request().accept(MediaType.TEXT_HTML).get(String.class);

		System.out.println(response);
		System.out.println(plainAnswer);
		System.out.println(xmlAnswer);
		System.out.println(htmlAnswer);
	}
}
