package com.cox.employeeservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Employee")
public class Employee {

    @Transient
    public static final String SEQUENCE_NAME = "employee_sequence";
    @Id
    private int id;

    private String employeeName;

    private double salary;

    private int departmentId;
}
