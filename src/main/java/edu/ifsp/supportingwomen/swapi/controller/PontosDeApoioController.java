package edu.ifsp.supportingwomen.swapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PontosDeApoioController {
    @GetMapping("/AnaJulia")
    String metodoAnaju(){
        return "Ana Julia fez esse método ;)";
    }
}
