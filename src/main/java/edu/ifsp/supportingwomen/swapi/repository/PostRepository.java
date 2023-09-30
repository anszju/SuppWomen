package edu.ifsp.supportingwomen.swapi.repository;

import org.springframework.data.repository.CrudRepository;

import edu.ifsp.supportingwomen.swapi.model.Post;

public interface PostRepository extends CrudRepository<Post, Long>{
    void deleteById(Long id);
    
    Iterable<Post> findAllById(String tags);

}
