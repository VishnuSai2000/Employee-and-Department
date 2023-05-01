package com.cox.employeeservice.service;



import com.cox.employeeservice.dto.ResponseDto;
import com.cox.employeeservice.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {


    Employee saveEmp(Employee employee);

    ResponseDto getEmp(int id);

//    public Employee addEmpl(Employee employee);
//
//    public List<Employee> getempl();
//
//    public Optional<Employee> listById(int employeeId);
//
//    public void deleteEmpl(int employeeId);
//
//    public Employee updateEmpl(int employeeId, Employee employee);
}
