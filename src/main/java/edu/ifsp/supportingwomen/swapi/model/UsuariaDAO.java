package edu.ifsp.supportingwomen.swapi.model;

import java.util.ArrayList;

public class UsuariaDAO {

    private Database db;
    private static UsuariaDAO instance;
    public static ArrayList<Usuaria> cadastros = Database.getCadastros();
    
    private UsuariaDAO(){
    }

    
    public static UsuariaDAO getInstance(){
        if(instance == null){
            instance = new UsuariaDAO();
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
      
}
