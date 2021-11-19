package com.dnd.spells.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dnd.spells.pojo.Spells;
import com.dnd.spells.services.SpellsService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/v1")
public class DndController {
	
	@Autowired
	SpellsService spellsService;
	
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
	
	@RequestMapping(method = RequestMethod.GET, value = "/spell/{}")
	public ResponseEntity<?> getSpellName(@PathVariable int id) {
		log.info("DndController: get spell");
		Optional<Spells> spell = spellsService.getSpellById(id);
		return ResponseEntity.ok(spell.toString());
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/spells")
	public ResponseEntity<?> getAllSpells() {
		log.info("DndController: get all spells");
		List<Spells> spells = spellsService.getAllSpells();
		return ResponseEntity.ok(spells);
		
	}

}
