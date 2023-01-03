package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ){
        return args -> {
            Student yan = new Student(
                    "Yan Oliveira",
                    "yan@mail.com",
                    LocalDate.of(2001, Month.OCTOBER, 3)
            );
            Student yude = new Student(
                    "Yude Oliveira",
                    "yude@mail.com",
                    LocalDate.of(2018, Month.MAY, 10)
            );

            repository.saveAll(
                    List.of(yan, yude)
            );
        };

    }


}
