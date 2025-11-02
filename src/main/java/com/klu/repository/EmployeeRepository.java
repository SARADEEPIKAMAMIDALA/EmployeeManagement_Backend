//package com.klu.repository;
//
//import com.klu.entity.Employee;
//import org.springframework.data.jpa.repository.JpaRepository;
//import java.util.Optional;
//
//public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//    Optional<Employee> findByEmail(String email);
//}

//package com.klu.repository;
//
//import com.klu.entity.Employee;
//import org.springframework.data.jpa.repository.JpaRepository;
//import java.util.Optional;
//
//public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//    Optional<Employee> findByEmail(String email);
//}



package com.klu.repository;

import com.klu.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmail(String email);
}