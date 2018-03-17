package RestService.JavaBrains;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import OrderFlow.DelPackage;

@Path("OverWatch001")
@Produces(MediaType.APPLICATION_XML)
public class OverWatchHelloMain {
	//private static final String webServiceURI = "http://localhost:8080/RESTful_Jersey_Hello_World";
	HelloWorld helloTt = new HelloWorld();
	HelloWorld goTt = new HelloWorld();
	List<DelPackage> list = new ArrayList<DelPackage>();
	
	@GET
	public List<DelPackage> deliver() {
		
//		ClientConfig clientConfig = new ClientConfig();
//		Client client = ClientBuilder.newClient(clientConfig);
//		URI serviceURI = UriBuilder.fromUri(webServiceURI).build();
//		WebTarget webTarget = client.target(serviceURI);
		//System.out.println("Hello");
		
		//helloTt.sayPlainTextHello();
		//helloTt.sayXMLHello();
		//helloTt.sayHtmlHello();
		
		
		list=goTt.getStatuses();

		/*// response
		System.out.println(webTarget.path("rest").path("helloworld").request()
				.accept(MediaType.TEXT_PLAIN).get(Response.class).toString());

		// text
		System.out.println(webTarget.path("rest").path("helloworld").request()
				.accept(MediaType.TEXT_PLAIN).get(String.class));

		// xml
		System.out.println(webTarget.path("rest").path("helloworld").request()
				.accept(MediaType.TEXT_XML).get(String.class));

		// html
		System.out.println(webTarget.path("rest").path("helloworld").request()
				.accept(MediaType.TEXT_HTML).get(String.class));*/
		return list;
	}
	
	@PUT
	public List<DelPackage> initiateDelivery() {
		list=goTt.getStatuses();
		return list;
		}
}
