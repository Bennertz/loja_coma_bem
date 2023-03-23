-- Criação de um usuário chamado "administrador"
CREATE USER administrador@localhost IDENTIFIED BY 'administrador';

-- Definindo que ele tem permissão para executar de tudo no schema "loja_coma_bem"
GRANT ALL PRIVILEGES ON loja_coma_bem.* TO administrador@localhost;

-- Criação de um usuário chamadado "usuario"
CREATE USER usuario@localhost IDENTIFIED BY 'usuario';

-- Definindo que ele só tem permissão para consultar e fazer atualizações no schema "loja_coma_bem"
GRANT SELECT, UPDATE ON loja_coma_bem.* to usuario;