package com.klu.service;

import com.klu.entity.EmployeeRecord;
import com.klu.repository.EmployeeRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeRecordService {

    private final EmployeeRecordRepository employeeRecordRepository;

    public EmployeeRecordService(EmployeeRecordRepository employeeRecordRepository) {
        this.employeeRecordRepository = employeeRecordRepository;
    }

    public EmployeeRecord addEmployee(EmployeeRecord employee) {
        return employeeRecordRepository.save(employee);
    }

    public List<EmployeeRecord> getAllEmployees() {
        return employeeRecordRepository.findAll();
    }
}
