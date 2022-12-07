package com.library.management.models.mappers;

import java.util.List;
import org.mapstruct.Mapper;

import com.library.management.models.dto.AuthorDto;
import com.library.management.models.entities.Author;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
	
	Author authorDtotoAuthor(AuthorDto authorDto);
	List<Author> authorDtostoAuthors(List<AuthorDto> authorDto);
	AuthorDto authortoAuthorDto(Author author);
	List<AuthorDto> authorstoAuthorDtos(List<Author> author);
	
}
