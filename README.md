# YDA Framework

YDA Framework is a tool for quickly deploying assistants on large Java platforms, allowing them to use the platform's context to answer questions, effectively replacing managers.

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


#### Maven:
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

#### Contributing
To ensure the correct operation of the YDA Framework, include the following parameters in your application.properties or application.yml file:

#### License


