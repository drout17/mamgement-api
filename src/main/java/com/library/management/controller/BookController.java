package com.library.management.controller;


import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.library.management.models.entities.Book;
import com.library.management.service.AuthorService;
import com.library.management.service.BookService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
//@Slf4j
@CrossOrigin("*")
public class BookController {
	
	private final BookService bookService;
	
	private final AuthorService authorService;
	
	//private final BookMapper bookMapper;
	
	@Operation(method="GET", summary="Fetch Available Books", description = "Fetch All Books")
	@GetMapping(path="/fetchAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> fetchAll(){
		return bookService.fetchAll();
	}
	
	@Operation(method="POST", summary="Add New Book", description = "Add New Book")
	@PostMapping(path = "/addbook/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Book addBook(@RequestBody Book book, @PathVariable Long id){
		book.setAuthor(authorService.findById(id));
		return bookService.addBook(book);
	}
	
	@Operation(method="DELETE", summary="Remove a book by id", description = "Remove a book by id")
	@DeleteMapping(path = "/removeBook/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void removeBook(@PathVariable Long id){
		 bookService.removeBook(id);
	}
	
}
