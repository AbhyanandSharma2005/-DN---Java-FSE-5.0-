# Exercise 1 - Setting Up JUnit

## Objective

The objective of this exercise is to configure JUnit in a Java project and create the first unit test.

## Prerequisites

- Java JDK 8 or later
- Maven
- IntelliJ IDEA / Eclipse / VS Code
- JUnit 4.13.2

## Project Structure

```
Exercise-1
│
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── Calculator.java
    └── test
        └── java
            └── CalculatorTest.java
```

## Maven Dependency

```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
```

## Steps Performed

1. Created a Maven Java project.
2. Added JUnit dependency.
3. Created a Java class.
4. Created a JUnit test class.
5. Executed the test cases successfully.

## Learning Outcomes

- Configure JUnit in Maven
- Create Test Classes
- Write Unit Tests
- Execute JUnit Tests