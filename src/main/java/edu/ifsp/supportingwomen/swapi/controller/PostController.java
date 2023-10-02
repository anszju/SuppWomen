package edu.ifsp.supportingwomen.swapi.controller;

import java.util.List;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import edu.ifsp.supportingwomen.swapi.repository.PostRepository;


@RestController

public class PostController {
    @Autowired 
    PostRepository postRepository;

    @DeleteMapping("/suppwomen/deletapost/{id}")
    public void deletarPost (@PathVariable("id") Long id){
        postRepository.deleteById(id);

    }
    // @DeleteMapping("/suppwomen/deletapost")
    // public String deletarPost (@PathParam("titulo") String titulo){
    //     Post postDeletar = postD.encontraPost(titulo);

        // if(postDeletar != null){
        //     postD.deletePost(postDeletar);
        //     return "Post deletado com sucesso.";
        // }else{
        //     return "Post não encontrado.";
        // }

    // }
    // //mantém o título para dar o put, modifica o conteudo e a tag
    // @PutMapping("/suppwomen/attpost")
    // public Post attPost (@PathParam("titulo") String titulo, @RequestBody Post novoPost){
    //     PostDAO postDAO = new PostDAO();
    //     postDAO.update(novoPost);
    //     return novoPost;
    // }
}