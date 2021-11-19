package com.dnd.spells.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.dnd.spells.pojo.Spells;
import com.dnd.spells.repo.SpellsRepository;

@Component
public class SpellsService {
	
	private SpellsRepository spellsRepository;
	
	public SpellsService(SpellsRepository spellsRepository) {
		this.spellsRepository = spellsRepository;
	}
	
	public Optional<Spells> getSpellById(int id) {
		return spellsRepository.findById(id);
	}
	
	public List<Spells> getAllSpells() {
		return spellsRepository.findAll();
	}

}
