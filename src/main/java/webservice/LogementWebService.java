package webservice;

import metiers.LogementBusiness;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("logement/")
public class LogementWebService {
    public LogementBusiness logb= new LogementBusiness();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("list")
    public Response listLogement() {
        return Response.status(200).entity(logb.getLogements()).build();
    }
}
