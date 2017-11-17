package com.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Path("/config")
public class GitConfigResource {

    static Properties properties = new Properties();
    static{
        try (InputStream is = GitConfigResource.class.getClassLoader()
                .getResourceAsStream("git.properties")) {
            properties.load(is);
        }
        catch (IOException io) {
            io.printStackTrace();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getConfig(){
        return Response.ok().entity(properties).build();
    }
}
