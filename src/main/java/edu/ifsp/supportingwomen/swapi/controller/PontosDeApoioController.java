package edu.ifsp.supportingwomen.swapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class PontosDeApoioController {
    @GetMapping("/Ingrid")
    public String endPoint1(){
        return "exemplo ind";
    }
}
