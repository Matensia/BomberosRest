package ar.edu.ubp.das.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/ping")
@Produces(MediaType.APPLICATION_JSON)
public class PingResource {
	
	@GET
	public Response getPing() {
		return Response.status(Response.Status.OK).entity("pong").build();
	}
}