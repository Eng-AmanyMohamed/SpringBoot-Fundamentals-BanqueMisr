# @SpringBootApplication Annotation Breakdown

The `@SpringBootApplication` annotation is a combination of:

- `@Configuration` – Marks the class as a source of bean definitions.
- `@EnableAutoConfiguration` – Enables Spring Boot’s auto-configuration mechanism.
- `@ComponentScan` – Enables component scanning in the package.

### Exclusion Applied

In this project, we excluded the `DataSourceAutoConfiguration` to prevent Spring Boot from auto-configuring a database connection:

```java
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
```