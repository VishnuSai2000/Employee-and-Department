package com.cox.employeeservice.repository;


import com.cox.employeeservice.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
}
