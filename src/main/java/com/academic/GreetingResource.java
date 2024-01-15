package com.academic;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        System.out.println("Hello from RESTEasy Reactive");
        System.out.println("Hello from console");
        System.out.println("Hello from con");
        System.out.println("Hello from conaaa");
        return "Hello from RESTEasy Reactive";
    }
}
