package edu.ifsp.supportingwomen.swapi.model;
import java.util.ArrayList;

public abstract class Perfil {
    protected String nome;
    protected String redes_social;
    protected String apresentacao;

public Perfil(){
    
}
   
    public Perfil(String nome, String redes_social, String apresentacao) {
        this.nome = nome;
        this.redes_social = redes_social;
        this.apresentacao = apresentacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRedes_social() {
        return redes_social;
    }

    public void setRedes_social(String redes_social) {
        this.redes_social = redes_social;
    }

    public String getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(String apresentacao) {
        this.apresentacao = apresentacao;
    }
    
    @Override
    public String toString() {
        return "[nome=" + nome + ", redes_social=" + redes_social + ", apresentacao=" + apresentacao + "]";
    }

    public String mostraListaPerfil(ArrayList<Perfil> perfis){
        String result = "";
        for (Perfil p : perfis) {
          
           p.mostrarPerfil();
        }

        return result;
    }
    public abstract String mostrarPerfil();

}
