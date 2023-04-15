package com.example.blogging.Author;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//import com.example.ardi.apost.Post;


@Service
public class AuthorService {

    private final AuthorRepository authorrepo;

    

    public AuthorService(AuthorRepository authorrepo) {
        this.authorrepo = authorrepo;
    }



    public List<Author> getallauthor()
    {
        return authorrepo.findAll();
    }
    public String getpostauthorname(String authorname)
    {
        //Now find the id of author by his name! and then get object from the api request
        //of find by author-id!!
        Author exists = authorrepo.findAuthorByName(authorname).orElseThrow(()-> new IllegalStateException("Author with this name="+authorname+" does not seem to exist"));
        Long auid = exists.getAuthoraid();

        RestTemplate testremplate = new RestTemplate();
        String udllp ="http://localhost:8585/api/v1/post/get-post-by-author-id";

        ResponseEntity<String> response = testremplate.getForEntity(udllp+"/"+auid, String.class); 
        
        return response.getBody();

        
    }
}
