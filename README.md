# MapPortal

## Overview
MapPortal is a demo project built using Spring Boot. It provides a portal for managing programs, patients, workflows, and matches.

## Technologies Used
- **Java 17**
- **Spring Boot 3.4.5**
  - Spring Boot Starter Data JPA
  - Spring Boot Starter Web
  - Spring Boot DevTools
  - Spring Boot Starter Test
- **PostgreSQL** (Database)
- **Lombok** (for reducing boilerplate code)
- **Maven** (Build tool)

## Prerequisites
- Java 17 or higher
- Maven installed
- PostgreSQL database running

## Database Configuration
Update the `application.properties` file with your database credentials:
```properties
spring.datasource.url=jdbc:postgresql://<HOST>:<PORT>/<DATABASE_NAME>
spring.datasource.username=<USERNAME>
spring.datasource.password=<PASSWORD>
```

## How to Run the Application
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd mapportal
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## Features
- Manage programs, patients, workflows, and matches.
- RESTful APIs for CRUD operations.

## Testing
Run the tests using:
```bash
mvn test
```

## License
This project is licensed under the MIT License.