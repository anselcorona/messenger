package com.ansxl.messenger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentResource {
	
	@GET
	public String test(){
		return "testwww";
	}
	
	@GET
	@Path("/{commentId}")
	public String test2(@PathParam("commentID") int commentID) {
		return "Method to return commentID " + commentID;
	}

}
