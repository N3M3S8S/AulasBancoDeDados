-- verificar bancos de dados já existentes
show databases;

--  escolhendo o banco de dados de info3
use info3;

-- verificando as tabelas do banco de dados escolhido
show tables;

-- exibindo a estrutura da tabela usuário
describe usuario;
describe usuario2;

-- criando novas tabelas (modelo para criar modelos)
CREATE TABLE usuario2 (
	idusuario INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    login VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    genero CHAR NULL
);

-- verificando linhas da tabela usuario
select * from usuario2;

-- inserindo usuários manualmente
insert into usuario2 (nome, email, login, senha, genero)
value ("josé", "jose@edu", "joserm", "maria", 'm');

-- apagando usuários indesejados
DELETE FROM usuario2 WHERE idusuario='5';