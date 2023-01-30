package com.oliveira.hardware.computer.configuration;

import com.oliveira.hardware.computer.model.Computer;
import com.oliveira.hardware.computer.repository.ComputerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ComputerConfig {

    @Bean
    CommandLineRunner commandLineRunner(ComputerRepository repository){
        return args -> {
            Computer computer1 = new Computer(
                    "Sky Endless",
                    "Melhor pc do mundo",
                    10_000.00
            );
            Computer computer2 = new Computer(
                    "SKY ENDLESS 2",
                    "Melhor pc do mundo ainda melhor",
                    14_000.00
            );
            repository.saveAll(List.of(computer1, computer2));
        };
    }
}
