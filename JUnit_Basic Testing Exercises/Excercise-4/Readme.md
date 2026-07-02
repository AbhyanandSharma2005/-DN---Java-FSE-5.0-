# Exercise 4 - AAA Pattern, Setup & Teardown in JUnit

## Objective

This exercise demonstrates:
- Arrange-Act-Assert (AAA) testing pattern
- Test Fixtures
- Setup and Teardown methods using JUnit

---

## Concepts Used

### 1. Arrange-Act-Assert (AAA) Pattern

A structured way of writing test cases:

- **Arrange** → Prepare test data and objects
- **Act** → Call the method under test
- **Assert** → Verify the result

---

### 2. @Before (Setup Method)

Runs **before every test case**.

Used to initialize objects.

---

### 3. @After (Teardown Method)

Runs **after every test case**.

Used to clean up resources.

---

## Example Flow

```
@Before  → Setup Calculator object
@Test    → Perform test (AAA pattern)
@After   → Cleanup
```

---

## Tools Used

- Java
- Maven
- JUnit 4.13.2
- VS Code

---

## How to Run

```bash
mvn test
```

---

## Expected Output

```
Tests run: 2
Failures: 0
Errors: 0

BUILD SUCCESS
```

---

## Learning Outcomes

- Understand AAA pattern
- Use setup and teardown methods
- Improve test structure and readability