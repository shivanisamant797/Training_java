# Java & Spring Boot Training Project

This repository contains my hands-on learning and implementation of **Java 17+, Spring Boot, Spring WebFlux, Reactive Programming, CRUD Operations, and Database Integration**.

The project is organized into separate Git branches, with each branch focusing on a specific stage of the learning and development process.

---

## 🌿 Branch Structure

### 1. `feature/java-17`

**Focus:** Java 17 Features & Modern Java Programming

This branch contains implementations and practice of important Java 17 features, including:

* Records
* Sealed Classes
* Pattern Matching for `instanceof`
* Switch Expressions
* Text Blocks
* Modern Java syntax and improvements
* Object-Oriented Programming concepts
* Java Collections and APIs

---

### 2. `feature/spring-boot-basics`

**Focus:** Spring Boot Fundamentals

This branch covers the fundamentals of building applications using Spring Boot.

Topics include:

* Spring Framework fundamentals
* Spring Boot
* Maven & `pom.xml`
* Spring Boot project structure
* `@SpringBootApplication`
* Inversion of Control (IoC)
* Dependency Injection (DI)
* Spring Beans
* `@Component`
* `@Service`
* `@Repository`
* Constructor Injection
* `application.properties`
* REST Controllers
* Basic REST APIs
* Swagger / OpenAPI documentation

---

### 3. `feature/webflux-basics`

**Focus:** Spring WebFlux & Reactive Programming

This branch introduces reactive application development using Spring WebFlux.

Topics include:

* Spring WebFlux
* Reactive Programming
* Blocking vs Non-Blocking Programming
* Reactive Streams
* `Publisher` and `Subscriber`
* Project Reactor
* `Mono`
* `Flux`
* Reactive operators
* `map()`
* `flatMap()`
* `filter()`
* Reactive error handling
* WebFlux REST APIs

---

### 4. `feature/webflux-crud`

**Focus:** Reactive CRUD Operations

This branch focuses on implementing CRUD operations using Spring WebFlux.

Implemented operations include:

* Create
* Read
* Update
* Delete

The branch focuses on:

* Reactive REST APIs
* `Mono` and `Flux`
* Controller layer
* Service layer
* Repository layer
* DTOs
* Request/Response handling
* Exception handling
* API testing

---

### 5. `feature/database-integration`

**Focus:** Database Integration

This branch focuses on connecting the Spring application with a database.

Topics include:

* Database configuration
* PostgreSQL / relational database concepts
* Spring Data
* Reactive database access
* Repository pattern
* Database CRUD operations
* Entity/model mapping
* Query operations
* Configuration using `application.properties`

---

## 🏗️ Technology Stack

| Technology            | Purpose                       |
| --------------------- | ----------------------------- |
| **Java 17**           | Programming language          |
| **Spring Boot**       | Backend application framework |
| **Spring WebFlux**    | Reactive web development      |
| **Maven**             | Build & dependency management |
| **Project Reactor**   | Reactive programming          |
| **PostgreSQL**        | Database                      |
| **Spring Data**       | Database access               |
| **Swagger / OpenAPI** | API documentation & testing   |
| **Git & GitHub**      | Version control               |

---

## 📂 Learning Progression

The branches follow a progressive development approach:

```text
Java 17
   ↓
Spring Boot Basics
   ↓
Spring WebFlux Basics
   ↓
Reactive CRUD
   ↓
Database Integration
```

Each branch represents a separate stage of the project and can be developed, tested, and maintained independently.

---

## 🎯 Objective

The goal of this project is to build a strong foundation in **modern Java backend development** and understand how Java, Spring Boot, reactive programming, REST APIs, CRUD operations, and database integration are used together in a backend application.

---

## 🔀 Branches

```text
main
│
├── feature/java-17
│
├── feature/spring-boot-basics
│
├── feature/webflux-basics
│
├── feature/webflux-crud
│
└── feature/database-integration
```

---

## 🚀 Getting Started

Clone the repository:

```bash
git clone <repository-url>
cd <project-directory>
```

Check available branches:

```bash
git branch -a
```

Switch to a specific feature branch:

```bash
git checkout feature/java-17
```

or:

```bash
git checkout feature/spring-boot-basics
```

Run the Spring Boot application:

```bash
mvn spring-boot:run
```

---

## 📌 Development Approach

Each feature is developed in its own branch to keep the learning process organized and to maintain a clear history of the project's progression.

The final `main` branch can be used to integrate the completed features into a single application.

https://www.figma.com/make/LNlvXfSsHlmfVwR9ljEQcm/Bus-Booking-App?p=f&t=wsytZ2W5lLlQfUHV-0