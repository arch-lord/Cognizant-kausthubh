# 🔐 Spring Boot JWT Authentication Service

This Spring Boot project implements a simple JWT-based authentication mechanism using Basic Auth for login. It issues a JWT token upon authentication and protects secured endpoints that require a valid token.

---

## 📌 Features

- JWT token generation on login via Basic Auth (`/authenticate`)
- Protected endpoint `/hello` accessible only with a valid JWT token
- Manual token validation using a custom JWT filter
- Spring Security configuration for Basic Auth and JWT

---

## 🛠 Tech Stack

- Java 21
- Spring Boot 3.5.3
- Spring Security
- jjwt (Java JWT) for token creation and validation
- Maven

---

## 📁 Project Structure

```
src/main/java/com/cognizant/spring_learn/
├── controller/
│ ├── AuthenticationController.java # Generates JWT token
│ └── HelloController.java # Secured endpoint
├── config/
│ ├── SecurityConfig.java # Security configuration
│ └── JwtRequestFilter.java # JWT validation filter
├── service/
│ └── JwtUtil.java # Utility class for JWT generation & validation
└── SpringLearnApplication.java # Main application entry point

src/main/resources/
└── application.properties # Server config (e.g. port)
pom.xml # Maven dependencies
```

---

## 🚀 How to Run

### 1. Build & Start the App

```
mvn clean install
mvn spring-boot:run
```
## Access Secured Endpoint

Without Token:
```
curl http://localhost:8090/hello
```
Response:
```
401 Unauthorized
```
With Token:
```
curl -H "Authorization: Bearer <JWT_TOKEN_HERE>" http://localhost:8090/hello
```
Response:
```
Hello, secure world!
```
---
## Default Credentials

| Username | Password |
| -------- | -------- |
| `user`   | `pwd`    |
