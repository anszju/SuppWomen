package edu.ifsp.supportingwomen.swapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.ifsp.supportingwomen.swapi.model.Post;
import edu.ifsp.supportingwomen.swapi.model.PostDAO;
import jakarta.websocket.server.PathParam;


@RestController
public class PostController {
    @GetMapping("/suppwomen/posts")
    List<Post> mostrarPosts(){
        return PostDAO.getInstance().read();
    }

    @PostMapping("/suppwomen/posts")
        public Post cadPosts(@RequestBody Post novoPost){ 
            PostDAO postDAO = PostDAO.getInstance();
            postDAO.create(novoPost);
            return novoPost;
    }

    @Autowired
    private PostDAO postD = PostDAO.getInstance();

    @DeleteMapping("/suppwomen/deletapost")
    public String deletarPost (@PathParam("titulo") String titulo){
        Post postDeletar = postD.encontraPost(titulo);

        if(postDeletar != null){
            postD.deletePost(postDeletar);
            return "Post deletado com sucesso.";
        }else{
            return "Post não encontrado.";
        }

    }

    
}