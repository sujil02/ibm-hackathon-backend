package com.example.ibmhackathonbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.ibmhackathonbackend.models.PlatformUser;

public interface PlatformUserRepository extends CrudRepository<PlatformUser,Integer>{
    
}