

package com.scalar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // ! with singleton -> we will always only one object for a class and everytime that one will be called 
        // ! with prototype -> we will always create a new object of the Class 
        // * You could see these in "../../../resources/spring.xml"


        Alien obj1 = (Alien) context.getBean("alien1");
        System.out.println(obj1.num);
        obj1.num = 25;
        
        Alien obj2 = (Alien) context.getBean("alien1");
        System.out.println(obj2.num);
        
    }
}
