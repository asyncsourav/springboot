package com.Scalar.p10_springBoot.service;


import com.Scalar.p10_springBoot.modal.Laptop;
import com.Scalar.p10_springBoot.repository.LaptopRepository;
import org.springframework.stereotype.Service;


@Service
public class LaptopService {

    private final LaptopRepository repository = new LaptopRepository();

    public void addLaptop(Laptop lap) {
        repository.Save(lap);
    }

    public boolean isGoodForProgramming(Laptop lap) {
        return true;
    }
}
