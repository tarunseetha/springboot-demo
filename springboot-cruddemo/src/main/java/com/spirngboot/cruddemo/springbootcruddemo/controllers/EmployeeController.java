package com.spirngboot.cruddemo.springbootcruddemo.controllers;

import com.spirngboot.cruddemo.springbootcruddemo.dtos.CreateEmployeeRequest;
import com.spirngboot.cruddemo.springbootcruddemo.dtos.CreateEmployeeResponse;
import com.spirngboot.cruddemo.springbootcruddemo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public CreateEmployeeResponse createEmployee(@RequestBody CreateEmployeeRequest createEmployeeRequest) {

        return employeeService.createEmployee(createEmployeeRequest);

    }

}
