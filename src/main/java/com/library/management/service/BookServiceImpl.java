package com.library.management.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.library.management.models.entities.Book;
import com.library.management.repository.BookRepository;

import lombok.RequiredArgsConstructor;

//@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
	
	private final BookRepository bookRepository;

	@Override
	public List<Book> fetchAll() {
		List<Book> books = bookRepository.findAll();
		return books;
	}

	@Override
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void removeBook(Long id) {
		bookRepository.deleteById(id);
	}

}
