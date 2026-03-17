# Spring IA Mono Services

A monolithic Spring Boot service designed for testing with Spring IA (Intelligent Agent) MCP integration. This project demonstrates a modern Java microservice architecture using Spring Boot 4.0.3 and integrates with advanced AI/ML capabilities.

## 🚀 Overview

**spring_ia_mono_services** is a test-oriented monolithic backend service built with Spring Boot. It features integration with Spring IA MCP (Model Context Protocol) to enable intelligent agent capabilities within a traditional Spring framework.

- **Language:** 100% Java
- **Build Tool:** Maven
- **Java Version:** 17
- **Spring Boot Version:** 4.0.3
- **Database:** PostgreSQL

## 🛠️ Technology Stack

### Core Framework
- **Spring Boot 4.0.3** - Modern Spring framework with latest features
- **Spring Data JPA** - ORM and database abstraction
- **Spring Web MVC** - RESTful API development

### Data & Mapping
- **MapStruct 1.5.5.Final** - Declarative bean mapping
- **Lombok 1.18.32** - Reduce boilerplate code
- **Specification Arg Resolver 4.0.0** - Dynamic query building

### Database
- **PostgreSQL** - Robust relational database

### Testing
- **Spring Boot Test** - Testing framework
- **Spring Security Test** - Security testing utilities

## 📋 Project Structure

```
spring_ia_mono_services/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/jcr/monoservices/
│   │   │       ├── controller/     # REST endpoints
│   │   │       ├── service/        # Business logic
│   │   │       ├── repository/     # Data access
│   │   │       ├── entity/         # JPA entities
│   │   │       ├── dto/            # Data transfer objects
│   │   │       └── mapper/         # MapStruct mappers
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/jcr/monoservices/
└── pom.xml
```

## 🔧 Key Dependencies

### Spring Framework
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webmvc</artifactId>
</dependency>
```

### Mapping & Code Generation
```xml
<dependency>
    <groupId>org.mapstruct</groupId>
    <artifactId>mapstruct</artifactId>
    <version>1.5.5.Final</version>
</dependency>

<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.32</version>
</dependency>
```

### Database
```xml
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
```

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6+
- PostgreSQL 12+

### Installation

1. **Clone the repository**
```bash
git clone https://github.com/jclaudior/spring_ia_mono_services.git
cd spring_ia_mono_services
```

2. **Configure database connection**

Create or update `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/monoservices
spring.datasource.username=postgres
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

3. **Build the project**

On Unix/Linux/Mac:
```bash
./mvnw clean install
```

On Windows:
```bash
mvnw.cmd clean install
```

4. **Run the application**

On Unix/Linux/Mac:
```bash
./mvnw spring-boot:run
```

On Windows:
```bash
mvnw.cmd spring-boot:run
```

The application will start on `http://localhost:8080`

## 📝 Configuration

### Application Properties

Key configuration options in `application.properties`:

```properties
# Server
server.port=8080
server.servlet.context-path=/api

# Database
spring.datasource.url=jdbc:postgresql://localhost:5432/monoservices
spring.datasource.username=postgres
spring.datasource.password=your_password

# JPA/Hibernate
spring.jpa.hibernate.ddl-auto=validate
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

# Logging
logging.level.root=INFO
logging.level.com.jcr.monoservices=DEBUG
```

## 🧪 Testing

Run all tests:

On Unix/Linux/Mac:
```bash
./mvnw test
```

On Windows:
```bash
mvnw.cmd test
```

Run specific test class:
```bash
./mvnw test -Dtest=YourTestClass
```

## ✨ Features

- **RESTful API** - Comprehensive REST endpoints for service operations
- **Database Abstraction** - Clean data access layer with Spring Data JPA
- **Bean Mapping** - Efficient object-to-object mapping with MapStruct
- **Code Reduction** - Boilerplate-free code with Lombok annotations
- **Dynamic Queries** - Advanced query building with Specification Arg Resolver
- **Spring IA MCP Integration** - AI-powered capabilities for intelligent operations
- **Comprehensive Testing** - Full test coverage with Spring Boot testing utilities

## 📚 API Documentation

Once the application is running, API documentation can be accessed at:
- `http://localhost:8080/api/swagger-ui.html` (if Springdoc OpenAPI is configured)
- Review `src/main/java/com/jcr/monoservices/controller/` for available endpoints

## 🔗 Useful Links

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Data JPA Guide](https://spring.io/projects/spring-data-jpa)
- [MapStruct Documentation](https://mapstruct.org/)
- [Lombok Features](https://projectlombok.org/)
- [PostgreSQL Documentation](https://www.postgresql.org/docs/)

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is open source and available under the MIT License.

## 👤 Author

**jclaudior** - GitHub: [@jclaudior](https://github.com/jclaudior)

---

**Note:** This is a monolithic service designed for testing purposes with Spring IA MCP integration. For production use, consider implementing additional security measures, monitoring, and logging configurations.