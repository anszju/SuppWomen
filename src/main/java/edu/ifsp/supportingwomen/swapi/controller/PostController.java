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
}