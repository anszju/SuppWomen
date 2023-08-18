package br.edu.ifsp.javafx.aulas.model;

import java.util.ArrayList;

import br.edu.ifsp.javafx.aulas.Database;

public class PostDAO {
    
    private Database db;
    private static PostDAO instance;
    public static ArrayList<Post> posts = Database.getPosts();

    // O construtor privado garante que uma única instância irá existir
    private PostDAO(){
       
    }

    // Recupera a única instância do DAO
    public static PostDAO getInstance(){
        if(instance == null){
            instance = new PostDAO();
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

    //Cria um novo post
    public void create(Post postNovo){
        Database db = getConnection();
        db.addPost(postNovo);
    }   

    // Recupera todas as listas
    public ArrayList<Post> read(){
        Database db = getConnection();
        return db.getPosts();
    }

    public void delete(Post deletar){
        // Sem implementação
    }

    public void update(Post toUpdate){
        // Sem implementação
    }
}
