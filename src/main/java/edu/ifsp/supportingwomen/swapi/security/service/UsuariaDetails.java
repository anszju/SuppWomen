package edu.ifsp.supportingwomen.swapi.security.service;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import edu.ifsp.supportingwomen.swapi.model.Usuaria;

public class UsuariaDetails implements UserDetails{
    private Usuaria usuariaTeste;

    public UsuariaDetails(Usuaria usuaria){
        this.usuariaTeste = usuaria;
    }
    
    @Override
    public String getPassword() {
        return this.usuariaTeste.getSenha();
    }

    @Override
    public String getUsername() {
        return this.usuariaTeste.getNome();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAuthorities'");
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAccountNonExpired'");
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAccountNonLocked'");
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isCredentialsNonExpired'");
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEnabled'");
    }
}
