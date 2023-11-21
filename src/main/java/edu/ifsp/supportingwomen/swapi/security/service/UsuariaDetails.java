package edu.ifsp.supportingwomen.swapi.security.service;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import edu.ifsp.supportingwomen.swapi.model.Usuaria;

public class UsuariaDetails {
    private Usuaria usuariaTeste;

    public UsuariaDetails(Usuaria usuaria){
        this.usuariaTeste = usuaria;
    }
    
    @Override
    public String getSenha() {
        return this.usuariaTeste.getSenha();
    }

    @Override
    public String getNome() {
        return this.usuariaTeste.getNome();
    }
}
