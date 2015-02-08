package org.lick.me.jaxrs.quickstart;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Test resource (exposed at "api/test" path)
 */
@Path("test")
public class Test {

	/**
	 * Redirect to application.wadl as a convenience.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String get() {
		return "This is just a test.";
	}

}