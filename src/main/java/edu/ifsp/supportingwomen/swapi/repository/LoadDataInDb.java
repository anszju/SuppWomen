package edu.ifsp.supportingwomen.swapi.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import edu.ifsp.supportingwomen.swapi.model.Usuaria;

@Configuration
public class LoadDataInDb implements CommandLineRunner {

    @Autowired
    UsuariaRepository usuariaRepository;

    @Autowired
    PasswordEncoder passwordEncoder;
    
    @Override
    public void run(String... args) throws Exception {
        ArrayList<Usuaria> usuariasN = new ArrayList<>();
        usuariasN.add(new Usuaria(null, "Maria Carla", "@mmaria", "Meu nome é Maria e tenho 20 anos.", "214.589.745-88", "20/04/2003", "Bragança Paulista", "Rua José Maia", "Matadouro", 25, "São Paulo", "maria@gmail.com", passwordEncoder.encode("1234")));
        usuariasN.add(new Usuaria(null, "Julia", "@mmaria", "Meu nome é Maria e tenho 20 anos.", "214.589.745-88", "20/04/2003", "Bragança Paulista", "Rua José Maia", "Matadouro", 25, "São Paulo", "julia@gmail.com", passwordEncoder.encode("5678")));
        usuariaRepository.saveAll(usuariasN);
    }
}
