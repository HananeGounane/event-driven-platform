# Orders Service (Microservice)

An event-driven microservice built with **Quarkus (Java)** that handles customer checkout requests and publishes order events to an Apache Kafka broker.

## Tech Stack
* **Framework:** Quarkus 3.37 (Reactive/Cloud-Native Java)
* **Messaging:** SmallRye Reactive Messaging (Apache Kafka Client)
* **Serialization:** Jackson (JSON processing)

## Architecture Flow
1. Receives an HTTP POST request at `/orders` with order details.
2. Validates and processes the order.
3. Emits an `Order` event payload into the `orders` Kafka topic asynchronously.

## Local Development
To run this service in development mode:
```bash
./mvnw quarkus:dev