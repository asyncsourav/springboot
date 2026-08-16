package com.scalar.server.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class ProductController {


    @GetMapping("/products")
    public String GetProducts() {
        return "List of all products...";
    }
}
