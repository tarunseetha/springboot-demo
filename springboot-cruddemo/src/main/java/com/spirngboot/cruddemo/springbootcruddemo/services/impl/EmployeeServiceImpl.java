package com.spirngboot.cruddemo.springbootcruddemo.services.impl;

import com.spirngboot.cruddemo.springbootcruddemo.dtos.CreateEmployeeRequest;
import com.spirngboot.cruddemo.springbootcruddemo.dtos.CreateEmployeeResponse;
import com.spirngboot.cruddemo.springbootcruddemo.entity.Employee;
import com.spirngboot.cruddemo.springbootcruddemo.respository.EmployeeRepository;
import com.spirngboot.cruddemo.springbootcruddemo.services.EmployeeService;
import com.spirngboot.cruddemo.springbootcruddemo.utils.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public CreateEmployeeResponse createEmployee(CreateEmployeeRequest createEmployeeRequest) {

        Employee entity = new Employee();

        entity.setName(createEmployeeRequest.getName());
        entity.setDept(createEmployeeRequest.getDept());
        entity.setSalary(createEmployeeRequest.getSalary());

        Employee savedEntity = employeeRepository.save(entity);

        return MapperUtils.mapToEmployeeResponse(savedEntity);
    }

    @Override
    public List<Employee> getAllemployees() {
        return null;
    }

    @Override
    public void deleteEmployee(int id) {

    }
}
