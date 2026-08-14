package com.Scalar.p10_springBoot;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class P10SpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(P10SpringBootApplication.class, args);

		Alien abj = context.getBean(Alien.class);
		abj.Code();
		System.out.println(abj.getAge());

	}
}
