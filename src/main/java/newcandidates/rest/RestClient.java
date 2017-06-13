package newcandidates.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rest/user-name")
public class RestClient {

	private static final String HELLO = "Hello ";

	@GET
	@Path("/{user}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getUserName(@PathParam("user") String userName) {
		return HELLO + userName;
	}

}
