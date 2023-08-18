package br.edu.ifsp.javafx.aulas.model;

public class Post  {
    private String titulo;
    private String conteudo;
    private String tag;

    public Post(String titulo, String conteudo, String tag) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.tag = tag;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    @Override
    public String toString() {
        return "Titulo:" + titulo + "Conteudo:" + conteudo + "Tag:" + tag;
    }

}