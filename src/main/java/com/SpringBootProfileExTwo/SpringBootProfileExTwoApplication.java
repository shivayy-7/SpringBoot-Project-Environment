package com.SpringBootProfileExTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.SpringBootProfileExOne.*")
public class SpringBootProfileExTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfileExTwoApplication.class, args);
	}

}
