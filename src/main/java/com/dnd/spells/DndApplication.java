package com.dnd.spells;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.dnd")
public class DndApplication {

	public static void main(String[] args) {
		SpringApplication.run(DndApplication.class, args);
	}

}
