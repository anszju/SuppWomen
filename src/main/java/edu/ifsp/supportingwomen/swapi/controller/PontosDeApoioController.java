package edu.ifsp.supportingwomen.swapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

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

    @Autowired
    private PontosDeApoioDAO pontoD = PontosDeApoioDAO.getInstance();

    @DeleteMapping("/suppwomen/deletePonto/{nomePonto}")
    public String deletarPonto (@PathVariable("nomePonto") String nomePonto){
        PontosDeApoio pontoDeletar = pontoD.encontraNome(nomePonto);

        
        if(pontoDeletar != null){
            pontoD.delete(pontoDeletar);
            return "Ponto de apoio deletado com sucesso.";
        }else{
            return "Ponto de apoio não encontrado.";
        }
    }
}
