package com.example.springboot_fundamentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootFundamentalsApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootFundamentalsApplication.class, args);

	}

}
