CREATE TABLE IF NOT EXISTS tb_produto (
	id BIGINT NOT NULL,
	nome VARCHAR(50) NOT NULL,
	marca VARCHAR(20) NOT NULL UNIQUE,
	preco REAL NOT NULL
);

SELECT * FROM tb_produto;

ALTER TABLE tb_produto
ADD COLUMN estoque INTEGER DEFAULT 0;

DROP TABLE tb_produto;

INSERT INTO tb_produto (id, nome, marca, preco)
VALUES(1, 'Galaxy 16', 'Samsung', 4299.90);
INSERT INTO tb_produto (id, nome, marca, preco)
VALUES(2, 'Iphone 16', 'Apple', 6999.90);
INSERT INTO tb_produto (id, nome, marca, preco)
VALUES(3, 'Legion', 'Lenovo', 1599.90);
INSERT INTO tb_produto (id, nome, marca, preco)
VALUES(4, 'MotoG 16', 'Motorola', 1899.90);
INSERT INTO tb_produto (id, nome, marca, preco)
VALUES(5, 'Pocofone 16', 'Xiaomi', 1299.90);

update tb_produto set nome = 'PocoFone' where id = 5;

delete from tb_produto where id = 3;