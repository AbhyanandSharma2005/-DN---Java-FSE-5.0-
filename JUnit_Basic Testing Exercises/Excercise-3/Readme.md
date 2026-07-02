# Exercise 3 - Assertions in JUnit

## Objective

The objective of this exercise is to understand and use the different assertion methods provided by JUnit to validate test cases.

---

## Assertions Used

### assertEquals()

Checks whether the expected value and actual value are equal.

Example:

```java
assertEquals(5, 2 + 3);
```

---

### assertTrue()

Checks whether the given condition is true.

Example:

```java
assertTrue(5 > 3);
```

---

### assertFalse()

Checks whether the given condition is false.

Example:

```java
assertFalse(5 < 3);
```

---

### assertNull()

Checks whether an object reference is null.

Example:

```java
assertNull(null);
```

---

### assertNotNull()

Checks whether an object reference is not null.

Example:

```java
assertNotNull(new Object());
```

---

## Software Used

- Java JDK
- Maven
- JUnit 4.13.2
- VS Code

---

## How to Run

Compile and execute the tests using Maven.

```bash
mvn test
```

---

## Expected Result

```
Tests run: 1
Failures: 0
Errors: 0

BUILD SUCCESS
```

---

## Learning Outcomes

After completing this exercise, you will understand:

- Unit Testing
- Assertions in JUnit
- Test Validation
- Writing and Executing Test Cases