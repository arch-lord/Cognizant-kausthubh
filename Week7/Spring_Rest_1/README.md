# SpringLearn

A sample Spring Boot application developed as part of the Cognizant FSE training exercises. This project demonstrates basic Spring Boot setup, dependency management using Maven, and application structure for enterprise Java development.

---

## 📌 Project Structure
```
spring-learn/
├── src/
│ ├── main/
│ │ ├── java/com/cognizant/
│ │ │ └── SpringLearnApplication.java
│ │ └── resources/
│ │ └── application.properties
│ └── test/
│ └── java/com/cognizant/SpringLearnApplicationTests.java
├── pom.xml
└── README.md
```

---

## 🚀 How to Run the Project

### 1. Pre-requisites
- Java 17+ installed
- Maven installed and configured
- IntelliJ IDEA (preferred IDE)

### 2. Build the Project

If you're behind a Cognizant proxy:

```bash
mvn clean package -Dhttp.proxyHost=proxy.cognizant.com -Dhttp.proxyPort=6050 -Dhttps.proxyHost=proxy.cognizant.com -Dhttps.proxyPort=6050 -Dhttp.proxyUser=your_emp_id
```
-----
🧪 Run the Application
Right-click on SpringLearnApplication.java → Run
OR
Use the terminal:
mvn spring-boot:run

✅ Log Verification
Ensure the console shows:
✅ Application started from main() method...
---

🧩 Dependencies (from pom.xml)
* spring-boot-starter-web
* slf4j-api
* logback-classic
* spring-boot-starter-test (JUnit)

---
📈 SME Walkthrough Points
| Part                 | Description                                 |
| -------------------- | ------------------------------------------- |
| `src/main/java`      | Core business logic and main class          |
| `src/main/resources` | App config files (`application.properties`) |
| `src/test/java`      | Unit and integration tests                  |
| `pom.xml`            | Dependency and build config                 |
| `main()`             | Entry point to start Spring context         |

