# Cab Booking Application

## Overview

The **Cab Booking Application** is a robust backend solution designed using **Spring Boot** and **Apache Kafka**. This application simulates a cab booking system where users can book cabs and receive real-time updates on their cab's location. The application demonstrates the seamless integration of Spring Boot with Kafka for event-driven architecture, showcasing the capability of microservices to communicate asynchronously.

## Table of Contents

- [Features](#features)
- [Architecture](#architecture)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [How It Works](#how-it-works)
- [Kafka Integration](#kafka-integration)
- [License](#license)

## Features

- **Real-time Location Updates**: The application continuously updates the location of the cab after it has been booked.
- **Event-Driven Architecture**: Utilizes Apache Kafka for asynchronous communication between services.
- **Microservices**: The application is designed in a microservices architecture, facilitating scalability and maintainability.

## Architecture

The application consists of two main microservices:

1. **Cab Book Driver**: Handles cab-related operations, including location updates and driver notifications.
2. **Cab Book User**: Manages user interactions, including cab bookings and notifications.

These microservices communicate via Kafka, enabling decoupled and scalable architecture.

## Technologies Used

- **Spring Boot**: Framework for building the backend services with ease and flexibility.
- **Apache Kafka**: A distributed streaming platform used for building real-time data pipelines and streaming applications.
- **Java**: The primary programming language used for developing the application.

## Setup and Installation

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/madhan1939/Cab-Booking.git
   cd Cab-Booking
   ```

2. **Build the Application**:

   Navigate to each service directory (`cab-book-driver` and `cab-book-user`) and build the application using Maven:

   ```bash
   cd cab-book-driver
   ./mvnw clean install
   cd ../cab-book-user
   ./mvnw clean install
   ```

3. **Run the Application**:

   You can run each microservice by executing:

   ```bash
   cd cab-book-driver
   ./mvnw spring-boot:run
   ```

   and for the user service:

   ```bash
   cd cab-book-user
   ./mvnw spring-boot:run
   ```

4. **Kafka Setup**:

   Ensure you have Kafka running locally. You can download Kafka from the [Apache Kafka website](https://kafka.apache.org/downloads) and start the Kafka server by following the instructions provided in the Kafka documentation.

## How It Works

It is just a simulation of live location update of cab booking app. Upon booking a cab, the user service sends a request to the driver service. The driver service then produces events to a Kafka topic with updates on the cab's location. The user service consumes these events and provides real-time updates to the user about the cab's location until the cab reaches the user's destination.

## Kafka Integration

The application utilizes Kafka for the following:

- **Producing Events**: The cab's location updates are produced as events and published to a specific Kafka topic.
- **Consuming Events**: The user service listens to the Kafka topic to receive location updates and process them accordingly.

The integration with Kafka allows the application to handle high-throughput, real-time data streams effectively, ensuring a responsive user experience.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
```
