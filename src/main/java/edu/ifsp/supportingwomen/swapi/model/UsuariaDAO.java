package edu.ifsp.supportingwomen.swapi.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import edu.ifsp.supportingwomen.swapi.Database;

@Component
public class UsuariaDAO {

    private Database db;
    private static UsuariaDAO instance;
    public static ArrayList<Usuaria> cadastros = Database.getCadastros();
    
    private UsuariaDAO(){
        db = new Database();
        cadastros = db.getCadastros();
    }

    
    public static UsuariaDAO getInstance(){
        if(instance == null){
            instance = new UsuariaDAO();
            // instance.getConnection();
        }
        return instance;
    }

    
    private Database getConnection(){
        if(this.db == null){            
            Database db = new Database();
            this.db = db;
        }
        return this.db;    
    }

    public void create(Usuaria novaUsuaria){
        Database db = getConnection();
        db.addUsuaria(novaUsuaria);
    }   

    
    public ArrayList<Usuaria> read(){
        Database db = getConnection();
        return db.getCadastros();
    }

    public void delete(Usuaria deletar){
        // Sem implementação
    }

    public void update(Usuaria toUpdate){
        // Sem implementação
    }


    public Usuaria encontraCpf(String cpf) {
        for (Usuaria usuariaA : cadastros) {
            if (usuariaA.getCpf().equals(cpf)) {
                return usuariaA;
            }
        }
        return null;
    }
    
    public void deleteUsuaria(Usuaria usuariaDeletar) {
        cadastros.remove(usuariaDeletar);
    }
}
