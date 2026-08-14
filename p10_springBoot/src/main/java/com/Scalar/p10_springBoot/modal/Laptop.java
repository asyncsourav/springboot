package com.Scalar.p10_springBoot.modal;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class Laptop implements Computer {

    @Override
    @Primary
    public void Compile() {
        System.out.println("Compiling using Laptop");
    }
}
