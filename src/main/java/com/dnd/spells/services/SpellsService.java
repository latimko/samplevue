package com.dnd.spells.services;

import java.util.List;
import java.util.Optional;

import com.dnd.spells.pojo.Book;
import com.dnd.spells.repo.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import com.dnd.spells.pojo.Spells;
import com.dnd.spells.repo.SpellsRepository;

@Slf4j
@Component
public class SpellsService {
	
	private SpellsRepository spellsRepository;
	
	public SpellsService(SpellsRepository spellsRepository) {
		this.spellsRepository = spellsRepository;
	}
	
	public Optional<Spells> getSpellById(int id) {
		log.info("in getSpellyById");
		return spellsRepository.findById(id);
	}
	
	public List<Spells> getAllSpells() {
		return spellsRepository.findAll();
	}

	public List<Spells> getSpellsByBook(int bookid) {
		return spellsRepository.findByBookID(bookid);
	}

	public void addSpell(String name, String description) {
		Spells spell = new Spells(name, description);
		spellsRepository.save(spell);
	}

	public void addSpell(Spells spell) {
		spellsRepository.save(spell);
	}

}
