package org.orders;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;
@QuarkusTest
class OrderResourceTest {

    @Test
    void shouldCreateOrder() {

        String order = """
                {
                    "product": "Laptop",
                    "quantity": 2,
                    "price": 10
                }
                """;

        given()
            .contentType("application/json")
            .body(order)
        .when()
            .post("/orders")
        .then()
            .statusCode(202)
            .body("id", notNullValue())
            .body("product", equalTo("Laptop"))
            .body("quantity", equalTo(2))
            .body("price", equalTo(10));
    }
}