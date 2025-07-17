# Employee Management System

A simple Employee Management System built with Java Spring Boot, Thymeleaf, and H2 in-memory database.

## Features
- Add, update, delete, and list employees
- Pagination for employee list
- Search employees by first name, last name, or email
- H2 in-memory database (no setup required)
- Thymeleaf-based UI

## Prerequisites
- Java 17 or higher
- Maven 3.6+

## Getting Started

### 1. Clone the Repository
```
git clone <your-repo-url>
cd Employee_Management_System/Employee_Management_System
```

### 2. Build the Project
```
mvn clean install -DskipTests
```

### 3. Run the Application
```
mvn spring-boot:run
```
Or, if you prefer to run the jar:
```
java -jar target/Employee-Management-System-0.0.1-SNAPSHOT.jar
```

### 4. Access the Application
- Open your browser and go to: [http://localhost:8080](http://localhost:8080)

### 5. H2 Database Console (for development/testing)
- Visit: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- JDBC URL: `jdbc:h2:mem:testdb`
- User Name: `sa`
- Password: *(leave blank)*

## Project Structure
```
Employee_Management_System/
  Employee_Management_System/
    src/
      main/
        java/com/ems/
          Controller/
          Entity/
          Repository/
          Service/
        resources/
          templates/
          application.properties
    pom.xml
```

## Main Files
- `Employee.java` - Employee entity
- `EmployeeRepository.java` - Spring Data JPA repository
- `EmployeeService.java` / `EmployeeServiceImpl.java` - Service layer
- `EmployeeController.java` - Web controller
- `templates/` - Thymeleaf HTML templates
- `application.properties` - App configuration

## Customization
- To use MySQL or another database, update `application.properties` and dependencies in `pom.xml`.
- To add more features, see the code comments and service/controller layers.

## License
This project is for educational/demo purposes.
