package edu.ifsp.supportingwomen.swapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.ifsp.supportingwomen.swapi.model.Comentario;
import edu.ifsp.supportingwomen.swapi.model.ComentarioDAO;

@RestController
public class ComentarioController {
    

    @PostMapping("/suppwomen/comentario")
    public void cadastro(
        @RequestBody
        Comentario novoComentario
    ){
        ComentarioDAO comentarioDAO = ComentarioDAO.getInstance();
        comentarioDAO.create(novoComentario);
        
    }

}
