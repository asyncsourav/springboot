package com.scalar.p11_spring_JDBC.repo;


import com.scalar.p11_spring_JDBC.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class StudentRepo {

    public void save(Student s) {
        System.out.println("Data added");
    }

    public List<Student> findAll() {
        List<Student> arr = new ArrayList<>();
        return arr;
    }
}
