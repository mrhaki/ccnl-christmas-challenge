package nl.codecentric.xmascodechallenge.queries;

import nl.codecentric.xmascodechallenge.services.ChristmasImageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.io.IOException;

@Path("/xmas")
public class ChristmasQueries {

    private final ChristmasImageService christmasImageService = new ChristmasImageService();


    @GET
    @Path("/vibesAtCCNL")
    @Produces("image/jpeg")
    public byte[] getTheVibes() throws IOException {
        return christmasImageService.getChristmasImage();
    }
}
