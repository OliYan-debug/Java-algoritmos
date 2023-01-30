package com.example.library.books;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class BookConfig {
    @Bean
    CommandLineRunner commandLineRunner(BookRepository repository){
        return args -> {
            Book theWitcher = new Book(
                    "The Wicther: Torre da Andorinha",
                    620,
                    "Polonês",
                    "12213727893",
                    LocalDate.of(2009, Month.APRIL, 12)
            );
            Book theWitcher2 = new Book(
                    "The Wicther: O sangue dos Elfos",
                    620,
                    "Polonês",
                    "122121233423",
                    LocalDate.of(2009, Month.APRIL, 12)
            );

            repository.saveAll(List.of(theWitcher,theWitcher2));
        };
    }

}
