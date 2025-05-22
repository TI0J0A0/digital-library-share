package com.digital.library.share.controller;

import com.digital.library.share.model.AccessRequest;
import com.digital.library.share.service.AccessRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/requests")
public class RequestController {
    @Autowired
    private AccessRequestService service;

    @PostMapping
    public AccessRequest submit(@RequestBody AccessRequest req) {
        return service.create(req);
    }
}
