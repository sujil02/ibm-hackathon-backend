package com.example.ibmhackathonbackend.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.ibmhackathonbackend.repositories.PlatformUserRepository;
import com.example.ibmhackathonbackend.models.PlatformUser;

@CrossOrigin(allowCredentials = "true")
@RestController
public class PlatformUserService {

    @Autowired
    PlatformUserRepository userRepository;

    public Iterable<PlatformUser> findAllusers() {
        return userRepository.findAll();
    }

    
}