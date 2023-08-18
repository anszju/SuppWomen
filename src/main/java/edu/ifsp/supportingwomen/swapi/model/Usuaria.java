package edu.ifsp.supportingwomen.swapi.model;

import java.util.ArrayList;


public class Usuaria extends Perfil implements GrupoDeAcesso{
    private String cpf;
    private String nascimento;
    private String cidade;
    private String rua;
    private String bairro;
    private int numero;
    private String estado;
    private String email;
    private ArrayList<String> tagsGrupos;
    
    public Usuaria(String nome, String redes_social, String apresentacao, String cpf, String nascimento, String cidade,
            String rua, String bairro, int numero, String estado, String email) {
        super(nome, redes_social, apresentacao);
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.estado = estado;
        this.email = email;
        this.tagsGrupos = new ArrayList<>();
    }

    public void addGrupo(String grupo){
        tagsGrupos.add(grupo);
    }

    public boolean eDoGrupo(String grupoBusca){
        // grupoBusca: verbal
        // recupera(): violencia|assedio
        // contains("verbal"): true
        return this.recupera().contains(grupoBusca);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String mostrarPerfil() {
        String result;
        result = "[nome=" + this.getNome() + ", redes_social=" + this.getRedes_social() + ", apresentacao=" + this.getApresentacao() + "]\n";
        System.out.println(result);
        return result;
    }

    @Override
    public String recupera() {
        String grupos = "";
        for (String grupo : tagsGrupos) {
            grupos += grupo + "|";
        }

        return grupos.substring(0, grupos.length()-1);
    }

    @Override
    public void adiciona(String grupo) {
        this.tagsGrupos.add(grupo);
    }

    @Override
    public String toString() {
        return "Nome:" + nome + "Redes:" + redes_social + "Apresentação:" + apresentacao + "CPF:" + cpf + "Nascimento:" + nascimento + "Cidade:" + cidade + "rua" + rua+
        "Bairro:" + bairro + "Numero:" + numero + "Estado" + estado + "Email" + email;
    }
}

    
