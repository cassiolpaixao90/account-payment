CREATE TABLE category(
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL 
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO category (nome) values ('Lazer');
INSERT INTO category (nome) values ('Alimentação');
INSERT INTO category (nome) values ('Supermercado');
INSERT INTO category (nome) values ('Farmácia');
INSERT INTO category (nome) values ('Outros');