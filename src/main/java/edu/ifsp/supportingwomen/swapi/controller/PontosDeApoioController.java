package edu.ifsp.supportingwomen.swapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PontosDeApoioController {
    @GetMapping("/isabelly")
    String meuMetodo(){
        return "Feito pela Isabelly";
    }
    @GetMapping("isabelly2")
    String metodo2(){
        return "Esse sim feito pela Isabelly";
    }
    @GetMapping("/Ana Luisa")
     public String  endPoint1(){
        return "Ana dos brigadeiros";
     }
    @GetMapping("/AnaJulia")
    String metodoAnaju(){
        return "Ana Julia fez esse método ;)";
    }
}
