
package org.orders;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Order {
    public String id;
    public String product;
    public int quantity;
    public double price;
    
    public Order() {}

    public Order(String id, String product, int quantity, double price) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }
}