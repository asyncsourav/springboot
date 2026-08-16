package com.Scalar.p10_springBoot;



import com.Scalar.p10_springBoot.modal.Laptop;
import com.Scalar.p10_springBoot.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class P10SpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(P10SpringBootApplication.class, args);


		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);



//		Alien abj = context.getBean(Alien.class);
//		abj.Code();
//		System.out.println(abj.getAge());

	}
}
