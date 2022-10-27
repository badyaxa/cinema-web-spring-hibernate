# Cinema-Service

This is simple simulator of cinema service for reservation tickets, that supports registration, authentication and CRUD
operations.
___

## Features:

* register or login as user (/register)
* create and find movies (/movies)
* create and find available movie sessions (/movie-sessions)
* creating shopping cart (/shopping-carts)
* add tickets to shopping cart (/shopping-carts/movie-sessions)
* complete an order (/orders/complete)
---

## Project architecture:

The Cinema-Service is based on 3-layer architecture:

1. Controllers, which handle requests, call services and send responses
2. Services - there are all business logic
3. DAO, which handle CRUD operations to database

### Model structure

![pic](Hibernate_Cinema_Uml.png)
---

## Technologies used in project:

* Java 11
* Spring ORM/WebMVC/Security
* MySql 8.0.30
* Hibernate 5.6.12.Final
* Jackson
* Maven
---

## Quickstart
To launch the project:

* Clone the repository to PC
* Change administrator's credentials in package cinema.init.DataInitializer.java
  ```
  user.setEmail("admin@i.ua");
  user.setPassword("admin123");
  ```
* Configure "db.properties" file
    ```
    db.driver=YOUR_DRIVER
    db.url=YOUR_URL
    db.user=YOUR_USERNAME
    db.password=YOUR_PASSWORD
    ```
* Install and configure Tomcat (9.0.65)
* Run the project
