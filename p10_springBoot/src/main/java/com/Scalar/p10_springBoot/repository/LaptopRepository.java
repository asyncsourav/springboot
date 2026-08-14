package com.Scalar.p10_springBoot.repository;


import com.Scalar.p10_springBoot.modal.Laptop;
import org.springframework.stereotype.Repository;


@Repository
public class LaptopRepository {
    public void Save(Laptop lap) {
        System.out.println("Laptop saved");
    }
}
