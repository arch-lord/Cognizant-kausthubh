# Spring Boot - Country REST API (XML Bean Configuration)

This project is a simple Spring Boot application demonstrating how to expose a RESTful web service that loads data from a Spring XML configuration file.

The application exposes an endpoint to retrieve country details (specifically **India**) using a bean defined in `country.xml`.

---

## 📂 Project Structure

```
spring-learn/
├── pom.xml
├── src/
│ └── main/
│ ├── java/
│ │ └── com/
│ │ └── cognizant/
│ │ └── springlearn/
│ │ ├── SpringLearnApplication.java # Main Spring Boot class
│ │ ├── Country.java # POJO with code and name
│ │ └── controller/
│ │ └── CountryController.java # REST controller
│ └── resources/
│ ├── application.properties # Spring Boot config (port)
│ └── country.xml # Spring XML bean config
```

---

## 🚀 Features

- ✅ REST endpoint using Spring Web (`/country`)
- ✅ Loads `Country` bean from XML (`country.xml`) via `ClassPathXmlApplicationContext`
- ✅ Auto-converts Java object to JSON using Jackson
- ✅ Demonstrates use of `@RestController` and XML-based bean loading in a Spring Boot app

---

## 🔧 Technologies Used

- Java 11+
- Spring Boot 2.7.x
- Spring Web
- Spring Context (for XML)
- Jackson (for JSON serialization)
- Maven
- IntelliJ IDEA

---

## 🔌 How to Run

1. Clone the project or open in IntelliJ.
2. Build using Maven or let IntelliJ auto-import dependencies.
3. Run the application via `SpringLearnApplication.java`.

### 📦 Terminal (if using CLI):
```
bash
mvn spring-boot:run
```
---
🌐 REST API Details

Endpoint: /country
Method: GET

Response:
```
{
  "code": "IN",
  "name": "India"
}
```
---
📝 Sample Bean Configuration (country.xml)

```
<bean id="country" class="com.cognizant.springlearn.Country">
    <property name="code" value="IN"/>
    <property name="name" value="India"/>
</bean>
```
---
📜 Logs

Logs include:
* Inside Country Constructor
* START getCountryIndia()
* END getCountryIndia()
---
🧪 Test the API

Use:
Browser: http://localhost:8083/country
Postman or curl for full header analysis:
```
curl http://localhost:8083/country
```
