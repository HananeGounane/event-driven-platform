# Event-Driven Microservices Platform

An event-driven microservices platform built with Quarkus, Apache Kafka, Docker, Terraform, Helm, and GitHub Actions.

The project demonstrates modern DevOps practices including:

- Microservices architecture
- Event-driven communication with Kafka
- Containerization with Docker
- Local orchestration with Docker Compose
- Infrastructure as Code with Terraform
- Kubernetes deployments using Helm
- CI/CD with GitHub Actions

---

## Architecture

```
                    +----------------+
                    |    Kafka       |
                    +-------+--------+
                            ^
                            |
             OrderCreated Event
                            |
+----------------+          |          +----------------------+
| Orders Service |----------+--------->| Notifications Service|
+----------------+                     +----------------------+
        |
        |
 REST API
```

---

## Project Structure

```text
.
├── .github/workflows/
├── terraform/
├── helm/
├── orders/
├── notifications/
├── docker-compose.yml
└── README.md
```

---

## Technologies

- Java 21
- Quarkus
- Apache Kafka (KRaft)
- Docker
- Docker Compose
- Maven
- Terraform
- Kubernetes
- Helm
- GitHub Actions

---

## Prerequisites

- Java 21
- Maven 3.9+
- Docker Desktop (or Docker Engine)
- Docker Compose

---

## Running Locally

### Clone

```bash
git clone <repository-url>
cd <repository>
```

### Build the services

```bash
cd orders
mvn clean package
cd ..

cd notifications
mvn clean package
cd ..
```

### Start the platform

```bash
docker compose up --build
```

or

```bash
docker compose up -d --build
```

---

## Verify the services

Orders

```
http://localhost:8080/q/health
```

Notifications

```
http://localhost:8081/q/health
```

Kafka

```
localhost:9092
```

---

## Stopping

```bash
docker compose down
```

Remove volumes

```bash
docker compose down -v
```

---