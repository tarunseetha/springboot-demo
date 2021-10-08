package com.spirngboot.cruddemo.springbootcruddemo.utils;

import com.spirngboot.cruddemo.springbootcruddemo.dtos.CreateEmployeeResponse;
import com.spirngboot.cruddemo.springbootcruddemo.entity.Employee;

public class MapperUtils {
    public static CreateEmployeeResponse mapToEmployeeResponse(Employee savedEntity) {
        CreateEmployeeResponse createEmployeeResponse = new CreateEmployeeResponse();
        createEmployeeResponse.setName(savedEntity.getName());
        return createEmployeeResponse;
    }
}
