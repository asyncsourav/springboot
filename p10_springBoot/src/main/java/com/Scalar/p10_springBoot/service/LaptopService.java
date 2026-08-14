package com.Scalar.p10_springBoot.service;


import com.Scalar.p10_springBoot.modal.Laptop;
import com.Scalar.p10_springBoot.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repository;

    public void addLaptop(Laptop lap) {
        repository.Save(lap);
    }

    public boolean isGoodForProgramming(Laptop lap) {
        return true;
    }
}
