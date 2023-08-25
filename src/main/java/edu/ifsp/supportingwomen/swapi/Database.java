package edu.ifsp.supportingwomen.swapi;

import java.util.ArrayList;

import edu.ifsp.supportingwomen.swapi.model.PontosDeApoio;
import edu.ifsp.supportingwomen.swapi.model.Post;
import edu.ifsp.supportingwomen.swapi.model.Usuaria;

// Esta classe simula um SGDB. Coloque onde ficará os dados aqui!

public class Database {
    private static ArrayList<Usuaria> cadastros;
    private static ArrayList<Post> posts;
    private static ArrayList<PontosDeApoio> pontos;

    public Database() {
        cadastros = new ArrayList<>();
        posts = new ArrayList<>();
        pontos = new ArrayList<>();

        cadastros.get(0).addPontoDeApoio(pontos.get(0));
        cadastros.get(0).addPontoDeApoio(pontos.get(1));

        pontos.add(new PontosDeApoio("cris", "123", "123"));
        pontos.add(new PontosDeApoio("cris", "123", "123"));
        pontos.add(new PontosDeApoio("cris", "123", "123"));
    }

    public void addUsuaria(Usuaria novaUsuaria) {
        cadastros.add(novaUsuaria);
    }

    public void addPost(Post novoPost) {
        posts.add(novoPost);
    }

    public void addPonto(PontosDeApoio novoPonto) {
        pontos.add(novoPonto);
    }

    public static ArrayList<Usuaria> getCadastros() {
        return cadastros;
    }

    public static ArrayList<Post> getPosts() {
        return posts;
    }

    public static ArrayList<PontosDeApoio> getPontos() {
        return pontos;
    }

}
