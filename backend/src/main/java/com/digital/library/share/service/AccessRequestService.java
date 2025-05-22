package com.digital.library.share.service;

import com.digital.library.share.model.AccessRequest;
import com.digital.library.share.repository.AccessRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessRequestService {
    @Autowired
    private AccessRequestRepository repo;

    public AccessRequest create(AccessRequest req) {
        return repo.save(req);
    }

    public List<AccessRequest> findPending() {
        return repo.findByStatus(AccessRequest.Status.PENDING);
    }

    public AccessRequest updateStatus(Long id, AccessRequest.Status status) {
        AccessRequest req = repo.findById(id).orElseThrow();
        req.setStatus(status);
        return repo.save(req);
    }
}
