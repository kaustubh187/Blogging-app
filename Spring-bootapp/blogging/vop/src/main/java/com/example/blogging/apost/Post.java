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
    private String description;
    private String authorname;
    @Lob
    private String content;
    private String created_date;
    private String category;
    private String imgurl;
    
    
    
    
    public Post() {
    }
    
    
    public Post(String title, Long authorid, String authorname, String content, String created_date,
            String category, String imgurl, String description) {
        Title = title;
        this.authorid = authorid;
        this.authorname = authorname;
        this.content = content;
        this.created_date = created_date;
        this.category = category;
        this.imgurl = imgurl;
        this.description = description;
    }


    public Post(Long postid, String title, Long authorid, String description, String authorname, String content,
            String created_date, String category, String imgurl) {
        this.postid = postid;
        Title = title;
        this.authorid = authorid;
        this.authorname = authorname;
        this.content = content;
        this.created_date = created_date;
        this.category = category;
        this.imgurl = imgurl;
        this.description = description;
    }
    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getImgurl() {
        return imgurl;
    }


    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
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


    @Override
    public String toString() {
        return "Post [postid=" + postid + ", Title=" + Title + ", authorid=" + authorid + ", description=" + description
                + ", authorname=" + authorname + ", content=" + content + ", created_date=" + created_date
                + ", category=" + category + ", imgurl=" + imgurl + "]";
    }

    
    
    
    
    
    
    

    

}
