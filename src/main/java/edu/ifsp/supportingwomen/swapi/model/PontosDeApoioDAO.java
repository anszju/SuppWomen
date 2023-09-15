package edu.ifsp.supportingwomen.swapi.model;

import java.util.ArrayList;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import edu.ifsp.supportingwomen.swapi.Database;

@Component
public class PontosDeApoioDAO {

    private Database db;
    private static PontosDeApoioDAO instance;
    public static ArrayList<PontosDeApoio> pontos = Database.getPontos();

    // O construtor privado garante que uma única instância irá existir
    public PontosDeApoioDAO() {
        db = new Database();
        pontos = db.getPontos();
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

    public void delete(PontosDeApoio ponto) {
        Predicate<PontosDeApoio> deletar = pontolista -> pontolista.getNomePonto() == ponto.getNomePonto();
        pontos.removeIf(deletar);
    }

    public PontosDeApoio encontraNome(String nomePonto) {
        for (PontosDeApoio ponto : pontos) {
            if (ponto.getNomePonto().equals(nomePonto)) {
                return ponto;
            }
        }
        return null;
    }

    public void update(PontosDeApoio toUpdate) {
        // Sem implementação
    }
}
 