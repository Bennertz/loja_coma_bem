CREATE SCHEMA IF NOT EXISTS loja_coma_bem;
USE loja_coma_bem;

CREATE TABLE IF NOT EXISTS unidade_medida (
  idunidade_medida INT NOT NULL,
  nome_unidade_medida VARCHAR(45) NULL,
  PRIMARY KEY (idunidade_medida));

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
