package com.example.ibmhackathonbackend.repositories;

import com.example.ibmhackathonbackend.models.Post;

import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Integer>{
    
}