---->  Project Overview – Hospital Management System----


1---> Below is a complete end-to-end guide to build a Hospital Management System using Java, Spring Boot, Spring Security, JWT, MySQL, Jenkins, and AWS.

2 --->Features

Doctor Login (JWT Authentication)

Add / Update / Delete Patients

View Patients List

Appointment Management

Role Based Access (Doctor/Admin)

Secure APIs using Spring Security + JWT

Store Data in MySQL

CI/CD using Jenkins

Deploy on AWS EC2

3 ---> Architecture

Client (Postman / Frontend)
|


Spring Boot REST APIs

|
Spring Security + JWT Authentication

|
Service Layer
|

Repository Layer (JPA)

|
MySQL Database


4 --->  Deployment:

GitHub
|

Jenkins Pipeline
|

Build (Maven/Gradle)
|

Deploy JAR
|

AWS EC2 Server


5  ---> Project structure:

hospital-management

│
├── controller

│     ├── AuthController
│     ├── DoctorController
│     └── PatientController


│
├── service

│     ├── DoctorService
│     └── PatientService
│

├── repository

│     ├── DoctorRepository
│     └── PatientRepository
│

├── entity

│     ├── Doctor
│     └── Patient

│
├── security

│     ├── JwtUtil
│     ├── JwtFilter
│     └── SecurityConfig


│
└── HospitalApplication.java