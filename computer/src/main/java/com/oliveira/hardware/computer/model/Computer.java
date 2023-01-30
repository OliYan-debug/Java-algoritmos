package com.oliveira.hardware.computer.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Data
public class Computer {
    @Id
    @SequenceGenerator(
            name = "computer_sequence",
            sequenceName = "computer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "computer_sequence"
    )
    private Long id;
    private String name;
    private String description;
    private Double price;

    public Computer(String name, String description, Double price) {
        try{
            if(name.length() < 1 || description.length() < 15 || price < 1000){
                throw new RuntimeException();
            }
            this.name = "Computador " + name;
            this.description = description;
            this.price = price;
        }catch(RuntimeException e){
            System.out.println(e);
        }

    }

    public Computer() {

    }
}
