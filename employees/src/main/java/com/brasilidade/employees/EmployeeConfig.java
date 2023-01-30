package com.brasilidade.employees;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class EmployeeConfig {
    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository repository){
        return args -> {
            Employee employee1 = new Employee(
                    "Yan",
                    "Developer",
                    LocalDate.of(2020, Month.OCTOBER, 3)
            );
            Employee employee2 = new Employee(
                    "Yude",
                    "Teacher",
                    LocalDate.of(2022, Month.JULY, 3)
            );

            repository.saveAll(List.of(employee1, employee2));
        };
    }
}
