

# Week 2 — Assessment Overview

This folder contains all **mandatory Week 2 exercises**, implemented in Java. You can open tests directly in **VS Code** (with Java Test Runner) or run via terminal (JAR‑based classpath).

---

## 📋 Exercise List

| #  | Exercise & Description                                                                 | Java File                          |
|----|------------------------------------------------------------------------------------------|------------------------------------|
| 1  | Control Structures (Exercise 1 – Week 2)                                               | *[ControlStructures.java](ControlStructures.java)* |
| 2  | Stored Procedures (Exercise 3 – Week 2)                                                | *[StoredProcedures.java](StoredProcedures.java)* |
| 3  | Setting Up JUnit (Exercise 1 – Week 2 JUnit)                                           | *[SetupJUnitTest.java](SetupJUnitTest.java)* |
| 4  | Assertions in JUnit (Exercise 3 – Week 2 JUnit)                                        | *[AssertionsTest.java](AssertionsTest.java)* |
| 5  | Arrange–Act–Assert + Setup/Teardown (Exercise 4 – Week 2 JUnit)                        | *[AccountTest.java](AccountTest.java)* |
| 6  | Mocking & Stubbing with Mockito (Exercise 1 – Mockito)                                 | *[MyServiceTest.java](MyServiceTest.java)* |
| 7  | Verifying Interactions with Mockito (Exercise 2 – Mockito)                             | *[VerifyInteractionTest.java](VerifyInteractionTest.java)* |
| 8  | Logging Error & Warning Levels (Exercise 1 – SLF4J/Logback)                            | *[LoggingExample.java](LoggingExample.java)* |

---

## 🚀 Running the Java Files

### ✅ Prerequisites

- **Java JDK** installed  
- **VS Code** with extensions:
  - Java Extension Pack
  - Java Test Runner (for JUnit 5 tests)

- All required **JARs** in `lib/` folder:
```

junit-jupiter-api-5.9.3.jar
junit-jupiter-engine-5.9.3.jar
junit-platform-commons-1.9.3.jar
mockito-core-5.11.0.jar
hamcrest-core-1.3.jar
slf4j-api-1.7.30.jar
logback-classic-1.2.3.jar
logback-core-1.2.3.jar

````

- `.vscode/settings.json`:
```json
{
  "java.project.referencedLibraries": [
    "lib/**/*.jar"
  ]
}
````

---

### 📐 Running in VS Code

1. Open the **Week 2** folder in VS Code.
2. Open any Java file:

   * For *tests*: click **“Run Test”** above the `@Test` methods or use the **Testing** sidebar.
   * For `LoggingExample.java`: click **Run** on `main()` or use the ▶ icon.

---

### 🛠 Running from Terminal (optional)

In `Week - 2` directory with all JARs in `lib/`:

#### ✅ For JUnit & Mockito tests:

```powershell
javac -cp ".;lib/*" *.java
java -cp ".;lib/*" org.junit.platform.console.ConsoleLauncher -c SetupJUnitTest -c AssertionsTest -c AccountTest -c MyServiceTest -c VerifyInteractionTest
```

#### ✅ For logging demo:

```powershell
javac -cp ".;lib/*" LoggingExample.java
java -cp ".;lib/*" LoggingExample
```


