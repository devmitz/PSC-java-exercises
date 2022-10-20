-- CREATE DATABASE db_pessoas;
-- USE db_pessoas;

CREATE TABLE if not exists tb_pessoa(
	codigo INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(200),
	fone VARCHAR(200),
	email VARCHAR(200)
);

-- INSERT INTO tb_pessoa (nome, fone, email) VALUES ('Jose','11223344','jose@email.com');
-- INSERT INTO tb_pessoa (nome, fone, email) VALUES ('Joao','22334455','joao@email.com');
-- INSERT INTO tb_pessoa (nome, fone, email) VALUES ('Maria','33445566','maria@email.com');

-- update tb_pessoa set nome='José da Silva' where codigo = 1;

-- delete from tb_pessoa where codigo = 3;

SELECT * FROM tb_pessoa;