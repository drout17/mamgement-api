package com.library.management.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.library.management.models.entities.Author;
import com.library.management.repository.AuthorRepository;

import lombok.RequiredArgsConstructor;

//@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {
	
	private final AuthorRepository authorRepository;

	@Override
	public List<Author> fetchAll() {
		return authorRepository.findAll();
	}

	@Override
	public Author addAuthor(Author author) {
		return authorRepository.save(author);
	}

	@Override
	public void removeAuthor(Long id) {
		authorRepository.deleteById(id);
	}

	@Override
	public Author findById(Long id) {
		return authorRepository.findById(id).get();
	}

}
