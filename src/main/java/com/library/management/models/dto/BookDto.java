package com.library.management.models.dto;

import java.time.LocalDate;

public record BookDto(Long id,String name,LocalDate dateOfBirth) {
	
}
