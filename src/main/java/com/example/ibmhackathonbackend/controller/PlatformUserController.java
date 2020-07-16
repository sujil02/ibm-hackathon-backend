package com.example.ibmhackathonbackend.controller;

import com.example.ibmhackathonbackend.models.PlatformUser;
import com.example.ibmhackathonbackend.services.PlatformUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController; 

@CrossOrigin("*")
@RestController
public class PlatformUserController {

    @Autowired
    PlatformUserService platformUserService;

    @GetMapping("/api/users")
    public Iterable<PlatformUser> findAllusers() {
        return platformUserService.findAllusers();
    }
    
}