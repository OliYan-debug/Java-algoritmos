package com.oliveira.hardware.computer.service;

import com.oliveira.hardware.computer.model.Computer;
import com.oliveira.hardware.computer.repository.ComputerRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ComputerService {
    private final ComputerRepository computerRepository;

    public ComputerService(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    public List<Computer> getAll(){
        return computerRepository.findAll();
    }


    public Computer addPc(Computer body) {
        body.setName("Computador " + body.getName());
        return computerRepository.saveAndFlush(body);
    }

    public void deleteComputer(Long id) {
        computerRepository.deleteById(id);
    }

    @Transactional
    public Computer updateComputer(Long id, String name, String description, Double price) {
        Computer computer = computerRepository.findById(id).orElseThrow(() -> new IllegalStateException(
                "Computer doesnt exists"
        ));
        if(name != null && name.length() >= 1 && !Objects.equals(name, computer.getName())){
            computer.setName(name);
        }
        if(description != null && description.length() >= 1 && !Objects.equals(description, computer.getDescription())){
            computer.setDescription(description);
        }
        if(price != null && price >= 1000 && !Objects.equals(description, computer.getPrice())){
            computer.setPrice(price);
        }
        return computer;
    }
}
