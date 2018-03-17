package Test.RestService.RespApiTake2;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("newResource")
public class MessageResource {
	ParseMessages parseMessages = new ParseMessages();
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		return "Hello OverWatch!!!!";
	}
	
	@Path("/messageList")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Messages> getAllMessages(@QueryParam("Status") String status){
		//ParseMessages parseMessages = new ParseMessages();
		if(status != null) return parseMessages.getAllMessagesWithStatus(status);
		return parseMessages.getAllMessages();
	}
	
	@Path("/{messageId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Messages getStatusMessage(@PathParam("messageId") String id) {
		
		return parseMessages.getMessage(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Messages addMessage(Messages m) {
		return parseMessages.addMessage(m);
	}
	
	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Messages> updateMessage(@PathParam("messageId") String id, Messages m) {
		return parseMessages.updateMessage(m.getId(), m.getStatus());
	}

}
