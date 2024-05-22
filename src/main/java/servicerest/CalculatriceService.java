package servicerest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("calculatrice")
public class CalculatriceService {

	@GET
	@Path("/ajouter/{a}/{b}")
	@Produces(MediaType.APPLICATION_JSON)
	public double Ajouter(@PathParam("a")double a,@PathParam("b") double b) {
		return a+b;
		
	}
	

}
