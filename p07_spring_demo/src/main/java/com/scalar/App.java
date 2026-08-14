

package com.scalar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj1 = (Alien) context.getBean("alien1");
        obj1.Code();

        Alien obj2 = (Alien) context.getBean("alien1");
        obj2.Code();

        
    }
}
