package com.cox.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeDto {


    private int id;

    private String employeeName;

    private double salary;

    //private String departmentId;
}
