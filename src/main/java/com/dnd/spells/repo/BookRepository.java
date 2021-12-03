package com.dnd.spells.repo;

import com.dnd.spells.pojo.Book;
import com.dnd.spells.pojo.Spells;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource()
public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query("select b from Book b where b.name = ?1")
    Book findBookByName(String name);

}
