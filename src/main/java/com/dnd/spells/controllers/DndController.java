package com.dnd.spells.controllers;

import java.util.List;
import java.util.Optional;

import com.dnd.spells.pojo.Book;
import com.dnd.spells.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dnd.spells.pojo.Spells;
import com.dnd.spells.services.SpellsService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/v1")
public class DndController {
	
	@Autowired
	SpellsService spellsService;

	@Autowired
	BookService bookService;
	
	/*
	@RequestMapping({"/"})
	public String loadUI() {
		log.info("loading UIssdd");
		return "forward:/index.html";
	}
	*/
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/helloworld")
	public String getHelloWorld() {
		return "hello world";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/spell/{id}")
	public ResponseEntity<?> getSpellName(@PathVariable int id) {
		log.info("DndController: get spell by it's ID");
		Optional<Spells> spell = spellsService.getSpellById(id);
		return ResponseEntity.ok(spell.toString());
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/spells")
	public ResponseEntity<?> getAllSpells() {
		log.info("DndController: get all spells");
		List<Spells> spells = spellsService.getAllSpells();
		return ResponseEntity.ok(spells);
		
	}

	@RequestMapping(method = RequestMethod.GET, value = "/spells/book/{bookid}")
	public ResponseEntity<?> getSpellsByBook(@PathVariable int bookid) {
		log.info("DndController: get spell by book id");
		List<Spells> spells = spellsService.getSpellsByBook(bookid);
		return ResponseEntity.ok(spells.toString());

	}

	@RequestMapping(method = RequestMethod.POST, value = "/addSpell")
	@ResponseBody
	public void addSpell(@RequestParam("name") String name, @RequestParam("description") String description) {
		spellsService.addSpell(name, description);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/addSpellToBook/{bookName}")
	@ResponseBody
	public void addSpell(@RequestParam("name") String name, @RequestParam("description") String description, @PathVariable("bookName") String bookName) {
		log.info("Add a spell");
		Book book = bookService.getBookByName(bookName);
		log.info("Book {}", book.toString());
		Spells spell = new Spells(name, description, book);
		log.info("spell {}", spell);
		spellsService.addSpell(spell);

	}

	@RequestMapping(method = RequestMethod.GET, value = "/book/{name}")
	public ResponseEntity<?> getBook(@PathVariable String name) {
		Book book = bookService.getBookByName(name);
		return ResponseEntity.ok(book.toString());
	}

}
