# YDA Framework

YDA is a software project designed to empower Java enterprises with cutting-edge AI Assistant capabilities. By adopting a modular approach, YDA enables the development of custom components, offering flexibility to either create tailored solutions or select from pre-built options. The YDA Framework helps developers integrate and rapidly launch virtual assistants on various platforms, simplifying the creation of assistants that can utilize platform data to provide relevant answers to user queries.

## Why is this project useful?

- **Bringing AI Assistant Technology to Java Enterprises**: YDA is pioneering the integration of AI assistant technology in the Java ecosystem, making it accessible to a wide range of enterprises that rely on this platform.
- **Data Ownership and Flexibility**: We empower enterprises to truly own their data, offering the flexibility to either deploy data in the cloud or manage it securely within their own infrastructure.
- **Modularity for Custom Solutions**: YDA’s modular architecture is designed with enterprise needs in mind, allowing businesses to easily customize and extend the framework to meet their specific requirements. Modularity is key in enterprise environments, and YDA delivers it effectively.

Building from Source
-------

You don’t need to build from source to use YDA (binaries in [repo.yda](https://github.com/love-vector/yda)), but if you want to try out the latest and greatest, YDA can be built and published to your local Maven cache using the Gradle wrapper. You also need JDK 17. And JDK 11 if you use only YDA core functionality

```
$ ./gradlew publishToMavenLocal
```

This will build all of the jars and documentation and publish them to your local Maven cache.
It won't run any of the tests.
If you want to build everything, use the `build` task:

```
$ ./gradlew build
```

### Example Usage

Before starting with YDA Framework, ensure your project is set up to include the dependencies listed below.

### Dependencies

To integrate the YDA Framework into your project, add the following dependencies to your `build.gradle` (Gradle) or `pom.xml` (Maven) file:

#### Gradle:

```groovy
plugins {
    id "java"
    id "org.springframework.boot" version "3.3.2"
    id "io.spring.dependency-management" version "1.1.6"
}

ext {
    ydaFrameworkVersion = "0.0.1"
}

bootJar {
    enabled = true
}

jar {
    enabled = false
}

group = 'org.projects'
version = '1.0-SNAPSHOT'

repositories {
    mavenLocal()
    mavenCentral()
    maven { url 'https://repo.spring.io/milestone' }
}

dependencies {
    implementation "ai.yda:rag-starter:${ydaFrameworkVersion}"
    implementation "ai.yda:rag-assistant-starter:${ydaFrameworkVersion}"
    implementation "ai.yda:rest-spring-channel:${ydaFrameworkVersion}"
    implementation "ai.yda:openai-assistant-generator-starter:${ydaFrameworkVersion}" // sse
    implementation "ai.yda:website-retriever-starter:${ydaFrameworkVersion}"
    implementation 'org.springframework.boot:spring-boot-starter'
    compileOnly "org.projectlombok:lombok:1.18.30"
    annotationProcessor "org.projectlombok:lombok:1.18.30"
    testImplementation platform('org.junit:junit-bom:5.9.1')
    testImplementation 'org.junit.jupiter:junit-jupiter'
}
```

#### Maven:
```
<properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <yda.framework.version>0.0.1</yda.framework.version>
        <spring.boot.version>3.3.2</spring.boot.version>
        <lombok.version>1.18.30</lombok.version>
    </properties>

    <repositories>
        <repository>
            <id>spring-milestones</id>
            <name>Spring Milestones</name>
            <url>https://repo.spring.io/milestone</url>
        </repository>
        <repository>
            <id>spring-snapshots</id>
            <name>Spring Snapshots</name>
            <url>https://repo.spring.io/snapshot</url>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>ai.yda</groupId>
            <artifactId>rag-starter</artifactId>
            <version>${yda.framework.version}</version>
        </dependency>
        <dependency>
            <groupId>ai.yda</groupId>
            <artifactId>rag-assistant-starter</artifactId>
            <version>${yda.framework.version}</version>
        </dependency>

        <dependency>
            <groupId>ai.yda</groupId>
            <artifactId>rest-spring-channel</artifactId>
            <version>${yda.framework.version}</version>
        </dependency>

        <dependency>
            <groupId>ai.yda</groupId>
            <artifactId>openai-assistant-generator-starter</artifactId>
            <version>${yda.framework.version}</version>
        </dependency>

        <dependency>
            <groupId>ai.yda</groupId>
            <artifactId>website-retriever-starter</artifactId>
            <version>${yda.framework.version}</version>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter</artifactId>
            <version>${spring.boot.version}</version>
        </dependency>

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>${lombok.version}</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>

    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-dependencies</artifactId>
                <version>${spring.boot.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
```

You will also need to configure environment variables for normal operation 
#### Environment Variables:
```
ai:
  yda:
    framework:
      rag:
        retriever:
          website:
            collectionName: websites
            sitemapUrl: ${SITE_MAP}
            topK: [SET_YOUR_VALUE]
            isProcessingEnabled: ${PROCESSING_ENABLE}
            clearCollectionOnStartup: ${CLEAR_COLLECTION_ON_STARTUP}
        generator:
          assistant:
            openai:
              assistant-id: ${ASSISTANT_ID}
      channel:
        rest:
          spring:
            endpoint-relative-path: ${ENDPOINT_RELATIVE_PATH}
            security-token: ${SECURITY_TOKEN}

spring:
  ai:
    vectorstore:
      milvus:
        client:
          host: ${MILVUS_HOST}
          port: ${MILVUS_PORT}
          username: ${USERNAME}
          password: ${PASSWORD}
        databaseName: ${DATABASE_NAME}
        collectionName: ${COLLECTION_NAME}
        embeddingDimension: 1536
        indexType: IVF_FLAT
        metricType: COSINE
        initializeSchema: ${ENABLE_INITIALIZE}
    openai:
      api-key: ${OPENAI_API_KEY}
      chat:
        options:
          model: ${MODEL}
          temperature:${TEMPERATURE}
      embedding:
        options:
          model: ${EMBEDING_MODEL}
```
Lastly, you will need to configure your main class as shown in the following example 

#### Main:
```
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
```

Now you can send request to assistant and ask any question

### Request
```
http://localhost:8080/${ENDPOINT_RELATIVE_PATH}
```

Contributing
-------
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



