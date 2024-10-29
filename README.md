# Web Automation Test Suite

This project serves as a starter template for web automation testing using **Selenium WebDriver**, **TestNG**, and **JaCoCo** for code coverage analysis. It provides a foundational setup for writing and managing automated tests for web applications.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Running Tests](#running-tests)
- [Generating Coverage Reports](#generating-coverage-reports)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Features

- **Selenium WebDriver**: Automates browser interactions for testing web applications.
- **TestNG**: Facilitates test organization, execution, and reporting.
- **JaCoCo**: Analyzes code coverage and generates detailed coverage reports.
- **Screenshot Capture**: Automatically captures screenshots for failed tests to aid debugging.

## Technologies Used

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **JaCoCo**
- **Maven**

## Getting Started

### Prerequisites

- **Java JDK** (version 8 or higher)
- **Apache Maven** (version 3.6.0 or higher)
- **WebDriver** (e.g., ChromeDriver for Google Chrome)

### Installation

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd <repository-directory>


mvn test
mvn jacoco:report

structure
└── src
    └── main
        └── java
            └── com
                └── example
                    └── webtests
                        ├── WebsiteTest.java        # Contains the test cases
                        └── BaseTest.java           # Base class for reporting and setup


