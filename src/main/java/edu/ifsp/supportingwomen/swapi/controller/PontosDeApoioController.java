package edu.ifsp.supportingwomen.swapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.ifsp.supportingwomen.swapi.model.PontosDeApoio;
import edu.ifsp.supportingwomen.swapi.model.PontosDeApoioDAO;
import edu.ifsp.supportingwomen.swapi.model.PostDAO;
import edu.ifsp.supportingwomen.swapi.model.Post;

@RestController
public class PontosDeApoioController {
    
    @GetMapping("/suppwomen/pontos")
    List<PontosDeApoio> meuMetodo(){
        return PontosDeApoioDAO.getInstance().read();
    }

}
