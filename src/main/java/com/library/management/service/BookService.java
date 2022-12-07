package com.library.management.service;

import java.util.List;

import com.library.management.models.entities.Book;

public interface BookService {
	
	public List<Book> fetchAll();
	public Book addBook(Book book);
	public void removeBook(Long id);

}
