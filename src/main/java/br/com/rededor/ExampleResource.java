package br.com.rededor;

import br.com.rededor.entidades.Sistema;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class ExampleResource {

    @GET
    public String hello() {
        return "hello";
    }
}