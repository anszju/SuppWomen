package br.edu.ifsp.javafx.aulas.model;

import java.util.ArrayList;

import br.edu.ifsp.javafx.aulas.Database;

public class PontosDeApoioDAO {

    private Database db;
    private static PontosDeApoioDAO instance;
    public static ArrayList<PontosDeApoio> pontos = Database.getPontos();

    // O construtor privado garante que uma única instância irá existir
    private PontosDeApoioDAO() {

    }

    // Recupera a única instância do DAO
    public static PontosDeApoioDAO getInstance() {
        if (instance == null) {
            instance = new PontosDeApoioDAO();
        }
        return instance;
    }

    // Recupera a conexão com o Banco de Dados
    private Database getConnection() {
        if (this.db == null) {
            Database db = new Database();
            this.db = db;
        }
        return this.db;
    }

    // Cria um novo ponto
    public void create(PontosDeApoio novo) {
        Database db = getConnection();
        db.addPonto(novo);
    }

    public ArrayList<PontosDeApoio> read() {
        Database db = getConnection();
        return db.getPontos();
    }

    public void delete(PontosDeApoio deletar) {
        // implementar
    }

    public void update(PontosDeApoio toUpdate) {
        // Sem implementação
    }
}
