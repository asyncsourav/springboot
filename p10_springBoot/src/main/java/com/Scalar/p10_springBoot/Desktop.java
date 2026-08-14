package com.Scalar.p10_springBoot;


import org.springframework.stereotype.Component;


@Component
public class Desktop implements Computer {

    @Override
    public void Compile() {
        System.out.println("Compiling using Desktop");
    }
}
