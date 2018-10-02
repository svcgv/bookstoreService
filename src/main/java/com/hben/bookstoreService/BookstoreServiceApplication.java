package com.hben.bookstoreService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BookstoreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreServiceApplication.class, args);
	}
}
