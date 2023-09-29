package edu.ifsp.supportingwomen.swapi.controller;

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

    // @GetMapping("/suppwomen/listacadastros")
    // List<Usuaria> mostrarCadastros(){
    //     return UsuariaDAO.getInstance().read();
    // }

    // @PostMapping("/suppwomen/cadastro")
    // public void cadastro(
    //     @RequestBody
    //     Usuaria novaUsuaria
    // ){
    //     // UsuariaDAO.getInstance().cadastros.add(novaUsuaria);
    //     UsuariaDAO usuariaDAO = UsuariaDAO.getInstance();
    //     usuariaDAO.create(novaUsuaria);
        
    // }
    //  @Autowired
    // private UsuariaDAO usuariaD = UsuariaDAO.getInstance();

    // @DeleteMapping("/suppwomen/deletaconta/{cpf}")
    // public String deletarCadastro (@PathVariable("cpf") String cpf){
    //     Usuaria usuariaDeletar = usuariaD.encontraCpf(cpf);

        
    //     if(usuariaDeletar != null){
    //         usuariaD.deleteUsuaria(usuariaDeletar);
    //         return "Cadastro deletado com sucesso.";
    //     }else{
    //         return "Cadastro não encontrado.";
    //     }
    // }

    @PutMapping("/suppwomen/cadastro")
    public Usuaria atualizaCad(@RequestBody Usuaria updateCad) {
        return usuariaRepository.save(updateCad);
    }
}
