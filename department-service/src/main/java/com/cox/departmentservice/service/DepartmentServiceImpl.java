package com.cox.departmentservice.service;

import com.cox.departmentservice.model.Department;
import com.cox.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
     DepartmentRepository departmentRepository;
    @Autowired
    SequenceGeneratorService sequenceGeneratorService;
    @Override
    public Department saveDepartment(Department department) {
        department.setDepartmentId(sequenceGeneratorService.getSequenceNumber(Department.SEQUENCE_NAME));

        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(int departmentId) {
        return departmentRepository.findById(departmentId).get();
    }


}

