package com.example.ibmhackathonbackend.services;

import com.example.ibmhackathonbackend.models.Post;
import com.example.ibmhackathonbackend.repositories.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(allowCredentials = "true")
@RestController
public class PostService {

    @Autowired
    PostRepository postRepository;

    public Iterable<Post> findAllPosts() {
        return postRepository.findAll();
    }

    
    public Post createPost(Post post){
        return postRepository.save(post);
        
    }

}