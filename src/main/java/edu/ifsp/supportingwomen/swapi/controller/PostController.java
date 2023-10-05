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
import edu.ifsp.supportingwomen.swapi.model.Post;

@RestController

public class PostController {
    @Autowired 
    PostRepository postRepository;

    @PostMapping("/suppwomen/posts/")
    public Post cadastraPost(@RequestBody Post novoPost){
        return postRepository.save(novoPost);
    }

    @GetMapping("/suppwomen/posts/")
    public List<Post> exibePosts(){
        return (List<Post>)postRepository.findAll();
    }

    @DeleteMapping("/suppwomen/deletapost/{id}")
    public void deletarPost (@PathVariable("id") Long id){
        postRepository.deleteById(id);

    }
}