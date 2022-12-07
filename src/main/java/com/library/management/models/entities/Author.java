package com.library.management.models.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder(builderMethodName = "aAuthor", toBuilder = true)
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private LocalDate dateOfBirth;
	
	@OneToMany(cascade =CascadeType.ALL, fetch = FetchType.LAZY,orphanRemoval = true, mappedBy = "author")
	private List<Book> bookList = new ArrayList<>();

}
