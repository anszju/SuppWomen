package edu.ifsp.supportingwomen.swapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PontosDeApoio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomePonto;
    private String latitude, longitude;

    
    public PontosDeApoio() {
        
    }

    public PontosDeApoio(Long id, String nomePonto, String latitude, String longitude) {
        this.id = id;
        this.nomePonto = nomePonto;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getNomePonto() {
        return nomePonto;
    }

    public void setNomePonto(String nomePonto) {
        this.nomePonto = nomePonto;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return nomePonto + latitude + longitude;
    }
}
