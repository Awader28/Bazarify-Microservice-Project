# Bazarify Microservices Project

Bazarify is a microservices-based application designed to manage customer data, orders, and shipping details. This project demonstrates the use of Spring Boot, Spring Data JPA, MySQL, and Spring Cloud for building scalable and maintainable applications.

## Technologies Used
- **Java 8+**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Spring Cloud Netflix Eureka**
- **Feign Client**
- **Spring Web**

## Microservices
### Customer Service
Manages customer data.
- **Endpoints:**
  - `GET /customers` - Retrieve all customers
  - `GET /customers/{id}` - Retrieve customer by ID
  - `POST /customers` - Create a new customer
  - `PUT /customers/{id}` - Update an existing customer
  - `DELETE /customers/{id}` - Delete a customer

### Order Service
Manages orders associated with customers.
- **Endpoints:**
  - `GET /orders` - Retrieve all orders
  - `GET /orders/{id}` - Retrieve order by ID
  - `POST /orders` - Create a new order
  - `PUT /orders/{id}` - Update an existing order
  - `DELETE /orders/{id}` - Delete an order

### Shipping Service
Manages shipping details for orders.
- **Endpoints:**
  - `GET /shippings/order/{orderId}` - Retrieve shipping details by order ID
  - `POST /shippings` - Create new shipping details
  - `DELETE /shippings/{id}` - Delete shipping details

## Setup Instructions
1. **Clone the repository:**
   ```sh
   git clone 
## Navigate to the project directory:
cd bazarify
## Update application properties:
Modify src/main/resources/application.properties with your MySQL configuration and Eureka server details.
Run the services:
Navigate to each service directory (Customer, Order, Shipping) and run:
mvn spring-boot:run
## Eureka Server Setup
Navigate to the Eureka server directory:
cd eureka-server
Run the Eureka server:


mvn spring-boot:run
## Inter-Service Communication
- Feign Client is used for communication between services.
- Ensure the Eureka server is running for service discovery.
License
This project is licensed under the MIT License
