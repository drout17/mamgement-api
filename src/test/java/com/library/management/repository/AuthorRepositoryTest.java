package com.library.management.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;

import com.library.management.providers.entities.AuthorProvider;

//@RunWith(SpringRunner.class)
@DataJpaTest
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
public class AuthorRepositoryTest {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	@Autowired
	private TestEntityManager testEntityManager;
	
	@Test
	@DisplayName("")
	void findById() {
		var author = AuthorProvider.aAuthor().build();
		testEntityManager.persistAndFlush(author);
		var expectedAuthor = authorRepository.findById(1L).get();
		assertEquals(author.getName(), expectedAuthor.getName());
	}
}
