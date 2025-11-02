package com.klu.controller;

import com.klu.entity.EmployeeRecord;
import com.klu.service.EmployeeRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "http://localhost:5173")
public class EmployeeRecordController {

    private final EmployeeRecordService employeeRecordService;

    public EmployeeRecordController(EmployeeRecordService employeeRecordService) {
        this.employeeRecordService = employeeRecordService;
    }

    @PostMapping("/add")
    public EmployeeRecord addEmployee(@RequestBody EmployeeRecord employee) {
        return employeeRecordService.addEmployee(employee);
    }

    @GetMapping("/all")
    public List<EmployeeRecord> getAllEmployees() {
        return employeeRecordService.getAllEmployees();
    }
}
