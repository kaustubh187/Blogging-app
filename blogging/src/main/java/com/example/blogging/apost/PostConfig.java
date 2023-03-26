package com.example.blogging.apost;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(PostRepository postrepo)
    {
        return args->{
            Post workfhome = new Post(
                "Is work from home sustainable? ",
                143L,
                "JK Rowling",
                "So basically Iwoke up on a recent Tuesday morning and, while my husband got ready for work, I fixed some not-quite-healthy breakfast for the kids, harangued them until they brushed their teeth and put on shoes and socks, and drove them to school. Then I took the car to the mechanic for a minor repair and walked back to the house. Before starting my day of work, I made some calls to medical providers about our new health insurance. Later, when the kids got home, I fixed snacks for them and some friends who wandered over, loaded the dishwasher, and did some laundry."+
"This is not an essay about how women are expected to do the work of managing a home on top of our paid jobs, nor a paean to ‘lean-in’ efficiency that explains how I wake up at 4am, answer emails while the kids are still in bed, and use productivity tricks to get things done at double-speed. Because here’s my secret – one that feels about as dirty and uncomfortable to reveal as anything I could tell you about my sex life – I don’t work that much. I’m a freelance writer, which means I can more or less choose how much I work. And my usual choice is something like 30 hours a week."+
"Many people look upon part-timers as unfortunate exiles from the economic mainstream, or else as pathetic slackers. In thrall to startup culture, our collective psyche makes ceaseless hustle and 80-hour working weeks seem like the only way that career-minded individuals might advance. So who would admit to having so little ambition as to actually prefer working a 30-hour week?",
                "12th Jan",
                "Horror"
                );
            postrepo.save(workfhome);
        };
        
    }
}
