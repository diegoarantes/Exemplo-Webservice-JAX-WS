package ws;

import com.google.gson.Gson;
import entities.Carro;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author D.ARANTES
 */
@Path("teste")
public class TesteWS {

    @Context
    private UriInfo context;

    public TesteWS() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        
        Carro car = new Carro();
        
        car.setNome("Belmonte louco");
        car.setPreco(10000);
        
        List<Carro> carros = new ArrayList<>();
        
        carros.add(car);
        
        Gson g = new Gson();
        
        
       return g.toJson(carros);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
