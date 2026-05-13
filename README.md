#  College Management System (Backend)

A robust, enterprise-grade REST API designed to handle institutional workflows. This backend service manages core entities like Students, Teachers, and Departments using a secure and scalable architecture.

##  Architecture & Design
The project follows a **Layered Design Pattern** to ensure high maintainability and clean code:
*   **Controller Layer:** Manages REST endpoints and request mapping.
*   **Service Layer:** Encapsulates business logic and service-to-service communication.
*   **Repository Layer:** Uses Spring Data JPA for optimized MySQL interactions.
*   **Security First:** Database credentials and sensitive data are managed via Environment Variables to prevent exposure.

##  Key Features
*   **Modular Management:** Dedicated modules for faculty, student records, and departmental data.
*   **Automated Persistence:** Object-Relational Mapping (ORM) through Hibernate for seamless data handling.
*   **Data Validation:** Robust input validation for all CRUD operations.
*   **Performance Optimized:** Efficient query handling through Spring Data JPA repositories.

##  Tech Stack
- **Framework:** Spring Boot 3.x
- **Language:** Java 17+
- **Database:** MySQL
- **Build Tool:** Maven
- **ORM:** Hibernate / JPA

##  API Endpoints
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/Teacher/add` | Register a new teacher |
| `GET` | `/Teacher/get` | Fetch all faculty records |
| `PUT` | `/Teacher/update/{id}` | Update teacher details |
| `DELETE` | `/Teacher/{id}` | Remove a teacher record |

##  Setup & Installation
1. Clone the repository.
2. Configure your MySQL credentials using Environment Variables (`DB_USERNAME`, `DB_PASSWORD`).
3. Run `mvn clean install` to build the project.
4. Launch the application via `CollegeManagementApplication.java`.
