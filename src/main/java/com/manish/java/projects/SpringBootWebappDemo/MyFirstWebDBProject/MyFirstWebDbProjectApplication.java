package com.manish.java.projects.SpringBootWebappDemo.MyFirstWebDBProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstWebDbProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstWebDbProjectApplication.class, args);
		
		System.out.println("My First JPA App is Up and Running ...");
	}

}
