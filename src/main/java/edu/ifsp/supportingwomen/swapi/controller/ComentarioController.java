package edu.ifsp.supportingwomen.swapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.ifsp.supportingwomen.swapi.model.Comentario;
import edu.ifsp.supportingwomen.swapi.repository.ComentarioRepository;

@RestController
public class ComentarioController {
    @Autowired
    ComentarioRepository comentarioRepository;
    
    @PostMapping("/suppwomen/criacomentario")
    public Comentario createPost(
        @RequestBody Comentario comentario 
    ){
        return comentarioRepository.save(comentario);
    }

  
    @GetMapping("/suppwomen/comentarios")
    public List<Comentario> mostrarcomentarios(){
        return(List<Comentario>) comentarioRepository.findAll();
    }
    
    // @PostMapping("/suppwomen/criacomentario")
    // public void cadastro(
    //     @RequestBody
    //     Comentario novoComentario
    // ){
    //     ComentarioDAO comentarioDAO = ComentarioDAO.getInstance();
    //     comentarioDAO.create(novoComentario);
    // }

    // //get comentarios - isablly
    // @GetMapping("/suppwomen/comentarios")
    // List<Comentario> mostrarcomentarios(){
    //     return ComentarioDAO.getInstance().read();
    // }

}
