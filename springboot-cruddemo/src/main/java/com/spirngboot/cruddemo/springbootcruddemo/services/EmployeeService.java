package com.spirngboot.cruddemo.springbootcruddemo.services;

import com.spirngboot.cruddemo.springbootcruddemo.dtos.CreateEmployeeRequest;
import com.spirngboot.cruddemo.springbootcruddemo.dtos.CreateEmployeeResponse;
import com.spirngboot.cruddemo.springbootcruddemo.entity.Employee;

import java.util.List;

/**
 * Interface for employee services
 *
 * @author - Tarun Seetha
 * @version - 1.0
 */
public interface EmployeeService {

    /**
     * it will return created employee details
     *
     * @param createEmployeeRequest - Request inputs
     * @return instance of {@link CreateEmployeeResponse}
     */
    CreateEmployeeResponse createEmployee(CreateEmployeeRequest createEmployeeRequest);

    /**
     * To get list of all created employees
     *
     * @return List of {@link Employee}
     */
    List<Employee> getAllemployees();

    /**
     * To delete an existing employee
     *
     * @param id - Employee ID
     */
    void deleteEmployee(int id);

}
