package com.example.captalize;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CaptalizeController implements ErrorController {
    private final CaptalizeService captalizeService;

    public CaptalizeController(CaptalizeService captalizeService) {
        this.captalizeService = captalizeService;
    }
    @GetMapping("/{word}")
    public String changeToCapitalized(@PathVariable("word") String word){
        System.out.println(word);
        if (word.length() < 1) throw new IllegalStateException("Word doesn't exists");
        return captalizeService.captalizedWord(word);
    }
    @GetMapping("/error")
    public String handleError(){
        return "<center><h2>Well this is not supposed to happen<h2></center>";
    }


}
