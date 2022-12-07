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

import com.library.management.models.entities.Author;
import com.library.management.models.mappers.AuthorMapper;
import com.library.management.service.AuthorService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/author")
//@Slf4j
@CrossOrigin("*")
public class AuthorController {
	
	
	 private final AuthorService authorService;
	 
	private final AuthorMapper authorMapper;
	 
	
	@Operation(method="GET", summary="Fetch All Authors details", description = "Fetch All Authors details")	  
	@GetMapping("/fetchAll")
	public List<Author> fetchAll(){ 
		 return authorService.fetchAll(); 
	}
	  
	@Operation(method="POST", summary="Add New Author Data", description = "Add New Author Data") 
	@PostMapping(path = "/addauthor", produces = MediaType.APPLICATION_JSON_VALUE)
	public Author addAuthor(@RequestBody Author author){ 
		 return authorService.addAuthor(author); 
	}
	  
	@Operation(method="DELETE", summary="Remove a Author by id", description = "Remove a Author by id")
	@DeleteMapping(path = "/removeAuthor/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void removeAuthor(@PathVariable Long id){ 
		 authorService.removeAuthor(id); 
	}
	  
}
