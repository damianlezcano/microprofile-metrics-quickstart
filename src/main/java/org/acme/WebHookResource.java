package org.acme;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/webhook")
public class WebHookResource {

    @POST
    @Path("/notify/")
    public Response postNotification(String notification) {
        System.out.println(String.format("Received request: %s", notification));
        return Response.status(201).entity(notification).build();
    }

}
