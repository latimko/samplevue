package com.dnd.spells.services;

import com.dnd.spells.pojo.Book;
import com.dnd.spells.pojo.Spells;
import com.dnd.spells.repo.BookRepository;
import com.dnd.spells.repo.SpellsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Slf4j
@Component
public class BookService {

	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public Book getBookByName(String name) {
		log.info("name {}", name);
		return bookRepository.findBookByName(name);
	}

}
