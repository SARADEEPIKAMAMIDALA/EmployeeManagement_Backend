//package com.klu.controller;
//
//import com.klu.entity.Employee;
//import com.klu.repository.EmployeeRepository;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/employees")
//@CrossOrigin(origins = "http://localhost:5173") // Allow frontend requests
//public class EmployeeController {
//
//    private final EmployeeRepository employeeRepository;
//
//    public EmployeeController(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
//
//    // ✅ Get all employees
//    @GetMapping
//    public List<Employee> getAllEmployees() {
//        return employeeRepository.findAll();
//    }
//
//    // ✅ Add new employee
//    @PostMapping
//    public Employee addEmployee(@RequestBody Employee employee) {
//        return employeeRepository.save(employee);
//    }
//
//    // ✅ Delete employee (optional)
//    @DeleteMapping("/{id}")
//    public void deleteEmployee(@PathVariable Long id) {
//        employeeRepository.deleteById(id);
//    }
//
//    // ✅ Update employee (optional)
//    @PutMapping("/{id}")
//    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee updatedEmployee) {
//        return employeeRepository.findById(id)
//                .map(emp -> {
//                    emp.setName(updatedEmployee.getName());
//                    emp.setEmail(updatedEmployee.getEmail());
//                    emp.setPassword(updatedEmployee.getPassword());
//                    return employeeRepository.save(emp);
//                })
//                .orElseThrow(() -> new RuntimeException("Employee not found"));
//    }
//}
