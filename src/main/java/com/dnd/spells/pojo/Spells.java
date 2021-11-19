package com.dnd.spells.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
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
}
