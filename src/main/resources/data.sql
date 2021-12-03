DROP TABLE IF EXISTS Spells;
DROP TABLE IF EXISTS Book;

CREATE TABLE Book (
    bookid int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(500) NOT NULL
);

INSERT INTO Book (name) VALUES
    ('Cleric'), ('Druid'), ('Sorcerer'), ('Warlock'), ('Wizard');


CREATE TABLE Spells (
	id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(250) NOT NULL,
	description VARCHAR(500) NOT NULL,
	bookid INT,
    FOREIGN KEY (bookid) REFERENCES Book(bookid)
);

INSERT INTO Spells (name, description) VALUES
  ('Fireball', 'big ol ball of fire.'),
  ('Eldritch Blast', 'Warlock staple');