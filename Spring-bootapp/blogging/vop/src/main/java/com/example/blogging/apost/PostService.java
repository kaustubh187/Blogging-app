package com.example.blogging.apost;

import java.util.List;
//import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class PostService {

    private final PostRepository postrepo;

    public PostService(PostRepository postrepo) {
        this.postrepo = postrepo;
    }

    public List<Post> getallposts()
    {
        return postrepo.findAll();
    }
    public Post getPostbyid(Long postid)
    {
        Post exists = postrepo.findById(postid).orElseThrow(()-> new IllegalStateException("Wrong id!"));
        return exists;
    }
    @Transactional
    public List<Post> getallpostAuthor(Long authorid)
    {
        return postrepo.findPostByauthorid(authorid);
    }
    
}
