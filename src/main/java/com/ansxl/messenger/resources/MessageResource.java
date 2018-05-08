package com.ansxl.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ansxl.messenger.services.MessageService;
import com.ansxl.messenger.model.Message;

@Path("/messages")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	public List<Message> getAllMessages(){
		return messageService.getAllMessages();
	}
	
	@POST
	public Message addMessage(Message m){
		return messageService.addMessage(m);
	}
	
	
	@GET
	@Path("/{messageId}")
	public Message test(@PathParam("messageId") long messageId){
		return messageService.getMessage(messageId);
	}
	
	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") long messageId, Message message){
		message.setId(messageId);
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	public void deleteMessage(@PathParam("messageId") long messageId){
		messageService.removeMessage(messageId);
	}
	
}