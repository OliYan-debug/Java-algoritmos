package com.xiaomi.technology.smartphone.configuration;

import com.xiaomi.technology.smartphone.model.Smartphone;
import com.xiaomi.technology.smartphone.repository.SmartphoneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;
@Configuration
public class SmartphoneConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(SmartphoneRepository repository){
        return args -> {
            Smartphone smartphone1 = new Smartphone(
                    "Poco X4 GT",
                    256,
                    8,
                    5100
            );
            Smartphone smartphone2 = new Smartphone(
                    "Redmi 9",
                    64,
                    4,
                    5000
            );

            repository.saveAll(List.of(
                    smartphone1,
                    smartphone2
            ));
        };
    }
}
