package com.brenodev.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.brenodev.workshopmongo.domain.Post;

@Repository
// CRIAR UM REPOSITORIO UTILIZANDO O MONGO DB
public interface PostRepository extends MongoRepository<Post, String>{

	// ENCONTRAR PELO TITULO UTILIZANDO O CONTAINING IGNORANDO AS LETRAS UP E LOW CASE
	List<Post> findByTitleContainingIgnoreCase(String text);
	
	// PESQUISA NO BANCO DE DADOS UTILIZANDO O QUERY COM PARAMETROS
	@Query("{ 'title': { $regex: ?0, $options: 'i' } }")
	List<Post> searchTitle(String text);
	
}
