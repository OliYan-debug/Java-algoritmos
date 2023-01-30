package com.oliveira.hardware.computer.repository;

import com.oliveira.hardware.computer.model.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
}
