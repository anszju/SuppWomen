package edu.ifsp.supportingwomen.swapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import edu.ifsp.supportingwomen.swapi.model.Post;
import edu.ifsp.supportingwomen.swapi.model.PostDAO;


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
}