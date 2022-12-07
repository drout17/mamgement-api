package com.library.management.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.library.management.models.entities.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
	
	@Query("""
			Select a from Author a 
			where a.id=:id  
			""")
	Optional<Author> findById(@Param("id") Long id);

}
