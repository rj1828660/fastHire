package com.fastHire.jobListing.controller;

import com.fastHire.jobListing.models.Post;
import com.fastHire.jobListing.repository.PostRepository;
import com.fastHire.jobListing.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController


public class PostController {


    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @RequestMapping(value="/")
    public String homePage(){
        return "home";

    }

    @GetMapping("/allPosts")
    public List<Post> getAllPosts()
    {
        return repo.findAll();
    }
    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text)
    {
        return srepo.findByText(text);
    }
    @PostMapping("/post")
    public Post addPost(@RequestBody Post post)
    {
        return repo.save(post);
    }
}
