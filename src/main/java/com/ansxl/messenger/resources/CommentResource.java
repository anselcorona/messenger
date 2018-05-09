package com.ansxl.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class CommentResource {
	
	@GET
	public String test(){
		return "testwww";
	}

}
