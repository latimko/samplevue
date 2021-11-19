package com.dnd.spells.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dnd.spells.pojo.Spells;

@RepositoryRestResource()
public interface SpellsRepository extends JpaRepository<Spells, Integer>, JpaSpecificationExecutor<Spells>, QuerydslPredicateExecutor<Spells> {}
