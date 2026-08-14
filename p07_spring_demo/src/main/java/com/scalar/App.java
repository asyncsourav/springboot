

package com.scalar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // ! You could see these in "../../../resources/spring.xml"
        // * with singleton -> we will always only one object for a class and everytime that one will be called 
        // * with prototype -> we will always create a new object of the Class 

        // ! Also an importmat point here -> 
        // 1. for singleton - that object will created in the container when it is loaded by the ApplicationContext(at the start of execution of any code)
        // 2. But for Prototype - that object will only be created only when it is actually called by the getBeans() -> only when it is required and we call it, then it will be created inside the container


        Alien obj1 = (Alien) context.getBean("alien1");
        System.out.println(obj1.num);
        obj1.num = 25;
        
        Alien obj2 = (Alien) context.getBean("alien1");
        System.out.println(obj2.num);
        
    }
}
