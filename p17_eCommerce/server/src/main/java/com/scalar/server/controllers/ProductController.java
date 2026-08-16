package com.scalar.server.controllers;


import com.scalar.server.model.Product;
import com.scalar.server.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ProductController {


    @Autowired
    private ProductService productService;


    @GetMapping("/products")
    public List<Product> GetProducts() {
        return productService.getAllProducts();
    }

}
