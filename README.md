# Spring Boot Fundamentals – Banque Misr Backend Internship

This project is part of the **Backend Internship Program at Banque Misr**, focusing on mastering the **Spring Boot framework** and core backend concepts such as:

- Dependency Injection
- Bean Lifecycle
- Configuration & Profiles
- RESTful APIs
- Auto-configuration and `@SpringBootApplication`

---

## 🎯 Objective

The objective of this task is to explore and implement key Spring Boot features using practical code modules. It includes:- 
- Implement core Java IoC/DI patterns by hand, then realize them in Spring Boot.
- Scaffold and inspect a Spring Boot app, write code to explore its lifecycle, context, and DI.
- Bean inspection via `CommandLineRunner`
- Disabling auto-configuration selectively
- Managing configuration via `.properties` and `.yml` profiles
- Using `@ConfigurationProperties` for settings binding
- Implementing Dependency Injection with multiple implementations using `@Primary` and `@Qualifier`

---

## ⚙️ Technology Used

- Java 17+
- Spring Boot 3.x
- Maven
- IntelliJ IDEA / VS Code
- CURL / Postman (for API testing)

---

## 📂 Project Structure
```
src/
└── main/
├── java/com/example/springboot_fundamentals/
│ ├── inspector/ContextInspector.java
│ ├── config/AppProperties.java
│ ├── controller/TitleController.java
│ ├── time/TimeService.java
│ ├── time/SystemTimeService.java
│ ├── time/MockTimeService.java
│ └── controller/TimeController.java
└── resources/
├── application.properties
└── application-dev.yml
└── docs
```


---

## 🚀 How to Run

```bash
# Clone the project
git clone https://github.com/Eng-AmanyMohamed/springboot-fundamentals.git
cd springboot-fundamentals

# Run using Maven
./mvnw spring-boot:run

```
## 🔁 Sample CURL Commands
✅ Get Application Title

1- Dynamically loaded from application.properties or application-dev.yml depending on profile.

```bash
curl -X GET http://localhost:8080/title
```

2- ⏰  Get Mock Time from Qualified Bean (MockTimeService)
 ```bash
curl -X GET http://localhost:8080/time
```

---
3- Get greeting from Spring Boot web
```bash
curl -X GET http://localhost:8080/hello
```

## 📝 Notes
- Output from the ContextInspector is saved to both the console and a file at docs/beans.txt.

- The Spring Boot context is inspected and spring-related beans are counted.

- @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) is used to disable unwanted auto-configurations like H2.

---

## 📚 Learnings & Internship Context
This project was developed as part of the Backend Developer Internship Program at Banque Misr – Rowad 2025 Track. It demonstrates foundational Spring Boot knowledge crucial for scalable and maintainable backend systems.

---

## 📄 License
This project is for educational purposes under the Banque Misr Internship initiative. All rights reserved.

