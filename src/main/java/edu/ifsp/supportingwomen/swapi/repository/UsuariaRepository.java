package edu.ifsp.supportingwomen.swapi.repository;

import org.springframework.data.repository.CrudRepository;

import edu.ifsp.supportingwomen.swapi.model.Usuaria;

public interface UsuariaRepository extends CrudRepository<Usuaria, Long>{
    void deleteById(Long id);
}
