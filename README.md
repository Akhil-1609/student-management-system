# 🎓 Student Management System

A Full-Stack Web Application built to manage student records efficiently. This project demonstrates a complete **3-Layer Architecture** (Controller, Service, Repository) with automated validation and responsive UI.

## 🚀 Features
* **CRUD Operations:** Create, Read, Update, and Delete student records.
* **Search Functionality:** Filter students dynamically by name.
* **Business Logic Validation:** Prevents duplicate email entries using custom Service logic.
* **Responsive UI:** Professional dashboard built with **Bootstrap 5**.
* **RESTful API:** Backend endpoints designed using Spring Web.

## 🛠️ Tech Stack
* **Backend:** Java 21, Spring Boot 3.4
* **Database:** MySQL, Hibernate (JPA)
* **Frontend:** HTML5, JavaScript (Fetch API), Bootstrap 5
* **Testing:** JUnit 5, Mockito (Unit Testing for Business Logic)
* **Tools:** Maven, IntelliJ IDEA, Git/GitHub

## 📸 How It Works
1.  **Frontend:** Users interact with a clean HTML/JS Dashboard.
2.  **API Layer:** `StudentController` receives HTTP requests.
3.  **Service Layer:** `StudentService` validates data (e.g., checks for duplicate emails).
4.  **Data Layer:** `StudentRepository` interacts with the MySQL database.

## 🧪 Testing
The project includes automated Unit Tests using **JUnit 5** and **Mockito** to verify critical business logic (e.g., ensuring duplicate emails are rejected).