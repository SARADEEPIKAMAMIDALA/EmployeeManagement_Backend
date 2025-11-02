package com.klu.controller;

import com.klu.entity.LeaveRequest;
import com.klu.service.LeaveRequestService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/leaves")
@CrossOrigin(origins = "http://localhost:5173") // frontend URL
public class LeaveRequestController {

    private final LeaveRequestService service;

    public LeaveRequestController(LeaveRequestService service) {
        this.service = service;
    }

    @PostMapping("/apply")
    public LeaveRequest applyLeave(@RequestBody LeaveRequest request) {
        return service.submitLeave(request);
    }

    @GetMapping("/all")
    public List<LeaveRequest> getAllLeaves() {
        return service.getAllRequests();
    }

    @GetMapping("/employee/{name}")
    public List<LeaveRequest> getEmployeeLeaves(@PathVariable String name) {
        return service.getRequestsByEmployee(name);
    }

    @PutMapping("/{id}/status")
    public LeaveRequest updateStatus(@PathVariable Long id, @RequestParam String status) {
        return service.updateStatus(id, status);
    }
}
