# Library Management - Spring Core Application

## Objective

This project demonstrates how to configure a basic Spring application using XML configuration.

---

## Features

- Spring Core setup
- XML-based configuration
- Dependency Injection (Setter Injection)
- Service and Repository layers

---

## Project Structure

- BookService → Business logic
- BookRepository → Data access layer
- App.java → Main class

---

## Technologies Used

- Java
- Spring Framework (Core)
- Maven

---

## How to Run

### Step 1: Compile project
```bash
mvn clean compile
```

### Step 2: Run application
```bash
mvn exec:java -Dexec.mainClass="com.library.main.App"
```

---

## Expected Output

```
Book service called
Book saved in repository
Spring application running successfully
```

---

## Learning Outcomes

- Understand Spring Core container
- Learn XML-based configuration
- Implement Dependency Injection
- Understand service-repository architecture