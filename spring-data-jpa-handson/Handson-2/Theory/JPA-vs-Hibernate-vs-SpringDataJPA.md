# Difference between JPA, Hibernate, and Spring Data JPA

## 1. Java Persistence API (JPA)

JPA is a specification (standard) for object-relational mapping in Java.

- It is defined under JSR 338
- It is not an implementation
- It defines rules for ORM mapping
- It provides interfaces like EntityManager

👉 JPA = Blueprint (only rules)

---

## 2. Hibernate

Hibernate is an ORM framework and a JPA implementation.

- Implements JPA specifications
- Handles SQL generation, caching, and database communication
- Provides additional features like HQL

👉 Hibernate = Actual ORM engine

---

## 3. Spring Data JPA

Spring Data JPA is a wrapper over JPA.

- Built on top of JPA (and Hibernate internally)
- Reduces boilerplate code
- Provides ready-made methods like:
  - save()
  - findAll()
  - findById()

👉 Spring Data JPA = Simplified data access layer

---

## Key Differences

| Feature | JPA | Hibernate | Spring Data JPA |
|--------|-----|-----------|-----------------|
| Type | Specification | ORM Framework | Abstraction Layer |
| Implementation | No | Yes | Uses JPA/Hibernate |
| Boilerplate code | High | Medium | Very Low |
| Role | Rules | Engine | Simplifier |

---

## Summary

- JPA → Rules
- Hibernate → Implementation
- Spring Data JPA → Simplified usage layer