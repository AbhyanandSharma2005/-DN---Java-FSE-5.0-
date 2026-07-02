# Exercise 1 - Mocking and Stubbing using Mockito

## Objective

This exercise demonstrates how to:
- Create mock objects using Mockito
- Stub methods to return predefined values
- Test service logic using mocked dependencies

---

## Concepts Used

### 1. Mocking
Creating a fake object of an external dependency.

```java
Mockito.mock(ExternalApi.class);
```

---

### 2. Stubbing
Defining behavior of mocked methods.

```java
when(mockApi.getData()).thenReturn("Mock Data");
```

---

### 3. Dependency Injection
Passing mocked object into service class.

---

## Tools Used

- Java
- JUnit 5 (or JUnit 4 compatible)
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

- Understand Mockito framework
- Learn mocking external dependencies
- Learn stubbing methods
- Write isolated unit tests