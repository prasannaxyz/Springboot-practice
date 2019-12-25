package com.springboot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.springboot.learn")
public class SpringBooltApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBooltApplication.class, args);
	}

}
