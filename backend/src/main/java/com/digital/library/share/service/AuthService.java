package com.digital.library.share.service;

import com.digital.library.share.model.User;
import com.digital.library.share.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepo;

    public String authenticate(String email, String password) {
        // TODO: implementar lógica JWT
        return "token";
    }
}
