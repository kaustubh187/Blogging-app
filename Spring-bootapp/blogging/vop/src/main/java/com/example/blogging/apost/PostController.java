package com.example.blogging.apost;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping
public class PostController {
    
    private final PostService postservice;

    public PostController(PostService postservice) {
        this.postservice = postservice;
    }

    @GetMapping(path = "api/v1/post/all")
    public List<Post> getallpost()
    {
        return postservice.getallposts();
    }
    @GetMapping(path = "api/v1/post/get-post-by-id/{id}")
    public Post getpostbyid(@PathVariable("id") Long postid)
    {
        return postservice.getPostbyid(postid);
    }
    @GetMapping(path = "api/v1/post/get-post-by-author-id/{authorid}")
    public List<Post> getallpostauthor(@PathVariable Long authorid)
    {
        return postservice.getallpostAuthor(authorid);
    }

}
