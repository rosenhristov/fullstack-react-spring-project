package com.rosenhristov.springbootlibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootLibraryApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryApplication.class, args);
	}

//	@Bean
//	public Class<?> MySQLDriver() {
//		try {
//			return (Class<?>) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}
//	}
}
