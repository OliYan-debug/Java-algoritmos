package com.oliveira.hardware.computer.controller;

import com.oliveira.hardware.computer.model.Computer;
import com.oliveira.hardware.computer.service.ComputerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ComputerController {
    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Computer>> getAll(){
        return ResponseEntity.ok(computerService.getAll());
    }

    @PostMapping("/")
    public ResponseEntity addPC(@RequestBody Computer body){
        return ResponseEntity.ok(computerService.addPc(body));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deletePC(@PathVariable Long id){
        computerService.deleteComputer(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity deletePC(@PathVariable Long id,
                                   @RequestParam(value = "name", required = false) String name,
                                   @RequestParam(value = "description", required = false) String description,
                                   @RequestParam(value = "price", required = false) Double price
                                   ){
        return ResponseEntity.ok(computerService.updateComputer(id, name, description, price));
    }

}
