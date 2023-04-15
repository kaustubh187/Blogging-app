package com.example.blogging.apost;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {

        List<Post> findPostByauthorid(Long authorid);
}
