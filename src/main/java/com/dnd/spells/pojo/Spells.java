package com.dnd.spells.pojo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Table(name="SPELLS")
@Data
public class Spells {

	@Id
	@Column
	private int id;
	
	@Column
	@NotNull(message="{NotNull.Spells.name")
	private String name;
	
	@Column
	@NotNull(message="{NotNull.Spells.description")
	private String description;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "bookid", nullable = false)
	private Book book;

	public Spells() {
		// do nothing.
	}

	public Spells(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Spells(String name, String description, Book book) {
		this.name = name;
		this.description = description;
		this.book = book;
	}

}
