CREATE SCHEMA IF NOT EXISTS loja_coma_bem;
USE loja_coma_bem;

CREATE TABLE IF NOT EXISTS unidade_medida (
  idunidade_medida INT NOT NULL,
  nome_unidade_medida VARCHAR(45) NULL,
  PRIMARY KEY (idunidade_medida));

INSERT INTO unidade_medida (idunidade_medida, nome_unidade_medida) VALUES (1, 'quilograma');
INSERT INTO unidade_medida (idunidade_medida, nome_unidade_medida) VALUES (2, 'unidade');
INSERT INTO unidade_medida (idunidade_medida, nome_unidade_medida) VALUES (3, 'litro');

CREATE TABLE IF NOT EXISTS produto (
  idproduto INT NOT NULL AUTO_INCREMENT,
  nome_produto VARCHAR(200) NULL,
  quantidade_produto FLOAT NULL,
  preco_produto DECIMAL(5,2) NULL,
  fk_idunidade_medida INT NULL,
  PRIMARY KEY (idproduto),
  CONSTRAINT fk_idunidade_medida
    FOREIGN KEY (fk_idunidade_medida)
    REFERENCES unidade_medida (idunidade_medida));

INSERT INTO produto (idproduto, nome_produto, quantidade_produto, preco_produto, fk_idunidade_medida) VALUES (1, 'Carne', 2, 30.00, 1);
INSERT INTO produto (idproduto, nome_produto, quantidade_produto, preco_produto, fk_idunidade_medida) VALUES (2, 'Óleo', 1, 30.00, 2);
INSERT INTO produto (idproduto, nome_produto, quantidade_produto, preco_produto, fk_idunidade_medida) VALUES (3, 'Leite', 1.5, 30.00, 3);
INSERT INTO produto (idproduto, nome_produto, quantidade_produto, preco_produto, fk_idunidade_medida) VALUES (4, 'Alface', 1, 30.00, 2);

SELECT * FROM unidade_medida;
SELECT * FROM produto;

SELECT nome_produto, quantidade_produto, preco_produto, nome_unidade_medida FROM produto, unidade_medida
WHERE produto.fk_idunidade_medida = unidade_medida.idunidade_medida AND unidade_medida.nome_unidade_medida = "quilograma";