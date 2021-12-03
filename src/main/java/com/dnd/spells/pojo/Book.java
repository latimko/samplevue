package com.dnd.spells.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="BOOK")
@Data
public class Book {

    @Id
    @Column
    private int bookid;

    @Column
    private String name;

    public Book() {
        //do nothing.
    }
}
