# Spring Boot REST - Get Country by Country Code

This Spring Boot project implements a RESTful service that returns country details based on the country code provided. The country code lookup is case-insensitive and the data is retrieved from an XML configuration file (`country.xml`).

---

## 🛠 Features

- REST endpoint to get country details by code
- Case-insensitive code matching
- Country data stored in `country.xml` using Spring's XML configuration
- Implemented using Spring Boot with Maven

---

## 📁 Project Structure
```
spring-learn/
├── src/
│ └── main/
│ ├── java/
│ │ └── com/cognizant/spring_learn/
│ │ ├── controller/
│ │ │ └── CountryController.java
│ │ ├── model/
│ │ │ └── Country.java
│ │ ├── service/
│ │ │ └── CountryService.java
│ │ └── SpringLearnApplication.java
│ └── resources/
│ ├── application.properties
│ └── country.xml
├── pom.xml
└── README.md
```

---

## 🔧 Setup & Run

### 1. Clone the repository

```bash
git clone https://github.com/your-username/spring-learn.git
cd spring-learn
```
---
2. Build and run the application

```
mvn clean install
mvn spring-boot:run
The app will start on port 8083 by default.
```
🌐 REST API Endpoint

✅ Get Country by Code
* URL: /countries/{code}
* Method: GET
* Description: Returns country details for the given code (case-insensitive)
---
🧪 Sample Request

```
GET http://localhost:8083/countries/in
```
---
📦 Sample Response

```
{
  "code": "IN",
  "name": "India"
}
```
---
📚 Tech Stack
* Java 24
* Spring Boot 3.5.3
* Maven
* RESTful Web Services
* XML Configuration (Spring Context)
