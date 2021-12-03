package com.dnd.spells.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dnd.spells.pojo.Spells;

import java.util.List;

@RepositoryRestResource()
public interface SpellsRepository extends JpaRepository<Spells, Integer> {

    @Query("select s from Spells s where s.book = ?1")
    List<Spells> findByBookID(int bookId);
}
