package com.library.management.models.dto;

import java.time.LocalDate;

public record AuthorDto(Long id,String name,LocalDate dateOfBirth) {
	
}
