package com.library.management.models.mappers;

import java.util.List;
import org.mapstruct.Mapper;

import com.library.management.models.dto.BookDto;
import com.library.management.models.entities.Book;

@Mapper(componentModel = "spring")
public interface BookMapper {
	
	Book bookDtotoBook(BookDto bookDto);
	List<Book> bookDtostoBooks(List<BookDto> bookDto);
	BookDto booktoBookDto(Book book);
	List<BookDto> bookstoBookDtos(List<Book> book);
	
}
