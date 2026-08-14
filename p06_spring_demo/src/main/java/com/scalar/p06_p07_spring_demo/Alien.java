package com.scalar.p06_p07_spring_demo;

import org.springframework.stereotype.Component;

@Component
public class Alien {

    final Laptop laptop = new Laptop();

    public void Code() {
        laptop.Compile();
        System.out.println("Alien is Coding...");
    }
}
