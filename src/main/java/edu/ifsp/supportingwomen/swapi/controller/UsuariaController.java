package edu.ifsp.supportingwomen.swapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import edu.ifsp.supportingwomen.swapi.model.Usuaria;
import edu.ifsp.supportingwomen.swapi.repository.UsuariaRepository;

@RestController
public class UsuariaController{
    @Autowired
    UsuariaRepository usuariaRepository;

    @GetMapping("/suppwomen/listacadastros")
    public List<Usuaria> mostrarCadastros(){
        return (List<Usuaria>)usuariaRepository.findAll();
    }

    @PostMapping("/suppwomen/cadastro")
    public Usuaria cadastro(@RequestBody Usuaria novaUsuaria){
        return usuariaRepository.save(novaUsuaria);
    }

    @DeleteMapping("/suppwomen/deletaConta/{id}")
    public void deletarCadastro (@PathVariable("id") Long id){
       usuariaRepository.deleteById(id);
    }

    @PutMapping("/suppwomen/cadastro/{id}")
    public Usuaria atualizaCad(@RequestBody Usuaria updateCad, @PathVariable("id") Long id) {
      usuariaRepository.findById(id);
      return   usuariaRepository.save(updateCad);
       
    }
}
