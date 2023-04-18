# Full Stack Blogging Website

The project consists of two separate applications that run in parallel to each other: a Spring Boot API and a React front-end app. The Spring Boot API serves as the back-end of the application, handling all of the data requests and interactions with the database. The React front-end is responsible for displaying the content of the website and handling user interactions.

## Spring-Boot Application
To get started, the back-end is built using Spring Boot, a popular Java-based framework for building web applications. The API is built on a RESTful architecture, which allows for simple and efficient communication between the front-end and the back-end. Spring Boot provides a range of features such as dependency injection, security, and easy integration with databases.

## POSTGRE
For the database, I decided to use PostgreSQL. PostgreSQL is a powerful open-source relational database management system that is known for its reliability, robustness, and advanced features such as support for JSON data types and full-text search. In this project, PostgreSQL is used as the primary database for storing all of the blog data such as blog posts and author information. PostgreSQL is installed and configured on a server, which can be the same server as the Spring Boot API or a different server. In this case, let's assume that PostgreSQL is installed on the same server as the Spring Boot API but on a different port. By default, PostgreSQL listens on port 5432, but we can configure it to listen on a different port such as 5433.

## Integrating the API with React App
To integrate PostgreSQL with the Spring Boot API, we use the Spring Data JPA library, which provides an easy way to interact with relational databases using Java objects. Spring Data JPA uses Hibernate as the underlying ORM (Object-Relational Mapping) framework, which maps Java objects to database tables and vice versa.

React hooks is used to consume the API which returns an array of post data that is then converted into JSON format to be utilised by the componenets.


This allows for easy storage and retrieval of all the blog data.
