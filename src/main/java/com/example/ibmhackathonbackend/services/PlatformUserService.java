package com.example.ibmhackathonbackend.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ibmhackathonbackend.repositories.PlatformUserRepository;
import com.example.ibmhackathonbackend.models.PlatformUser;


public class PlatformUserService {

    @Autowired
    PlatformUserRepository userRepository;

    @GetMapping("/api/users")
    public Iterable<PlatformUser> findAllusers() {
        return userRepository.findAll();
    }

    
}