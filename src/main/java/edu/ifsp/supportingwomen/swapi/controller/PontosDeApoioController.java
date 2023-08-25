package edu.ifsp.supportingwomen.swapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ifsp.supportingwomen.swapi.model.PontosDeApoio;
import edu.ifsp.supportingwomen.swapi.model.PontosDeApoioDAO;

@RestController
public class PontosDeApoioController {
    @GetMapping("/suppwomen/pontos")
    List<PontosDeApoio> meuMetodo(){
        // return "Feito pela Isabelly";
        return PontosDeApoioDAO.getInstance().read();
    }

    
}
