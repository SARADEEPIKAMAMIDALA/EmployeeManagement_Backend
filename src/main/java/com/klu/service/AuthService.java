//package com.klu.service;
//
//import com.klu.entity.Employee;
//import com.klu.entity.HrAdmin;
//import com.klu.repository.EmployeeRepository;
//import com.klu.repository.HrAdminRepository;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AuthService {
//
//    private final EmployeeRepository employeeRepo;
//    private final HrAdminRepository hrRepo;
//    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//
//    public AuthService(EmployeeRepository employeeRepo, HrAdminRepository hrRepo) {
//        this.employeeRepo = employeeRepo;
//        this.hrRepo = hrRepo;
//    }
//
//    public boolean loginEmployee(String email, String password) {
//        return employeeRepo.findByEmail(email)
//                .map(emp -> passwordEncoder.matches(password, emp.getPassword()))
//                .orElse(false);
//    }
//
//    public boolean loginHr(String email, String password) {
//        return hrRepo.findByEmail(email)
//                .map(hr -> passwordEncoder.matches(password, hr.getPassword()))
//                .orElse(false);
//    }
//}

//package com.klu.service;
//
//import com.klu.entity.Employee;
//import com.klu.entity.HrAdmin;
//import com.klu.repository.EmployeeRepository;
//import com.klu.repository.HrAdminRepository;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AuthService {
//
//    private final EmployeeRepository employeeRepo;
//    private final HrAdminRepository hrRepo;
//    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//
//    public AuthService(EmployeeRepository employeeRepo, HrAdminRepository hrRepo) {
//        this.employeeRepo = employeeRepo;
//        this.hrRepo = hrRepo;
//    }
//
//    public boolean loginEmployee(String email, String password) {
//        return employeeRepo.findByEmail(email)
//                .map(emp -> passwordEncoder.matches(password, emp.getPassword()))
//                .orElse(false);
//    }
//
//    public boolean loginHr(String email, String password) {
//        return hrRepo.findByEmail(email)
//                .map(hr -> passwordEncoder.matches(password, hr.getPassword()))
//                .orElse(false);
//    }
//}
//
package com.klu.service;

import com.klu.entity.Employee;
import com.klu.entity.HrAdmin;
import com.klu.repository.EmployeeRepository;
import com.klu.repository.HrAdminRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final EmployeeRepository employeeRepo;
    private final HrAdminRepository hrRepo;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public AuthService(EmployeeRepository employeeRepo, HrAdminRepository hrRepo) {
        this.employeeRepo = employeeRepo;
        this.hrRepo = hrRepo;
    }

    public boolean loginEmployee(String email, String password) {
        return employeeRepo.findByEmail(email)
                .map(emp -> passwordEncoder.matches(password, emp.getPassword()))
                .orElse(false);
    }

    public boolean loginHr(String email, String password) {
        return hrRepo.findByEmail(email)
                .map(hr -> passwordEncoder.matches(password, hr.getPassword()))
                .orElse(false);
    }

    // New method for Employee sign-up
    public Employee registerEmployee(Employee employee) {
        // Hash the password before saving
        employee.setPassword(passwordEncoder.encode(employee.getPassword()));
        return employeeRepo.save(employee);
    }

    // New method for HR Admin sign-up
    public HrAdmin registerHr(HrAdmin hrAdmin) {
        // Hash the password before saving
        hrAdmin.setPassword(passwordEncoder.encode(hrAdmin.getPassword()));
        return hrRepo.save(hrAdmin);
    }
}
