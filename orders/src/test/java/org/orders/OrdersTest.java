package org.orders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class OrdersTest {
    @Test
    void constructorTest() {
        Order order1 = new Order("prod1", "test", 10, 20);
        assertEquals("prod1", order1.id);
        assertEquals("test", order1.product);
        assertEquals(10, order1.quantity);
        assertEquals(20, order1.price);
    }
}