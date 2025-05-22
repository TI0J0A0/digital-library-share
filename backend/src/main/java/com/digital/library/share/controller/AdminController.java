package com.digital.library.share.controller;

import com.digital.library.share.model.AccessRequest;
import com.digital.library.share.service.AccessRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/requests")
public class AdminController {
    @Autowired
    private AccessRequestService service;

    @GetMapping
    public List<AccessRequest> pending() {
        return service.findPending();
    }

    @PatchMapping("/{id}")
    public AccessRequest update(@PathVariable Long id, @RequestBody Map<String, String> body) {
        AccessRequest.Status status = AccessRequest.Status.valueOf(body.get("status"));
        return service.updateStatus(id, status);
    }
}
