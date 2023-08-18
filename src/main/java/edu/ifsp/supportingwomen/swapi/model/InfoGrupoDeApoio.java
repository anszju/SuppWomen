package edu.ifsp.supportingwomen.swapi.model;

public class InfoGrupoDeApoio extends Perfil {
    private double avaliacao;
    private String tema;

    public InfoGrupoDeApoio(String nome, String redes_social, String apresentacao, double avaliacao, String tema) {
        super(nome, redes_social, apresentacao);
        this.avaliacao = avaliacao;
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }


    public void setTema(String tema) {
        this.tema = tema;
    }

    public double getAvaliacao() {
        return avaliacao;
    }


    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String mostrarPerfil() {
        String result;
        result = "[nome=" + this.getNome() + ", redes_social=" + this.getRedes_social() + ", apresentacao=" + this.getApresentacao() + "]\n";
        System.out.println(result);
        return result;
    }
}


    

    

