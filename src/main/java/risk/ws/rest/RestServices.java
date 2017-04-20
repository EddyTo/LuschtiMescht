package risk.ws.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import risk.app.model.MyBean;

@Path("/service")
public class RestServices {
	
	 @GET
	 @Produces(MediaType.TEXT_HTML)
	 public String sayHtmlHello() {
	 return "<html> " + "<title>" + "Hello Jersey" + "</title>"
	 + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
	 }
	 
		@GET
		@Path("nom-{nom}/age-{age}")
		@Produces(MediaType.APPLICATION_JSON)
		public MyBean getMyBeanBis(@PathParam("nom") String myName, @PathParam("age") int myAge) {
			System.out.println("accessed JSON");
			MyBean karim = new MyBean();
			karim.setName(myName);
			karim.setAge(myAge);
			System.out.println(karim.name);
			System.out.println(karim.age);
			return karim;
		}

//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public MyBean getMyBean() {
//		System.out.println("accessed JSON 2");
//		MyBean karim = new MyBean();
//		karim.setName("Karim");
//		karim.setAge("31");
////		System.out.println(karim.name);
////		System.out.println(karim.age);
//		return karim;
//	}
	
}
