# Exercise 1 - Logging Error and Warning Levels using SLF4J

## Objective

This exercise demonstrates how to use **SLF4J with Logback** to log:
- Error messages
- Warning messages

---

## Concepts Used

### 1. SLF4J Logger
SLF4J is a logging facade used in Java applications.

### 2. Log Levels
- ERROR → Critical failures
- WARN → Warnings that may cause issues

---

## Dependencies Used

- slf4j-api
- logback-classic

---

## How to Run

### Step 1: Build project
```bash
mvn clean compile
```

### Step 2: Run application
```bash
mvn exec:java -Dexec.mainClass="com.logging.LoggingExample"
```

---

## Expected Output

```
ERROR com.logging.LoggingExample - This is an error message
WARN  com.logging.LoggingExample - This is a warning message
```

---

## Learning Outcomes

- Understand logging in Java
- Use SLF4J API
- Configure logging with Logback
- Log error and warning messages