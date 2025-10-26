# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Recipe Calculator is a Spring Boot microservices project built using Clean Architecture principles with Spring Modulith for modular monolith architecture. The project uses Java 21 (with modules targeting Java 24) and Maven for build management.

## Build and Development Commands

### Building the Project
```bash
./mvnw clean install        # Build all modules
./mvnw clean package        # Package without installing to local repo
./mvnw clean compile        # Compile only
```

### Running Tests
```bash
./mvnw test                 # Run all tests
./mvnw test -pl authenticator  # Run tests for specific module
./mvnw test -Dtest=ClassName   # Run a single test class
./mvnw test -Dtest=ClassName#methodName  # Run a single test method
```

### Running the Application
```bash
./mvnw spring-boot:run      # Run from root (RecipeCalculatorApplication)
./mvnw spring-boot:run -pl authenticator  # Run authenticator module
./mvnw spring-boot:run -pl notification   # Run notification module
```

### Other Useful Commands
```bash
./mvnw dependency:tree      # View dependency tree
./mvnw clean                # Clean build artifacts
./mvnw compiler:compile     # Trigger annotation processors (MapStruct, Lombok)
```

## Architecture

### Multi-Module Structure

The project is a Maven multi-module project with:
- **Root module** (`recipe`): Parent POM with shared dependencies and configuration
- **authenticator**: Authentication and user management module
- **notification**: Notification service module (email, etc.)

### Clean Architecture Layers

Both `authenticator` and `notification` modules follow Clean Architecture with consistent package structure:

1. **domain**: Core business logic (innermost layer)
   - `model/`: Domain entities (records implementing `StateRecord`)
   - `repository/`: Repository interfaces (extend `BaseRepository<T>`)
   - `port/`: Outbound ports (interfaces for external dependencies)

2. **application**: Application business rules
   - `usecase/`: Use case implementations
   - `dto/`: Data Transfer Objects with value objects
   - `mapper/`: MapStruct mappers for DTO-to-Model conversion (using `DtoToModelMapper<D, M>`)
   - `service/`: Application services
   - `port/`: Inbound ports (interfaces)

3. **infrastructure**: External adapters and implementations
   - `adapter/`: Concrete implementations of domain ports
   - `event/`: Event publishers/adapters
   - `security/`: Security implementations

4. **interact**: User interface layer (outermost layer)
   - `controller/`: REST controllers
   - `service/`: Service interfaces for controllers
   - `model/`: Request/response models
   - `event/`: Event listeners

### Dependency Flow
Dependencies flow inward: interact → application → domain. Infrastructure implements domain ports but domain never depends on infrastructure.

### Inter-Module Communication

Modules communicate via **Spring Modulith events**:
- `authenticator` publishes events via `ApplicationEventPublisher` (see `EventNotificationAdapter`)
- `notification` listens with `@ApplicationModuleListener` (see `NotificationEventListener`)
- The authenticator module depends on notification module for shared DTOs/events

## Key Technologies

- **Spring Boot 3.5.6**: Core framework
- **Spring Modulith 1.4.1**: Modular monolith support with event-driven communication
- **MapStruct 1.6.3**: DTO-to-Model mapping (used in authenticator)
- **Lombok 1.18.42**: Boilerplate reduction
- **JTE 3.2.1**: Template engine (used in notification)
- **Sentry 8.16.0**: Error tracking and monitoring
- **Spring Boot Actuator**: Observability and metrics
- **Micrometer Tracing**: Distributed tracing with Brave

## Important Conventions

### Domain Models
- Domain entities are Java records implementing `StateRecord`
- Repository interfaces extend `BaseRepository<T>` with standard CRUD methods

### Mappers
- All mappers extend `DtoToModelMapper<D, M extends StateRecord>` interface
- Annotated with `@Mapper(componentModel = "spring")` for Spring integration
- Generated implementations are managed by MapStruct annotation processor

### Module Applications
- Each module has its own `Application.java` with `@SpringBootApplication`
- Uses `scanBasePackages` to limit component scanning to module package
- Root also has `RecipeCalculatorApplication.java` for running as single app

### Spring Configuration
- Main configuration in `src/main/resources/application.properties`
- Spring Boot DevTools enabled for hot reload during development
- Actuator endpoints available for monitoring

## Module-Specific Notes

### Authenticator Module
- Handles user authentication, user management, account management, and API key management
- Uses password hashing via `PasswordHashingPort` (implemented by `PasswordHashingAdapter`)
- Uses Base64 encoding via `EncoderPort` (implemented by `Base64EncoderAdapter`)
- Publishes notification events through `NotificationPort`
- REST endpoints under `/auth` prefix

### Notification Module
- Handles asynchronous notification delivery (`@EnableAsync`)
- Supports multiple notification types (defined in `NotificationType` enum)
- Uses JTE template engine for email templates
- Listens to application events from other modules
