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
                "Stuck with the soul",
                143L,
                "David P Barash",
                "Few ideas are as unsupported, ridiculous and even downright harmful as that of the ‘human soul’. And yet, few ideas are as widespread and as deeply held. What gives? Why has such a bad idea had such a tenacious hold on so many people? Although there is a large literature on the costs and benefits – psychological and economic – of traditional religion, there is a dearth of comparable research on religion’s near-universal handmaiden, the soul. As with Justice Potter Stewart’s non-definition of pornography – ‘I may not be able to define it, but I know it when I see it’ – the soul is slippery and, even though it cannot be seen (or smelled, touched, heard or tasted), soul-certain people seem to agree that they know it when they imagine it. And they imagine it in everyone.</p><p>"+

                "Viewed historically and cross-culturally, there is immense variation regarding the soul, although some patterns can be discerned and are nearly universal. Souls are said to reside inside their associated bodies and are pretty much defined as immaterial, thereby contrasted with their fleshy habitations. Immortality is another close, but not quite universal, characteristic. Also widespread, but not invariant, is the soul’s ability to travel independent of its body, sometimes after death but often during sleep. Dreams are widely seen as demonstrating not only that the soul is ‘real’, but that it occupies its own unique plane of reality.</p><p>"+
                
                "Jewish doctrine says almost nothing about the soul. ‘[T]here is no way on earth,’ wrote the influential Jewish philosopher Moses Maimonides, ‘that we can comprehend or know it.’ This agnostic attitude is consistent with Judaism’s lack of specificity regarding the afterlife generally and of heaven and hell in particular. By contrast, Christianity and Islam are clear when it comes to the soul, conceiving it as immaterial as well as immortal, the two perspectives being, as it were, soulmates. Although Islam has a variety of views when it comes to the soul, there is greater diversity within Christianity – between Protestant, Catholic, and Orthodox conceptions – and also within Protestantism, ranging from evangelical fundamentalism to the more relaxed and philosophical approaches of modern-day Quakers and Unitarians.</p><p>"+
                
                "The Hindu soul resembles its Abrahamic counterpart with regard to immateriality and immortality, but with two major differences. For one, the soul (atman, or ‘self’) is conceived as a personalised part of a greater world-soul (brahman, closer to the Western ‘God’). Second, the Hindu soul is subject to regular reincarnations following the death of its body, including excursions into different kinds of animals, depending on its accumulated karma. The final desired destination of this process of repetitive birth and rebirth – oversimplified as nirvana – somewhat resembles the Western concept of heaven, although it is conceived more as a respite from the cycle of birth and rebirth than as an abode of ongoing bliss.</p><p>"+
                
                "When trekking in the Himalayas, I often followed the sherpa advice that one should pause every third day, ‘to let your soul catch up with your body.’ It made a kind of intuitive sense. One needn’t be a Buddhist or travelling at extreme elevation to appreciate this wisdom. As a metaphor for mind, consciousness, one’s deeper beliefs and desires, the soul is serviceable. But its appeal goes beyond linguistic or conceptual utility.",
                "12th Jan",
                "Horror",
                "https://omicron.aeon.co/images/71272cb8-b86b-4168-9d59-ebcfcefd4bd3/card_aristotle_s-ergon-landscape-3.jpg",
                "The idea of the soul is obviously a nonsense, yet its immaterial mysterious nature has deep hooks in the human psyche"
                );
                Post spacebetweenus = new Post(
                    "The Space between us",
                    144L,
                    
                    "James Barnes",
                    "When I was studying philosophy years ago, I had what felt like a nervous breakdown. I wasn’t able to think clearly or articulate my thoughts, and sometimes stuttered. I thought something had gone wrong in my brain. I went for brain scans but found no answers. I ended up with a psychologist who turned out to be a ‘relational psychoanalyst’. That term didn’t mean too much to me at the time, but it was life-defining. Through my therapy, I came to realise that there was, in fact, nothing wrong with my brain. It was in my relationships, especially early ones, where the issue lay. As my mind gradually came back to me, I trained to be a relational psychotherapist myself, and became fascinated by the ideas and theories behind it. What I found was nothing short of revolutionary.</p><p>"+

                    "I’d already been deeply interested in the limitations of Western models of mind, especially in terms of the enduring influence of René Descartes’s dualism between mind and body, mind and world, which set the West into modernity in the 17th century. But this had been a very academic and abstract pursuit. In relational theory, however, I found not only the answers to the problems that our dualistic heritage bestowed upon us, but also to my own suffering, and the roots of much psychological and emotional distress in general.</p><p>"+
                    
                    "Prior to Descartes’s time, mind and world had been understood as entangled, interpenetrating, open to each other. But in the inexorable march of the physical sciences and the mechanistic explanation of the world during the scientific revolution, mind (and soul) were mortally threatened. This led Descartes to split the mind off from the world (and the body that was unarguably part of the world) in order to save it from reduction to physical mechanism. All experience, meaning and purpose – once of mind and world both – were withdrawn from the world and put solely into Descartes’s new ‘mind-substance’, something that had not existed before.</p><p>"+
                    
                    "When the new scientific discipline of psychology separated off from philosophy in the mid- to late 19th century, it adopted an essentially naturalised version of Descartes’s dualism, which persists to the present day, certainly in mainstream psychology, psychiatry and psychotherapy. Instead of seeing mind as a separate substance, this neo-Cartesian perspective assumes that the mind is somehow identifiable with the brain, brain states and brain functioning. Much like Descartes, however, it maintains the very same vision of ‘mind’ as an experientially private interior, categorically cut off from the world and others outside.</p><p>"+
                    
                    "For Descartes and for modern neo-Cartesian models alike, our experience of the world and others occurs ‘on the inside’ – in our individual minds or brains. For modern psychology, this meant that mental life could be studied and measured in isolation, lending itself to empirical and quantitative science. Prior to my training, I’d understood the limitations of this in a purely philosophical way only. I hadn’t made the link between it and the practical day-to-day reality of our failed mental health system – nor had I traced it to my own distress.",
                    "14th January 2023",
                    "Science",
                    "https://epsilon.aeon.co/images/dccf1ac4-ae5b-4440-b87c-b49fe9f219fa/card_essay-rtx6j466.jpg",
                    "In order to understand and heal mental distress, we must see our minds as existing in relationships, not inside our heads"
                );
                Post noplanetB = new Post(
                    "There’s no planet B",
                    145L,
                    "Arwen E Nicholson",
                    "At the start of the 22nd century, humanity left Earth for the stars. The enormous ecological and climatic devastation that had characterised the last 100 years had led to a world barren and inhospitable; we had used up Earth entirely. Rapid melting of ice caused the seas to rise, swallowing cities whole. Deforestation ravaged forests around the globe, causing widespread destruction and loss of life. All the while, we continued to burn the fossil fuels we knew to be poisoning us, and thus created a world no longer fit for our survival. And so we set our sights beyond Earth’s horizons to a new world, a place to begin again on a planet as yet untouched. But where are we going? What are our chances of finding the elusive planet B, an Earth-like world ready and waiting to welcome and shelter humanity from the chaos we created on the planet that brought us into being? We built powerful astronomical telescopes to search the skies for planets resembling our own, and very quickly found hundreds of Earth twins orbiting distant stars. Our home was not so unique after all. The universe is full of Earths!</p><p>"+

                    "This futuristic dream-like scenario is being sold to us as a real scientific possibility, with billionaires planning to move humanity to Mars in the near future. For decades, children have grown up with the daring movie adventures of intergalactic explorers and the untold habitable worlds they find. Many of the highest-grossing films are set on fictional planets, with paid advisors keeping the science ‘realistic’. At the same time, narratives of humans trying to survive on a post-apocalyptic Earth have also become mainstream.</p><p>"+
                    
                    "Given all our technological advances, it’s tempting to believe we are approaching an age of interplanetary colonisation. But can we really leave Earth and all our worries behind? No. All these stories are missing what makes a planet habitable to us. What Earth-like means in astronomy textbooks and what it means to someone considering their survival prospects on a distant world are two vastly different things. We don’t just need a planet roughly the same size and temperature as Earth; we need a planet that spent billions of years evolving with us. We depend completely on the billions of other living organisms that make up Earth’s biosphere. Without them, we cannot survive. Astronomical observations and Earth’s geological record are clear: the only planet that can support us is the one we evolved with. There is no plan B. There is no planet B. Our future is here, and it doesn’t have to mean we’re doomed.",
                    "23rd March 2022",
                    "Life",
                    "https://images.unsplash.com/photo-1562839492-20a189fafbcb?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80",
                    "The scientific evidence is clear: the only celestial body that can support us is the one we evolved with. Here’s why"
                                    
                    );
            postrepo.save(workfhome);
            postrepo.save(spacebetweenus);
            postrepo.save(noplanetB);
        };
        
    }
}
