# Exercise 2 - Verifying Interactions using Mockito

## Objective

This exercise demonstrates how to verify whether a method of a mocked object is called with specific arguments.

---

## Concepts Used

### 1. Mocking
Creating a fake object for external dependency.

```java
Mockito.mock(ExternalApi.class);
```

---

### 2. Method Invocation
Calling service method that internally uses dependency.

```java
service.fetchData();
```

---

### 3. Verification
Checking whether a method was called.

```java
verify(mockApi).getData();
```

---

## Tools Used

- Java
- JUnit
- Mockito
- Maven

---

## How to Run

```bash
mvn test
```

---

## Expected Output

```
Tests run: 1
Failures: 0
Errors: 0
BUILD SUCCESS
```

---

## Learning Outcomes

- Understand Mockito verify()
- Learn interaction testing
- Validate method calls on dependencies