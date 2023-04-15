package com.example.blogging.Author;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AuthorConfig {
    
    
    @Bean
    CommandLineRunner commalini(AuthorRepository authorrepo)
    {
        return args->{
            Author JKrowlly = new Author(
                143L, 
                "JK Rowling", 
                LocalDate.of(1978,Month.JULY,10), 
                "I basically write books");

                authorrepo.save(JKrowlly);
        };
    }
}
