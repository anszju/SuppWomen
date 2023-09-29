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

import edu.ifsp.supportingwomen.swapi.model.Post;

import edu.ifsp.supportingwomen.swapi.repository.PostRepository;
import jakarta.websocket.server.PathParam;


@RestController

public class PostController {
    @Autowired 
    PostRepository postRepository;
    
    // @GetMapping("/suppwomen/posts")
    // List<Post> mostrarPosts(){
    //     return PostDAO.getInstance().read();
    // }

    // @PostMapping("/suppwomen/posts")
    //     public Post cadPosts(@RequestBody Post novoPost){ 
    //         PostDAO postDAO = PostDAO.getInstance();
    //         postDAO.create(novoPost);
    //         return novoPost;
    // }

    // @Autowired
    // private PostDAO postD = PostDAO.getInstance();

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