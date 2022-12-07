package com.library.management.service;

import java.util.List;

import com.library.management.models.entities.Author;

public interface AuthorService {
	
	public List<Author> fetchAll();
	public Author addAuthor(Author author);
	public void removeAuthor(Long id);
	public Author findById(Long id);

}
