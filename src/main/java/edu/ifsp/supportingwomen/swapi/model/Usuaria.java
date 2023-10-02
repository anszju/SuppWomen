package edu.ifsp.supportingwomen.swapi.model;

import java.util.ArrayList;

import edu.ifsp.supportingwomen.swapi.repository.UsuariaRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuaria extends Perfil implements GrupoDeAcesso{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String nome;
    public String redes_social;
    public String apresentacao;
    private String cpf;
    private String nascimento;
    private String cidade;
    private String rua;
    private String bairro;
    private int numero;
    private String estado;
    private String email;
    private ArrayList<String> tagsGrupos;

    public Usuaria(){
    }

    // public Usuaria atualizaCad(Usuaria clone){
    // Usuaria novaUsuaria = new Usuaria();
    // novaUsuaria.redes_social = clone.redes_social;
    // novaUsuaria.apresentacao = clone.apresentacao;
    // novaUsuaria.email = clone.email;
    // return novaUsuaria;   

    // }
    public Usuaria(Long id, String nome, String redes_social, String apresentacao, String cpf, String nascimento, String cidade,
            String rua, String bairro, int numero, String estado, String email) {
        super(nome, redes_social, apresentacao);
        this.nome = nome;
        this.apresentacao = apresentacao;
        this.redes_social = redes_social;
        this.id = id;
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
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
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

    public void addPontoDeApoio(PontosDeApoio pontosDeApoio) {
    }



}

    
