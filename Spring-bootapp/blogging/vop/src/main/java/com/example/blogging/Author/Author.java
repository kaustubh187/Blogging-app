package com.example.blogging.Author;

import java.time.LocalDate;
//import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Author")
public class Author {
    
    
    
    @Id
    @SequenceGenerator(
        name = "author_sequence",
        sequenceName = "author_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "author_sequence"
    )
    private Long authoraid;
    private String name;
    private LocalDate datecreated;
    private String bio;
    public Author() {
    }

    public Author(Long authoraid, String name, LocalDate datecreated, String bio) {
        this.authoraid = authoraid;
        this.name = name;
        this.datecreated = datecreated;
        this.bio = bio;
    }

    public Long getAuthoraid() {
        return authoraid;
    }

    public void setAuthoraid(Long authoraid) {
        this.authoraid = authoraid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(LocalDate datecreated) {
        this.datecreated = datecreated;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "author [authoraid=" + authoraid + ", name=" + name + ", datecreated=" + datecreated + ", bio=" + bio
                + "]";
    }

    


    

}
