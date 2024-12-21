# 4Rate - Backend Application
Application is implemented using MVC architectural style. It represents controller layer, which provides the basic and main functionalities available to the user before and after logging in to the system. In the context of Spring Boot, these controllers define REST endpoints that allow users to communicate and interact with the system

## Table of Contents
- [Features](#features)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Technologies](#technologies)
- [Prerequisites](#prerequisites)
- [Contributing](#contributing)

## Features
- User registration and authentication
- RESTful API for CRUD and other operations
- Exception handling and validation for robust APIs
- Configurable application properties
- Database integration with JPA and Hibernate

## Setup and Installation

1. Clone the repository:
   ```shell
   git clone https://github.com/aleksandarciri15/4rate-backend.git
   ```

2. Navigate to the project directory:
   ```shell
   cd 4rate-backend
   ```
3. Configure the Database
   Update the application.properties or application.yml file in the src/main/resources directory:
   ```shell
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database
   spring.datasource.username=your_username
   spring.datasource.password=your_password

   spring.jpa.hibernate.ddl-auto=update
   ```

5. Start the application:
   ```shell
   mvn clean install
   
   mvn spring-boot:run
   ```

## Usage

All request to application should be sent from 4rate-frontend appliction.
By default application will run on http://localhost:8080.

## Technologies

- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## Prerequisites

Before running the application, ensure the following are installed:

1. Java 17 or later
2. Maven 3.6+
3. MySQL


## Contributing 

Contributions are welcome!
