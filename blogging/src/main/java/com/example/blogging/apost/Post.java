package com.example.blogging.apost;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name="Post")
public class Post {
    

    @Id
    @SequenceGenerator(
        name = "post_sequence",
        sequenceName = "post_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "post_sequence"
    )
    private Long postid;
    private String Title;
    private Long authorid;
    private String authorname;
    @Lob
    private String content;
    private String created_date;
    private String category;
    
    
    
    
    
    public Post() {
    }
    
    public Post(String title, Long authorid, String authorname, String content, String created_date, String category) {
        Title = title;
        this.authorid = authorid;
        this.authorname = authorname;
        this.content = content;
        this.created_date = created_date;
        this.category = category;
    }

    public Post(Long postid, String title, Long authorid, String authorname, String content, String created_date,
            String category) {
        this.postid = postid;
        Title = title;
        this.authorid = authorid;
        this.authorname = authorname;
        this.content = content;
        this.created_date = created_date;
        this.category = category;
    }
    public Long getPostid() {
        return postid;
    }
    public void setPostid(Long postid) {
        this.postid = postid;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
    public Long getAuthorid() {
        return authorid;
    }
    public void setAuthorid(Long authorid) {
        this.authorid = authorid;
    }
    public String getAuthorname() {
        return authorname;
    }
    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getCreated_date() {
        return created_date;
    }
    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    
    
    
    
    
    
    

    

}
