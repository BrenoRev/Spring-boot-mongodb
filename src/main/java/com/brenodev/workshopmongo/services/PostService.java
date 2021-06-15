package com.brenodev.workshopmongo.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brenodev.workshopmongo.domain.Post;
import com.brenodev.workshopmongo.repository.PostRepository;
import com.brenodev.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		// RETORNA UM OBJETO OU UMA EXCEÇÃO
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text){
		
		// return repo.findByTitleContainingIgnoreCase(text);
		
		// Metodo de Query com parametros
		return repo.searchTitle(text);
		
	}
	
	public List<Post> fullSearch(String text, Date minDate, Date maxDate){
		// ADICIONAR 24 HORAS A DATA
		maxDate = new Date(maxDate.getTime()+24*60*60*1000);
		return repo.fullSearch(text, minDate, maxDate);
	}
	}
