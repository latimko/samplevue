DROP TABLE IF EXISTS spells;

CREATE TABLE spells (
	id INT PRIMARY KEY,
	name VARCHAR(250) NOT NULL,
	description VARCHAR(500) NOT NULL
);

INSERT INTO spells (id, name, description) VALUES
  (1, 'Fireball', 'big ol ball of fire.'),
  (2, 'Eldritch Blast', 'Warlock staple');