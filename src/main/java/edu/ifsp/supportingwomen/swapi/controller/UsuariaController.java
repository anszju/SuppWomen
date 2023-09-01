package edu.ifsp.supportingwomen.swapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.ifsp.supportingwomen.swapi.model.Usuaria;
import edu.ifsp.supportingwomen.swapi.model.UsuariaDAO;

@RestController
public class UsuariaController{
    
    @GetMapping("/suppwomen/listacadastros")
    List<Usuaria> mostrarCadastros(){
        return UsuariaDAO.getInstance().read();
    }

    @PostMapping("/suppwomen/cadastro")
    public void cadastro(
        @RequestBody
        Usuaria novaUsuaria
    ){
        // UsuariaDAO.getInstance().cadastros.add(novaUsuaria);
        UsuariaDAO usuariaDAO = UsuariaDAO.getInstance();
        usuariaDAO.create(novaUsuaria);
        
    }
}
