package org.orders;
import java.util.UUID;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/orders")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OrderResource {

    @Inject
    @Channel("order-requests")
    Emitter<Order> orderEmitter;

    
    @POST
    public Response createOrder(Order order) {
        order.id = UUID.randomUUID().toString();
        orderEmitter.send(order);
        return Response.status(Response.Status.ACCEPTED).entity(order).build();
    }
}