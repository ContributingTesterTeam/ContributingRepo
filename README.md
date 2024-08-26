# YDA Framework

YDA Framework is a technology based on the principles of Retrieval-Augmented Generation (RAG), specifically designed for rapid creation and integration of artificial intelligence into web applications with minimal resource expenditure. Developed in Java, YDA provides a suite of built-in tools for processing large volumes of data, including functionalities for search, sorting, and data retrieval. These capabilities can be optionally disabled according to the user’s needs.

## What does this project do?

The YDA Framework helps developers integrate and rapidly launch virtual assistants on various platforms. The framework simplifies the creation of assistants that can utilize platform data to provide relevant answers to user queries.

## Why is this project useful?

- **Quick Integration**: Minimal effort required to add an assistant to an existing project.
- **Scalability**: Supports large platforms with high traffic.
- **Context Utilization**: Assistants use platform data and context to deliver relevant responses.

## Getting Started

### Example Usage

Before starting with YDA Framework, ensure your project is set up to include the dependencies listed below.

### Dependencies

To integrate the YDA Framework into your project, add the following dependencies to your `build.gradle` (Gradle) or `pom.xml` (Maven) file:

#### Gradle:

```groovy
implementation "ai.yda:yda-application:1.0.0"
implementation "ai.yda:yda-channel-rest-spring-sync:1.0.0"
```

#### Maven:
```
<dependency>
    <groupId>ai.yda</groupId>
    <artifactId>yda-application</artifactId>
    <version>1.0.0</version>
</dependency>
<dependency>
    <groupId>ai.yda</groupId>
    <artifactId>yda-channel-rest-spring-sync</artifactId>
    <version>1.0.0</version>
</dependency>
```

#### Contributing
For contribution guidelines, see [CONTRIBUTING](link).

License
-------
```
                    GNU GENERAL PUBLIC LICENSE
                       Version 3, 29 June 2007

 Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.
```

Requirements
-------
YDA Framework operates on Java 17+ and heavily integrates with the Spring Framework. If you plan to utilize the existing tools provided by YDA, you will need to implement it within a Spring-based environment. 

YDA also leverages vector databases like Milvus for efficient data processing and retrieval.

We recommend keeping your Java environment and dependencies up-to-date to ensure optimal performance and security. Given the importance of compatibility and security, staying current with the latest versions of Java and Spring Framework is highly advised.

YDA works seamlessly with your platform's native tools and libraries. However, to fully leverage its capabilities, including the advanced data processing features, ensure that your environment is configured with the required dependencies, particularly those related to Spring and vector databases.



