package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

@ApplicationScoped
public class NotificationConsumer {

    private static final Logger LOG = Logger.getLogger(NotificationConsumer.class);

    @Incoming("order-events")
    public void consume(Order order) {
        LOG.infof("🎉 NOTIFICATION RECEIVED: Order %s for %d x %s ($%.2f) processed successfully!", 
            order.id, order.quantity, order.product, order.price);
    }
}