# EMS Backend

This project is the backend service for an Employee Management System (EMS), built with **Spring Boot**, **Java**, **Lombok**, and **MySQL**. It provides a robust foundation for managing employee data and operations with full support for CRUD (Create, Read, Update, Delete) functionality.

## Features
- **RESTful API**: Provides endpoints for managing employees, enabling seamless integration with the frontend.
- **Database Integration**: Utilizes MySQL for persistent data storage.
- **Object-Relational Mapping (ORM)**: Powered by JPA and Hibernate for efficient database operations.
- **Clean Architecture**: Follows industry-standard practices for scalability and maintainability.
- **Lombok Integration**: Reduces boilerplate code, ensuring a cleaner and more readable codebase.

## Technologies Used
- **Spring Boot 3**: Framework for building enterprise-grade applications.
- **Java**: Core language for backend development.
- **MySQL**: Relational database management system.
- **Lombok**: Simplifies model class implementation by auto-generating getters, setters, and constructors.
- **Spring Data JPA**: Simplifies data access and ORM for relational databases.
- **Maven**: Dependency management and build automation tool.
- **IntelliJ IDEA**: Integrated development environment used for building the project.
- **Postman**: Tool for testing and debugging API endpoints.

## Installation and Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ems-backend.git
2. Set up the MySQL database and configure connection properties in application.properties
3. Run the application in main

## API Endpoints
- `GET /employees` - Retrieve all employees
- `POST /employees` - Add a new employee
- `PUT /employees/{id}` - Update an existing employee
- `DELETE /employees/{id}` - Delete an employee

Feel free to fork or contribute to this project to expand its functionality!
