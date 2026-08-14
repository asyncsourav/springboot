package com.scalar.p06_p07_spring_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class P06P07SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(P06P07SpringDemoApplication.class, args);

		Alien abj = context.getBean(Alien.class);
		abj.Code();

	}
}
