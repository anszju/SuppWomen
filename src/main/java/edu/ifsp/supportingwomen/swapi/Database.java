package edu.ifsp.supportingwomen.swapi;

import java.util.ArrayList;

import edu.ifsp.supportingwomen.swapi.model.Comentario;
import edu.ifsp.supportingwomen.swapi.model.PontosDeApoio;
import edu.ifsp.supportingwomen.swapi.model.Post;
import edu.ifsp.supportingwomen.swapi.model.Usuaria;

// Esta classe simula um SGDB. Coloque onde ficará os dados aqui!

public class Database {
    private static ArrayList<Usuaria> cadastros;
    private static ArrayList<Post> posts; // get
    private static ArrayList<PontosDeApoio> pontos;
    private static ArrayList<Comentario> comentarios;

    public Database() {
        cadastros = new ArrayList<>();
        posts = new ArrayList<>();
        pontos = new ArrayList<>();
        comentarios = new ArrayList<>();

        pontos.add(new PontosDeApoio("cris", "123", "123"));
        pontos.add(new PontosDeApoio("cris", "123", "123"));
        pontos.add(new PontosDeApoio("cris", "123", "123"));
    
        
        cadastros.add(new Usuaria("Maria Carla", "@mmaria", "Meu nome é Maria e tenho 20 anos.", "214.589.745-88", "20/04/2003", "Bragança Paulista", "Rua José Maia", "Matadouro", 25, "São Paulo", "maria@gmail.com"));
        cadastros.add(new Usuaria("Paula Maria", "@paulaM", "Meu nome é Paula e tenho 20 anos.", "214.621.745-84", "19/04/2003", "Joãonópolis", "Rua Piracaia", "Mato dourado", 24, "São Paulo", "aula@gmail.com"));
        cadastros.add(new Usuaria("Fernada Lua", "@Fernandinha", "Meu nome é Fernanda e tenho 20 anos.", "211.589.745-98", "18/04/2003", "Perdões", "Rua São Paulo", "Mato prata", 212, "São Paulo", "fernanda@gmail.com"));

        posts.add(new Post("Violência Doméstica", "exemplo1", "Violência"));
        posts.add(new Post("Violência Física", "exemplo2", "Violência"));
        posts.add(new Post("Violência Moral", "exemplo3", "Violência"));

        comentarios.add(new Comentario("anaA", "flor de liz grupos1", "m exemplo1"));
        comentarios.add(new Comentario("anaB", "flor de liz grupos2", "m exemplo2"));
        comentarios.add(new Comentario("anaC", "flor de liz grupos3", "m exemplo3"));
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

    public void addComentario(Comentario novoComentario){
        comentarios.add(novoComentario);
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

    public static ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public static void updatePost (String titulo, String novoConteudo, String novaTag){
        for (Post post : posts) {
            if(post.getTitulo().equals(titulo)){
                post.setConteudo(novoConteudo);
                post.setTag(novaTag);
            }
        }
    }
    

    public static void updateUsuaria (String cpf, String novaRedesSocial, String novaApresentacao, String novoEmail){
        for(Usuaria usu : cadastros){
            if(usu.getCpf().equals(cpf)){
                usu.setRedes_social(novaRedesSocial);
                usu.setApresentacao(novaApresentacao);
                usu.setEmail(novoEmail);
            }
        }
    }



}
