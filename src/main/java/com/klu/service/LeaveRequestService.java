package com.klu.service;

import com.klu.entity.LeaveRequest;
import com.klu.repository.LeaveRequestRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LeaveRequestService {
    private final LeaveRequestRepository repo;

    public LeaveRequestService(LeaveRequestRepository repo) {
        this.repo = repo;
    }

    public LeaveRequest submitLeave(LeaveRequest request) {
        return repo.save(request);
    }

    public List<LeaveRequest> getAllRequests() {
        return repo.findAll();
    }

    public List<LeaveRequest> getRequestsByEmployee(String name) {
        return repo.findByEmployeeName(name);
    }

    public LeaveRequest updateStatus(Long id, String status) {
        LeaveRequest req = repo.findById(id).orElseThrow(() -> new RuntimeException("Leave not found"));
        req.setStatus(status);
        return repo.save(req);
    }
}
