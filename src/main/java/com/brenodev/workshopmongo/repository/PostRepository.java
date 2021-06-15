package com.brenodev.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.brenodev.workshopmongo.domain.Post;

@Repository
// CRIAR UM REPOSITORIO UTILIZANDO O MONGO DB
public interface PostRepository extends MongoRepository<Post, String>{

}
