package edu.ifsp.supportingwomen.swapi.model;

import java.util.ArrayList;

import edu.ifsp.supportingwomen.swapi.Database;

public class ComentarioDAO {
    
    private Database db;
    private static ComentarioDAO instance;
    public static ArrayList<Comentario> comentarios = Database.getComentarios();

    // O construtor privado garante que uma única instância irá existir
    private ComentarioDAO(){
       
    }

    // Recupera a única instância do DAO
    public static ComentarioDAO getInstance(){
        if(instance == null){
            instance = new ComentarioDAO();
        }
        return instance;
    }

    // Recupera a conexão com o Banco de Dados
    private Database getConnection(){
        if(this.db == null){            
            Database db = new Database();
            this.db = db;
        }
        return this.db;    
    }

    //Cria um novo comentario
    public void create(Comentario comentarioNovo){
        Database db = getConnection();
        db.addComentario(comentarioNovo);
    }   

    // Recupera todas as listas
    public ArrayList<Comentario> read(){
        Database db = getConnection();
        return db.getComentarios();
    }

    public void delete(Comentario deletar){
        // Sem implementação
    }

    public void update(Comentario toUpdate){
        // Sem implementação
    }
}
