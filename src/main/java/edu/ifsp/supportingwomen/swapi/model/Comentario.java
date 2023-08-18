package br.edu.ifsp.javafx.aulas.model;

public class Comentario {  
    private String nomeExibido;
    private String grupoCPost;

    private String texto;

    public Comentario(String nomeExibido, String grupoCPost, String texto) {
        this.nomeExibido = nomeExibido;
        this.grupoCPost = grupoCPost;
        this.texto = texto;
    }
    
    
    public String getNomeExibido() {
        return nomeExibido;
    }

    public void setNomeExibido(String nomeExibido) {
        this.nomeExibido = nomeExibido;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getGrupoCPost() {
        return grupoCPost;
    }

    public void setGrupoCPost(String grupoCPost) {
        this.grupoCPost = grupoCPost;
    } 

}
