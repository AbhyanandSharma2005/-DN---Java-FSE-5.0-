# Exercise 2 - Dependency Injection using Spring IoC

## Objective
Demonstrate Dependency Injection (DI) using Spring XML configuration.

---

## Concepts Used
- Inversion of Control (IoC)
- Dependency Injection (Setter Injection)
- Spring Bean Configuration

---

## Flow
1. BookRepository is created as a Spring Bean
2. BookService depends on BookRepository
3. Spring injects dependency using XML
4. App class loads context and executes service

---

## How to Run

```bash
mvn clean compile
mvn exec:java
```

---

## Expected Output

```
Book Service Processing...
Book saved in Repository
Dependency Injection Working Successfully
```

---

## Learning Outcome
- Understand Spring IoC container
- Implement dependency injection using XML
- Decouple service and repository layers