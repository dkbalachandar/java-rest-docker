package com.resource;

import com.model.User;
import com.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@AppKeyVerifier
@Path("users")
public class UserResource {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserResource.class);

    @Inject
    UserService userService;

    @GET
    @Path("get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User get(@PathParam("id") String id) throws Exception {
        LOGGER.debug("get method is called with id:{}", id);
        return userService.get(id);
    }
    @GET
    @Path("getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAll() throws Exception {
        LOGGER.debug("getAll method is called");
        return userService.getAll();
    }

    @POST
    @Path("add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String save(User user) throws Exception {
        LOGGER.debug("save method is called with user:{}", user);
        return userService.save(user);
    }

    @DELETE
    @Path("delete/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String remove(@PathParam("id") String id) throws Exception {
        LOGGER.debug("remove method is called with id:{}", id);
        return userService.remove(id);
    }

    @POST
    @Path("update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String update(User user) throws Exception {
        LOGGER.debug("update method is called with user:{}", user);
        return userService.update(user);
    }
}
