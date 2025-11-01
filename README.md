# 🧩 Job Management REST API (Spring Boot + PostgreSQL + AOP)

This project is a **Job Management REST API** built using **Spring Boot**, **Spring Web**, **Spring Data JPA**, and **PostgreSQL**.  
It also demonstrates the use of **Spring AOP (Aspect-Oriented Programming)** to handle **cross-cutting concerns** like logging and performance tracking.

---

## 🚀 Features

- Create, read, update, and delete job posts  
- Bulk insertion of job data  
- Layered architecture (Controller → Service → Repository)  
- AOP-based cross-cutting concern handling (e.g., logging)  
- Database integration using Spring Data JPA and PostgreSQL  

---

## 🧠 Technologies Used

| Technology | Purpose |
|-------------|----------|
| Spring Boot | Application Framework |
| Spring Web | REST API Development |
| Spring Data JPA | ORM and Database Interaction |
| PostgreSQL | Database |
| Spring AOP | Logging & Cross-Cutting Concerns |
| Maven | Dependency Management |

---

## 📂 Project Structure

```
src/
 └── main/
      ├── java/com/example/JobApp/
      │     ├── controller/JobController.java
      │     ├── model/Job.java
      │     ├── service/JobService.java
      │     ├── repository/JobRepository.java
      │     └── aspect/LoggingAspect.java
      └── resources/
            ├── application.properties
            └── data.sql (optional - sample data)
```

---

## 📡 API Endpoints

| Method | Endpoint | Description |
|---------|-----------|-------------|
| **GET** | `/jobposts` | Fetch all job posts |
| **GET** | `/job/{id}` | Fetch a specific job by its ID |
| **POST** | `/job` | Add a new job post |
| **PUT** | `/job` | Update an existing job post |
| **DELETE** | `/job` | Delete a job post (by sending Job JSON in body) |
| **POST** | `/jobposts` | Add multiple job posts at once (bulk insert) |

---

## 🧾 Example JSON

**POST `/job`**
```json
{
  "id": 1,
  "jname": "Software Engineer",
  "desc": "Develop backend APIs using Spring Boot",
  "jreq": ["Java", "Spring Boot", "PostgreSQL"]
}
```

**POST `/jobposts` (bulk insert)**
```json
[
  {
    "id": 1,
    "jname": "Backend Developer",
    "desc": "Work on REST APIs",
    "jreq": ["Java", "Spring Boot"]
  },
  {
    "id": 2,
    "jname": "Frontend Developer",
    "desc": "Develop UI in React",
    "jreq": ["JavaScript", "React"]
  }
]
```

---

## ⚙️ How to Set Up the Project

### 1. Clone the Repository
```bash
git clone https://github.com/<your-username>/<repo-name>.git
cd <repo-name>
```

### 2. Configure Database in `application.properties`
Open the file:  
```
src/main/resources/application.properties
```
and modify these lines according to your PostgreSQL setup:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=your_postgres_username
spring.datasource.password=your_postgres_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Build and Run
If using Maven:
```bash
mvn spring-boot:run
```

Alternatively, you can build a JAR and run:
```bash
mvn clean package
java -jar target/JobApp-0.0.1-SNAPSHOT.jar
```

### 4. Access the API
The server will start at:  
👉 `http://localhost:8080`

You can test the API using:
- **Postman**
- **cURL**
- **Your frontend client**

---

## 🧩 Example AOP Use Case
This project includes a **LoggingAspect** that logs method entry and exit for controllers and services, helping you trace application flow without modifying each class.

---

## 🧑‍💻 Author

**Your Name**  
📧 [your.email@example.com]  
🌐 [GitHub Profile Link]  
