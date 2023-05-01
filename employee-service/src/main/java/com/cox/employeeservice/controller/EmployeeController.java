package com.cox.employeeservice.controller;


import com.cox.employeeservice.dto.ResponseDto;
import com.cox.employeeservice.model.Department;
import com.cox.employeeservice.model.Employee;
import com.cox.employeeservice.service.EmployeeService;
import com.cox.employeeservice.service.SequenceGeneratorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;


@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
   EmployeeService employeeService;

    //private SequenceGeneratorService sequenceGeneratorService;

    @PostMapping("/add")
    public ResponseEntity<Employee> saveEmp(@RequestBody Employee employee) {
        Employee saveEmployee = employeeService.saveEmp(employee);
        return new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseDto> getEmp(@PathVariable("id") int id) {
        ResponseDto responseDto = employeeService.getEmp(id);
        return ResponseEntity.ok(responseDto);
    }

}

//    @PostMapping("/addemp")
//    public Employee addEmpl(@RequestBody Employee employee) {
//        return employeeService.addEmpl(employee);
//    }
//
//    @GetMapping("/listempl")
//    public List<Employee> getEmpl() {
//        Department[] employeees =restTemplate.getForObject("http://localhost:9002/department/{id}", Department[].class);
//        return employeeService.getempl();
//    }
//
//    @GetMapping("/viewbyid/{employeeId}")
//    public Optional<Employee> listById(@PathVariable("employeeId") int employeeId) {
//
//        return employeeService.listById(employeeId);
//    }
//
//    @DeleteMapping("/delete/{employeeId}")
//    public String deleteEmpl(@PathVariable("employeeId") int employeeId) {
//
//        employeeService.deleteEmpl(employeeId);
//        return "data deleted successfully";
//    }
//
//    @PutMapping("/update/{employeeId}")
//    public Employee updateEmpl(@RequestBody Employee employee, @PathVariable("employeeId") int employeeId) {
//
//        return employeeService.updateEmpl(employeeId, employee);
//    }

