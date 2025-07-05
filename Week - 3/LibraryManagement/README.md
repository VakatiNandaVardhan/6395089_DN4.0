
# LibraryManagement (Spring Core - XML Configuration)

This is a simple Spring-based Java application that demonstrates how to configure and run a backend service using **Spring Core** with **XML-based configuration**.

---

## 📚 Exercise

**Exercise 1: Configuring a Basic Spring Application**

### ✅ Key Features:
- Uses Spring's `ApplicationContext` for bean loading
- Defines `BookService` and `BookRepository` beans via `applicationContext.xml`
- Demonstrates setter injection using Spring

---

## 📂 Project Structure

```
LibraryManagement/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/library/
│   │   │       ├── MainApp.java
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
mvn exec:java "-Dexec.mainClass=com.library.MainApp"
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
| `MainApp`        | Loads Spring context and runs service   |

---
