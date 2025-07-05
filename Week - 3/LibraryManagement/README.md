
# LibraryManagement (Spring Core - XML Configuration)

This is a simple Spring-based Java application that demonstrates how to configure and run a backend service using **Spring Core** with **XML-based configuration**.

---

## 📚 Exercises Covered

### ✅ Exercise 1: Configuring a Basic Spring Application

- Setup a Maven-based Java application with Spring Core dependency
- Created `BookService` and `BookRepository` classes
- Configured beans in `applicationContext.xml`
- Loaded Spring context in a main class (`LibraryManagementApplication`)
- Verified Spring is working by printing a book name via the service

### ✅ Exercise 2: Implementing Dependency Injection

- Focused on **Spring's Inversion of Control (IoC)** and **Setter-based Dependency Injection**
- Defined a `setBookRepository()` method in `BookService`
- Used the `<property>` tag in `applicationContext.xml` to inject `BookRepository` into `BookService`
- Validated DI works by calling service logic in the main class

---

## 📂 Project Structure

```
LibraryManagement/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/library/
│   │   │       ├── LibraryManagementApplication.java
│   │   │       ├── service/BookService.java
│   │   │       └── repository/BookRepository.java
│   └── resources/
│       └── applicationContext.xml
```

---

## 🧪 How to Run

### 💡 Prerequisites
- Java JDK installed
- Maven installed and added to your PATH

### 🛠 Compile
```bash
mvn compile
```

### ▶️ Run the App
Use this exact syntax in PowerShell:
```powershell
mvn exec:java "-Dexec.mainClass=com.library.LibraryManagementApplication"
```

### ✅ Expected Output
```
Book fetched: Clean Code by Robert C. Martin
```

---

## 📦 Dependencies

`pom.xml` includes:

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>5.3.31</version>
    </dependency>
</dependencies>
```

---

## ✅ Summary

| Component        | Description                             |
|------------------|-----------------------------------------|
| `BookRepository` | Returns book info (mock DB)             |
| `BookService`    | Depends on `BookRepository` via setter  |
| `LibraryManagementApplication` | Loads Spring context and runs service   |

---
