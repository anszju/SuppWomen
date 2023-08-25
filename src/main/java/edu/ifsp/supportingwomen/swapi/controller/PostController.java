package edu.ifsp.supportingwomen.swapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.ifsp.supportingwomen.swapi.model.Post;
import edu.ifsp.supportingwomen.swapi.model.PostDAO;


@RestController
public class PostController {
    @GetMapping("/suppwomen/posts")
    List<Post> mostrarPosts(){
        return PostDAO.getInstance().read();
    }
}