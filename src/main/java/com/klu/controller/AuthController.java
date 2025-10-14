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
