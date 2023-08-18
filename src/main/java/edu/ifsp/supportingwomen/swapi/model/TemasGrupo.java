package br.edu.ifsp.javafx.aulas.model;

public class TemasGrupo {
    private String nomeTema;
    private String descricaoTema;

    public TemasGrupo(String nomeTema, String descricaoTema) {
        this.nomeTema = nomeTema;
        this.descricaoTema = descricaoTema;
    }

    public String getNomeTema() {
        return nomeTema;
    }

    public void setNomeTema(String nomeTema) {
        this.nomeTema = nomeTema;
    }

    public String getDescricaoTema() {
        return descricaoTema;
    }

    public void setDescricaoTema(String descricaoTema) {
        this.descricaoTema = descricaoTema;
    }
    
}
