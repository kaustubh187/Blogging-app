package com.example.blogging.Author;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.ardi.apost.Post;

@RestController
@RequestMapping
public class AuthorController {
    
    private final AuthorService authserv;

    

    public AuthorController(AuthorService authserv) {
        this.authserv = authserv;
    }



    @GetMapping(path="/api/v1/all-authors")
    public List<Author> getauthors()
    {
        return authserv.getallauthor();
    }
    @GetMapping(path = "/api/v1/get-post-authorname/{authorname}")
    public String getpostbyauthorname(@PathVariable String authorname)
    {
        return authserv.getpostauthorname(authorname);
    }
}
