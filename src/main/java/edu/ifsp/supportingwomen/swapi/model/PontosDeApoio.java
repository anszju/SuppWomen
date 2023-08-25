package edu.ifsp.supportingwomen.swapi.model;

public class PontosDeApoio {
    private String nomePonto;
    private String latitude, longitude;

    
    public PontosDeApoio() {
    }

    public PontosDeApoio(String nomePonto, String latitude, String longitude) {
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

    @Override
    public String toString() {
        return nomePonto + latitude + longitude;
    }
}
