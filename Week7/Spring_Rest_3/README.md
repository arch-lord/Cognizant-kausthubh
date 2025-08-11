<h2>Hello REST Application</h2>

<h3>Introduction</h3>

Hello REST is a basic Spring Boot application that demonstrates how to build a RESTful web service using the Spring Web framework. The service provides a simple GET endpoint that returns a greeting message:
```
Hello World!!
```
This project serves as an introductory example of:
* Creating a REST controller
* Mapping HTTP requests using @GetMapping
* Logging with SLF4J
* Testing using browser/Postman
* Viewing HTTP headers

📂 Project Structure
```
hello-rest/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── cognizant/
│   │   │           └── springlearn/
│   │   │               ├── SpringLearnApplication.java
│   │   │               └── controller/
│   │   │                   └── HelloController.java
│   │   └── resources/
│   │       └── application.properties
├── pom.xml
└── README.md
```
⚙️ How It Works
* URL: http://localhost:8083/hello
* Method: GET
* Response: "Hello World!!"
* Logging: Logs are printed at the start and end of the controller method
---
🧠 SME Notes – Understanding HTTP Headers
✅ In Browser (Chrome DevTools):
* Open DevTools → Network Tab
* Refresh http://localhost:8083/hello
* Click on the /hello row
* Under Headers, observe:
* Request Headers: host, user-agent, accept
* Response Headers: content-type, content-length, date
---
✅ In Postman:

* Send a GET request to http://localhost:8083/hello
* Click Headers tab
* Observe:
- Content-Type: text/plain;charset=UTF-8
- Content-Length: 13
- Server: Apache Tomcat
---
📦 Dependencies Used

* Spring Boot Starter Web
* Spring Boot DevTools (optional)
* SLF4J (logging)

---
🚀 How to Run

* Clone/download the project
* Run SpringLearnApplication.java in IntelliJ
* Visit http://localhost:8083/hello in your browser or Postman
