# 🏝️ Travel Agency Booking System - Spring Boot Back-End

## Project Overview
This project is a **modern Spring Framework Java backend** for a travel agency's vacation booking application. It serves as a **minimally viable product (MVP)** to migrate legacy backend functionalities to a modern framework, addressing issues with **undocumented bugs and growing technical debt**.

## Key Features
- **RESTful API** for vacation bookings and customer management  
- **Integration with MySQL** database  
- **Checkout functionality** for vacation packages and excursions  
- **Validation** for input data  
- **Cross-origin support** for frontend integration  

## Technologies Used
- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Lombok**
- **GitLab for version control**

## Getting Started

### Prerequisites
- JDK 11 or later  
- Maven  
- MySQL  

### Setup
1. **Clone the repository**  

2. **Configure MySQL connection** in `application.properties`:

3. **Run the application**  

## API Endpoints
- **POST** `/api/checkout` - Place an order for vacation packages and excursions  

## Database Schema
The application uses the following main entities:
- Customer
- Order
- Vacation
- Excursion

## Testing
1. **Use the provided Angular frontend** to place an order.  
2. **Ensure no network errors** occur.  
3. **Verify MySQL database** to confirm data persistence.  

## Future Enhancements
- Implement additional CRUD operations for all entities  
- Add user authentication and authorization  
- Integrate with external APIs for real-time vacation data

## Challenges & Learnings 🚀

During the development of this project, I encountered several challenges that enhanced my understanding of **Spring Boot**, **database management**, and **REST API design**. Here are some of the key learnings:

### 1️⃣ Migrating a Legacy System  
- **Challenge**: The existing backend was built with minimal functionality, making it difficult to debug and extend.  
- **Solution**: I carefully **analyzed** the legacy system's database schema and **mapped** it to modern **Spring Data JPA entities**, ensuring a **smooth transition** while preserving data integrity.  
- **Takeaway**: Learned how to **refactor** old codebases without disrupting business-critical features.  

### 2️⃣ Designing a Scalable REST API  
- **Challenge**: Ensuring that the API could handle various requests efficiently while following **RESTful principles**.  
- **Solution**: Implemented **controller-service-repository** layers with proper **DTOs** (Data Transfer Objects) and **exception handling**.  
- **Takeaway**: Improved my ability to **design well-structured APIs** that are scalable and easy to maintain.  

### 3️⃣ Optimizing Database Queries  
- **Challenge**: Some MySQL queries caused slow response times when handling **large datasets**.  
- **Solution**: Used **lazy loading**, **indexing**, and **JOIN optimizations** to improve database performance.  
- **Takeaway**: Learned to **profile and optimize** SQL queries to enhance API response times.  

### 4️⃣ Handling Cross-Origin Frontend Integration  
- **Challenge**: The frontend (Angular) needed to communicate with the new backend but faced **CORS (Cross-Origin Resource Sharing) issues**.  
- **Solution**: Configured **Spring Boot CORS filters** to allow controlled access to the API from the front end.  
- **Takeaway**: Developed a deeper understanding of **frontend-backend communication and security constraints**.  

### 5️⃣ Implementing Checkout & Transaction Flow  
- **Challenge**: Managing **multiple transactions** (customers, orders, vacation packages) within a single checkout process.  
- **Solution**: Used **Spring's Transaction Management** to ensure **atomicity**so that if any part of the transaction failed, the system rolled back changes.  
- **Takeaway**: Improved my skills in **transaction management** and ensuring **data consistency** in a relational database.  

### 6️⃣ Version Control & CI/CD Practices  
- **Challenge**: Managing multiple commits and ensuring consistent backups.  
- **Solution**: Used **GitLab for version control**, following best practices like **feature branches** and **meaningful commit messages**.  
- **Takeaway**: Strengthened my ability to work with **Git** in a team-oriented environment and prepared for real-world **CI/CD workflows**.  

### 7️⃣ Enhancing Code Maintainability with Lombok & Design Patterns  
- **Challenge**: Reducing boilerplate code and ensuring modularity.  
- **Solution**: Used **Lombok** for **automatic getter/setter generation** and applied **design patterns** like **Singleton and Factory** where necessary.  
- **Takeaway**: Gained experience in **writing clean, maintainable, and scalable code** using best practices.  


