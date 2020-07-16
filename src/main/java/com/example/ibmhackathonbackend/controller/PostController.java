package com.example.ibmhackathonbackend.controller;

import com.example.ibmhackathonbackend.models.PlatformUser;
import com.example.ibmhackathonbackend.models.Post;
import com.example.ibmhackathonbackend.services.PlatformUserService;
import com.example.ibmhackathonbackend.services.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController; 

@CrossOrigin("*")
@RestController
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/api/posts")
    public Iterable<Post> findAllPosts() {
        return postService.findPost();
    }

    @PostMapping("/api/posts/create")
    public Post createPost(@RequestBody Post post){
        System.out.println(post.toString());
        return postService.createPost(post);
        
    }
    
}