package RestService.JavaBrains;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import OrderFlow.DelPackage;
import OrderFlow.InitiateDelivery;

@Path("helloWorld")
public class HelloWorld {
	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
	
	public String sayPlainTextHello() {
		return "Hello World RESTful!";
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return "<?xml version=\"1.0\"?>" + "<hello> Hello World - From OverWatch"
				+ "</hello>";
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() {
		return "<html> " + "<title>" + "Hello World - fROM OverWatch"
				+ "</title>" + "<body><h1>" + "Hello World - fROM OverWatch"
				+ "</body></h1>" + "</html> ";
	}*/
	
	InitiateDelivery initiateDelivery = new InitiateDelivery();
	
	//@GET
	//@Produces(MediaType.APPLICATION_XML)
	public List<DelPackage> getStatuses(){
		return initiateDelivery.getPackageStatus();
	}
}
