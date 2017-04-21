package risk.ws.rest;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import risk.app.model.User;

@Path("/service")
public class RestServices {
	
	@Context
	private HttpServletRequest httpRequest;
	
	 @GET
	 @Produces(MediaType.TEXT_HTML)
	 public String sayHtmlHello() {
	 return "<html> " + "<title>" + "Hello Jersey" + "</title>"
	 + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
	 }
	 
		@GET
		@Path("scopesTests")
		@Produces(MediaType.TEXT_HTML)
		public String scopesTests() {
			
			httpRequest.getServletContext().setAttribute("sessAtt", httpRequest.getServletContext().getServletContextName());
			//httpRequest.getServletContext().setAttribute("sess2", httpRequest.getSession().getServletContext().getServletContextName());
			
		return "service accompli";

		}
	 
		@GET
		@Path("nom-{nom}/id-{id}")
		@Produces(MediaType.APPLICATION_JSON)
		public User getMyBeanBis(@PathParam("nom") String myName, @PathParam("id") Long myId) {
			System.out.println("accessed JSON");
			User user = new User();
			user.setUsername(myName);
			user.setId(myId);
			user.setEmail("a.a@a.a");
			user.setPassword("0000");
			user.setScore(0);
			
			ArrayList<Long> gameIdList = new ArrayList<Long>();
			gameIdList.add(Long.valueOf(3));
			gameIdList.add(Long.valueOf(5));
			gameIdList.add(Long.valueOf(8));
			
			user.setGameIdList(gameIdList);

			System.out.println(user.getUsername());
			System.out.println(user.getId());
			return user;
			
			
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
