INSERT INTO unidade_medida (idunidade_medida, nome_unidade_medida) VALUES (1, 'quilograma');
INSERT INTO unidade_medida (idunidade_medida, nome_unidade_medida) VALUES (2, 'unidade');
INSERT INTO unidade_medida (idunidade_medida, nome_unidade_medida) VALUES (3, 'litro');

INSERT INTO produto (idproduto, nome_produto, quantidade_produto, preco_produto, fk_idunidade_medida) VALUES (1, 'Carne', 2, 30.00, 1);
INSERT INTO produto (idproduto, nome_produto, quantidade_produto, preco_produto, fk_idunidade_medida) VALUES (2, 'Óleo', 1, 30.00, 2);
INSERT INTO produto (idproduto, nome_produto, quantidade_produto, preco_produto, fk_idunidade_medida) VALUES (3, 'Leite', 1.5, 30.00, 3);
INSERT INTO produto (idproduto, nome_produto, quantidade_produto, preco_produto, fk_idunidade_medida) VALUES (4, 'Alface', 1, 30.00, 2);
INSERT INTO produto (idproduto, nome_produto, quantidade_produto, preco_produto, fk_idunidade_medida) VALUES (5, 'Brócolis', 5, 6.90, 2);

SELECT * FROM unidade_medida;
SELECT * FROM produto;

UPDATE produto
	SET quantidade_produto = 5
    WHERE nome_produto = "Óleo";

UPDATE produto
	SET preco_produto = 5.85
    WHERE idproduto = 3;

SELECT nome_produto, quantidade_produto, preco_produto, nome_unidade_medida FROM produto, unidade_medida
WHERE produto.fk_idunidade_medida = unidade_medida.idunidade_medida AND unidade_medida.nome_unidade_medida = "quilograma";

DELETE FROM produto WHERE nome_produto = "Brócolis";