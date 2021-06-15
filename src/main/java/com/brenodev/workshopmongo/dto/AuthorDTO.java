package com.brenodev.workshopmongo.dto;

import java.io.Serializable;

import com.brenodev.workshopmongo.domain.User;


public class AuthorDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public AuthorDTO() {
	}
	
	// COPIAR OS DADOS DO USER PARA O AuthorDTO
	public AuthorDTO(User obj) {
		id = obj.getId();
		name= obj.getName();
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
