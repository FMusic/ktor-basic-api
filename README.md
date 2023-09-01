# Basic Kotlin Ktor API Skeleton

This repository contains a basic skeleton of a Kotlin Ktor API project, pre-configured with essential dependencies and
settings.

## Prerequisites

Before you begin, ensure you have the following installed on your system:

- [Kotlin](https://kotlinlang.org/docs/tutorials/command-line.html)
- [Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)

## Getting Started

1. Clone this repository:

```bash
git clone https://github.com/your-username/kotlin-ktor-api.git
cd kotlin-ktor-api
```

2. Build and run the project:

```bash
./gradlew run
```

The API will start, and you can access it at http://localhost:8080.

# Dependencies

The project is set up with the following dependencies:

- Ktor: A framework for building asynchronous servers and clients in connected systems using the Kotlin programming
  language.
- Gson: A library to convert Kotlin objects into JSON and vice versa.
- Koin: A pragmatic lightweight dependency injection framework for Kotlin.

# Configuration

The project includes configuration files and code snippets to get you started:

- `application.conf`: The Ktor application configuration file, specifying the server settings.
- `Application.kt`: The entry point of the application.
- `ApplicationService.kt`: Koin dependency injected service.
- `Koin.kt`: Koin dependency injection configuration.
- `Routing.kt`: Ktor routing configuration.

# Usage

Define your routes and handlers in Routes.kt.
Add your business logic and services, and inject them using Koin in the Koin.kt file.
Customize the sample controller in Routes.kt or create new controllers as needed.
Feel free to fork this repository and customize it to your needs.

# To Do
- [ ] Add Docker Support
- [ ] Add Execution on Local Machine
- [ ] Auto Export Swagger File
- [x] Add Swagger UI

# Contributing

Contributions are welcome! Feel free to open issues or submit pull requests for improvements or additional features.

# License

This project is licensed under the MIT License.