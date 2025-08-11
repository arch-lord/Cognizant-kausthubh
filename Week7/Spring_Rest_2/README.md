<h2>📘 Spring Core – Load Country from Spring Configuration XML</h2>

---
**✅ Introduction**

This project demonstrates the use of Spring Core to configure and retrieve a Java bean using XML-based configuration. The use case simulates an airline booking application that supports multiple countries, each identified by a 2-character ISO code and name.

For this hands-on, we store one country (India) in an XML configuration and read it through Spring’s ApplicationContext to print the country details. Logging is incorporated using SLF4J to track constructor and method calls.

📂 Project Structure
```
spring-core-country/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── cognizant/
│   │   │           └── springlearn/
│   │   │               ├── Country.java
│   │   │               └── SpringLearnApplication.java
│   │   └── resources/
│   │       └── country.xml
├── pom.xml
└── README.md
```
🧠 Theory

🔹 Spring Bean Configuration (country.xml)
The country.xml file is a Spring configuration XML where a Country bean is defined. This file contains:

* <bean>: Declares a Spring-managed object
* id: Unique name to reference the bean
* class: Fully qualified class name
* <property>: Injects values using setters
```
<bean id="country" class="com.cognizant.springlearn.Country">
    <property name="code" value="IN" />
    <property name="name" value="India" />
</bean>
```
🔹 Country.java
* A simple Java class (POJO) with:
* Two properties: code and name
* A no-argument constructor with a debug log
* Getter and setter methods with debug logs
* Overridden toString() method

🔹 SpringLearnApplication.java
* This class contains the main method and displayCountry() method, which:
* Loads the XML configuration using ClassPathXmlApplicationContext
* Retrieves the country bean
* Logs the full bean details

```
ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
Country country = context.getBean("country", Country.class);
LOGGER.debug("Country : {}", country.toString());
```
🔹 ApplicationContext and Bean Retrieval
* ApplicationContext is the Spring container responsible for instantiating and managing beans.
* getBean() tells Spring to return a specific bean instance by ID, triggering the constructor and property injection.

⚙️ Technologies Used
* Java 8+
* Spring Core (with XML configuration)
* SLF4J (for logging)
* Maven (for dependency management)
* IntelliJ IDEA (development environment)

🏁 How to Run
* Clone the repository or set up the project in IntelliJ.
* Make sure slf4j-api and slf4j-simple are added to pom.xml.
* Run SpringLearnApplication.java.
* Check the console logs to see constructor and method logs.
* Output will be:
```
Country : Country{code='IN', name='India'}
```
