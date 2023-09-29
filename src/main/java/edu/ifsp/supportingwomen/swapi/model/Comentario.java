package edu.ifsp.supportingwomen.swapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Comentario {  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeExibido;
    private String grupoCPost;
    private String texto;

    public Comentario(){

    }
    
    public Comentario(Long id, String nomeExibido, String grupoCPost, String texto) {
        this.id = id;
        this.nomeExibido = nomeExibido;
        this.grupoCPost = grupoCPost;
        this.texto = texto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeExibido() {
        return nomeExibido;
    }

    public void setNomeExibido(String nomeExibido) {
        this.nomeExibido = nomeExibido;
    }

    public String getGrupoCPost() {
        return grupoCPost;
    }

    public void setGrupoCPost(String grupoCPost) {
        this.grupoCPost = grupoCPost;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }


}
