package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.service.Arithmetic;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DemoApplication.class, args);
		
		Arithmetic ar= context.getBean(Arithmetic.class);
		
		System.out.println("Sum :"+ar.sum(100, 200));
		
		System.out.println("Sub "+ar.sub(200, 100));
	}

}
