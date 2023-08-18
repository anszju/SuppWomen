package edu.ifsp.supportingwomen.swapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class PontosDeApoioController {
<<<<<<< HEAD
    @GetMapping("/Ingrid")
    public String endPoint1(){
        return "exemplo ind";
=======
    @GetMappgiting("/isabelly")
    String meuMetodo(){
        return "Feito pela Isabelly";
    }
    @GetMapping("isabelly2")
    String metodo2(){
        return "Esse sim feito pela Isabelly";
    @GetMapping("/Ana Luisa")
     public String  endPoint1(){
        return "Ana dos brigadeiros";
     }
    @GetMapping("/AnaJulia")
    String metodoAnaju(){
        return "Ana Julia fez esse método ;)";
>>>>>>> 25f8dcb640296db5e3c50c6e39563d1b57de521f
    }
}
