# Employee REST API - H2

Spring Boot + REST + Spring Data JPA + Hibernate + H2 + Maven.

## Run
Import as an Existing Maven Project and run EmployeeRestApiApplication.

## APIs
GET    http://localhost:8080/employees
GET    http://localhost:8080/employees/1
POST   http://localhost:8080/employees
PUT    http://localhost:8080/employees/1
DELETE http://localhost:8080/employees/1

POST/PUT JSON:
{
  "name": "Alice",
  "department": "Finance",
  "salary": 80000
}

## H2 Console
http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:employeedb
User: sa
Password: (empty)

The database is recreated when the application restarts.
