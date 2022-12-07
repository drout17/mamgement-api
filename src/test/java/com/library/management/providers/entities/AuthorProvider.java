package com.library.management.providers.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.library.management.models.entities.Author;
import com.library.management.models.entities.Author.AuthorBuilder;
import com.library.management.models.entities.Book;


public class AuthorProvider {
	
	static List<Book> books = new ArrayList<>();
	
	public static AuthorBuilder aAuthor() {
		return Author.aAuthor()
				.id(1L)
				.name("Author 1")
				.dateOfBirth(LocalDate.of(2010, 04, 21))
				.bookList(books);
	}

}
