package com.spirngboot.cruddemo.springbootcruddemo.dtos;

import lombok.Data;

@Data
public class CreateEmployeeRequest {

    private int id;
    private String name;
    private String dept;
    private String salary;
}
