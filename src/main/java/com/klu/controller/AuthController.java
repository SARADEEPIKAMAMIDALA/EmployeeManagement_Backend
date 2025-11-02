//package com.klu.controller;
//
//import com.klu.service.AuthService;
//import org.springframework.web.bind.annotation.*;
//@RestController
//@RequestMapping("/api/auth")
//@CrossOrigin(origins = "http://localhost:3000") // React app URL
//public class AuthController {
//
//    private final AuthService authService;
//
//    public AuthController(AuthService authService) {
//        this.authService = authService;
//    }
//
//    @PostMapping("/employee/login")
//    public boolean loginEmployee(@RequestBody LoginRequest request) {
//        return authService.loginEmployee(request.getEmail(), request.getPassword());
//    }
//
//    @PostMapping("/hr/login")
//    public boolean loginHr(@RequestBody LoginRequest request) {
//        return authService.loginHr(request.getEmail(), request.getPassword());
//    }
//
//    // DTO for login
//    public static class LoginRequest {
//        private String email;
//        private String password;
//
//        public String getEmail() { return email; }
//        public void setEmail(String email) { this.email = email; }
//        public String getPassword() { return password; }
//        public void setPassword(String password) { this.password = password; }
//    }
//}

//package com.klu.controller;
//
//import com.klu.entity.Employee;
//import com.klu.entity.HrAdmin;
//import com.klu.service.AuthService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
//
//@RestController
//@RequestMapping("/api/auth")
//// Update the origin to match your React app's port
//@CrossOrigin(origins = "http://localhost:5173")
//public class AuthController {
//
//    private final AuthService authService;
//
//    public AuthController(AuthService authService) {
//        this.authService = authService;
//    }
//
//    @PostMapping("/employee/login")
//    public boolean loginEmployee(@RequestBody LoginRequest request) {
//        return authService.loginEmployee(request.getEmail(), request.getPassword());
//    }
//
//    @PostMapping("/hr/login")
//    public boolean loginHr(@RequestBody LoginRequest request) {
//        return authService.loginHr(request.getEmail(), request.getPassword());
//    }
//
//    @PostMapping("/employee/signup")
//    public ResponseEntity<String> signupEmployee(@RequestBody SignUpRequest request) {
//        Employee newEmployee = new Employee();
//        newEmployee.setName(request.getName());
//        newEmployee.setEmail(request.getEmail());
//        newEmployee.setPassword(request.getPassword());
//
//        try {
//            authService.registerEmployee(newEmployee);
//            return new ResponseEntity<>("Employee registered successfully!", HttpStatus.CREATED);
//        } catch (Exception e) {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Registration failed: " + e.getMessage());
//        }
//    }
//
//    @PostMapping("/hr/signup")
//    public ResponseEntity<String> signupHr(@RequestBody SignUpRequest request) {
//        HrAdmin newHrAdmin = new HrAdmin();
//        newHrAdmin.setName(request.getName());
//        newHrAdmin.setEmail(request.getEmail());
//        newHrAdmin.setPassword(request.getPassword());
//
//        try {
//            authService.registerHr(newHrAdmin);
//            return new ResponseEntity<>("HR Admin registered successfully!", HttpStatus.CREATED);
//        } catch (Exception e) {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Registration failed: " + e.getMessage());
//        }
//    }
//
//    public static class LoginRequest {
//        private String email;
//        private String password;
//        public String getEmail() { return email; }
//        public void setEmail(String email) { this.email = email; }
//        public String getPassword() { return password; }
//        public void setPassword(String password) { this.password = password; }
//    }
//
//    public static class SignUpRequest {
//        private String name;
//        private String email;
//        private String password;
//        public String getName() { return name; }
//        public void setName(String name) { this.name = name; }
//        public String getEmail() { return email; }
//        public void setEmail(String email) { this.email = email; }
//        public String getPassword() { return password; }
//        public void setPassword(String password) { this.password = password; }
//    }
//}


//package com.klu.controller;
//
//import com.klu.entity.Employee;
//import com.klu.entity.HrAdmin;
//import com.klu.service.AuthService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
//
//@RestController
//@RequestMapping("/api/auth")
//@CrossOrigin(origins = "http://localhost:5173") // Frontend React Port
//public class AuthController {
//
//    private final AuthService authService;
//
//    public AuthController(AuthService authService) {
//        this.authService = authService;
//    }
//
//    // Employee Login
//    @PostMapping("/employee/login")
//    public ResponseEntity<Boolean> loginEmployee(@RequestBody LoginRequest request) {
//        boolean success = authService.loginEmployee(request.getEmail(), request.getPassword());
//        return ResponseEntity.ok(success);
//    }
//
//    // HR Login
//    @PostMapping("/hr/login")
//    public ResponseEntity<Boolean> loginHr(@RequestBody LoginRequest request) {
//        boolean success = authService.loginHr(request.getEmail(), request.getPassword());
//        return ResponseEntity.ok(success);
//    }
//
//    // Employee Sign-up
//    @PostMapping("/employee/signup")
//    public ResponseEntity<String> signupEmployee(@RequestBody SignUpRequest request) {
//        Employee emp = new Employee();
//        emp.setName(request.getName());
//        emp.setEmail(request.getEmail());
//        emp.setPassword(request.getPassword());
//
//        try {
//            authService.registerEmployee(emp);
//            return ResponseEntity.status(HttpStatus.CREATED).body("Employee registered successfully!");
//        } catch (Exception e) {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
//        }
//    }
//
//    // HR Sign-up
//    @PostMapping("/hr/signup")
//    public ResponseEntity<String> signupHr(@RequestBody SignUpRequest request) {
//        HrAdmin hr = new HrAdmin();
//        hr.setName(request.getName());
//        hr.setEmail(request.getEmail());
//        hr.setPassword(request.getPassword());
//
//        try {
//            authService.registerHr(hr);
//            return ResponseEntity.status(HttpStatus.CREATED).body("HR Admin registered successfully!");
//        } catch (Exception e) {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
//        }
//    }
//
//    // --- Request Classes ---
//    public static class LoginRequest {
//        private String email;
//        private String password;
//
//        public String getEmail() { return email; }
//        public void setEmail(String email) { this.email = email; }
//
//        public String getPassword() { return password; }
//        public void setPassword(String password) { this.password = password; }
//    }
//
//    public static class SignUpRequest {
//        private String name;
//        private String email;
//        private String password;
//
//        public String getName() { return name; }
//        public void setName(String name) { this.name = name; }
//
//        public String getEmail() { return email; }
//        public void setEmail(String email) { this.email = email; }
//
//        public String getPassword() { return password; }
//        public void setPassword(String password) { this.password = password; }
//    }
//}

//package com.klu.controller;
//
//import com.klu.entity.Employee;
//import com.klu.entity.HrAdmin;
//import com.klu.service.AuthService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
//
//@RestController
//@RequestMapping("/api/auth")
//@CrossOrigin(origins = "http://localhost:5173") // match your frontend port
//public class AuthController {
//
//    private final AuthService authService;
//
//    public AuthController(AuthService authService) {
//        this.authService = authService;
//    }
//
//    // 🧍 Employee Login
//    @PostMapping("/employee/login")
//    public ResponseEntity<?> loginEmployee(@RequestBody LoginRequest request) {
//        boolean success = authService.loginEmployee(request.getEmail(), request.getPassword());
//        if (success) {
//            return ResponseEntity.ok(new LoginResponse("Employee login successful"));
//        }
//        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
//                .body(new LoginResponse("Invalid employee credentials"));
//    }
//
//    // 🧑‍💼 HR Login
//    @PostMapping("/hr/login")
//    public ResponseEntity<?> loginHr(@RequestBody LoginRequest request) {
//        boolean success = authService.loginHr(request.getEmail(), request.getPassword());
//        if (success) {
//            return ResponseEntity.ok(new LoginResponse("HR login successful"));
//        }
//        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
//                .body(new LoginResponse("Invalid HR credentials"));
//    }
//
//    // 👤 Employee Signup
//    @PostMapping("/employee/signup")
//    public ResponseEntity<?> signupEmployee(@RequestBody SignUpRequest request) {
//        try {
//            Employee emp = new Employee();
//            emp.setName(request.getName());
//            emp.setEmail(request.getEmail());
//            emp.setPassword(request.getPassword());
//
//            authService.registerEmployee(emp);
//            return ResponseEntity.status(HttpStatus.CREATED)
//                    .body(new LoginResponse("Employee registered successfully"));
//        } catch (Exception e) {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
//        }
//    }
//
//    // 🧑‍💻 HR Signup
//    @PostMapping("/hr/signup")
//    public ResponseEntity<?> signupHr(@RequestBody SignUpRequest request) {
//        try {
//            HrAdmin hr = new HrAdmin();
//            hr.setName(request.getName());
//            hr.setEmail(request.getEmail());
//            hr.setPassword(request.getPassword());
//
//            authService.registerHr(hr);
//            return ResponseEntity.status(HttpStatus.CREATED)
//                    .body(new LoginResponse("HR Admin registered successfully"));
//        } catch (Exception e) {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
//        }
//    }
//
//    // DTO classes
//    public static class LoginRequest {
//        private String email;
//        private String password;
//
//        public String getEmail() { return email; }
//        public void setEmail(String email) { this.email = email; }
//
//        public String getPassword() { return password; }
//        public void setPassword(String password) { this.password = password; }
//    }
//
//    public static class SignUpRequest {
//        private String name;
//        private String email;
//        private String password;
//
//        public String getName() { return name; }
//        public void setName(String name) { this.name = name; }
//
//        public String getEmail() { return email; }
//        public void setEmail(String email) { this.email = email; }
//
//        public String getPassword() { return password; }
//        public void setPassword(String password) { this.password = password; }
//    }
//
//    public static class LoginResponse {
//        private String message;
//
//        public LoginResponse(String message) { this.message = message; }
//
//        public String getMessage() { return message; }
//        public void setMessage(String message) { this.message = message; }
//    }
//}




package com.klu.controller;

import com.klu.entity.Employee;
import com.klu.entity.HrAdmin;
import com.klu.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/auth")
// Update the origin to match your React app's port
@CrossOrigin(origins = "http://localhost:5173")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/employee/login")
    public boolean loginEmployee(@RequestBody LoginRequest request) {
        return authService.loginEmployee(request.getEmail(), request.getPassword());
    }

    @PostMapping("/hr/login")
    public boolean loginHr(@RequestBody LoginRequest request) {
        return authService.loginHr(request.getEmail(), request.getPassword());
    }

    @PostMapping("/employee/signup")
    public ResponseEntity<String> signupEmployee(@RequestBody SignUpRequest request) {
        Employee newEmployee = new Employee();
        newEmployee.setName(request.getName());
        newEmployee.setEmail(request.getEmail());
        newEmployee.setPassword(request.getPassword());

        try {
            authService.registerEmployee(newEmployee);
            return new ResponseEntity<>("Employee registered successfully!", HttpStatus.CREATED);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Registration failed: " + e.getMessage());
        }
    }

    @PostMapping("/hr/signup")
    public ResponseEntity<String> signupHr(@RequestBody SignUpRequest request) {
        HrAdmin newHrAdmin = new HrAdmin();
        newHrAdmin.setName(request.getName());
        newHrAdmin.setEmail(request.getEmail());
        newHrAdmin.setPassword(request.getPassword());

        try {
            authService.registerHr(newHrAdmin);
            return new ResponseEntity<>("HR Admin registered successfully!", HttpStatus.CREATED);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Registration failed: " + e.getMessage());
        }
    }

    public static class LoginRequest {
        private String email;
        private String password;
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
    }

    public static class SignUpRequest {
        private String name;
        private String email;
        private String password;
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
    }
}
//
//
//





