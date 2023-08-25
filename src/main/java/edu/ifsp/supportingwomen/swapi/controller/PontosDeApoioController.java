package edu.ifsp.supportingwomen.swapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.ifsp.supportingwomen.swapi.model.PontosDeApoio;
import edu.ifsp.supportingwomen.swapi.model.PontosDeApoioDAO;

@RestController
public class PontosDeApoioController {

    @PostMapping("/suppwomen/pontos")
    public PontosDeApoio cadPontos(@RequestBody PontosDeApoio novoPonto){ 
            PontosDeApoioDAO pontosDeApoioDAO = PontosDeApoioDAO.getInstance();
            pontosDeApoioDAO.create(novoPonto);
            return novoPonto;

    }

    @GetMapping("/suppwomen/pontos")
    List<PontosDeApoio> exibePonto(){
        return PontosDeApoioDAO.getInstance().read();
    }

    
}
