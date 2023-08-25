package edu.ifsp.supportingwomen.swapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ifsp.supportingwomen.swapi.model.Usuaria;
import edu.ifsp.supportingwomen.swapi.model.UsuariaDAO;

@RestController
public class UsuariaController{
    
    @GetMapping("/suppwomen/listacadastros")
    List<Usuaria> mostrarCadastros(){
        return UsuariaDAO.getInstance().read();
    }
}
