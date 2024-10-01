package com.example.springboot_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_backend.model.employee;
import com.example.springboot_backend.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    

    @Autowired
    private EmployeeRepository employeeRepository;

    // get all employees


    @GetMapping("/employees")
    // public String getMethodName(@RequestParam String param) {
    //     return new String();
    // }
    
    public List<employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


}
