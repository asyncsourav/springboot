package com.scalar.server.service;


import com.scalar.server.model.Product;
import com.scalar.server.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {


    @Autowired
    private ProductRepo productRepo;


    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
}
