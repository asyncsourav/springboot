package com.scalar.p06_p07_spring_demo;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    Laptop laptop;

    public void Code() {
        laptop.Compile();
        System.out.println("Alien is Coding...");
    }
}
