SHOW SCHEMAS;
CREATE SCHEMA info3;
CREATE SCHEMA revisao2;

USE revisao2;

SHOW TABLES;

CREATE TABLE usuario (
	id int not null primary key auto_increment,
    nome varchar(255),
    senha varchar(255)
);

CREATE TABLE telefones (
	idtelefone int not null primary key auto_increment,
	idusuario int not null,
    telefone varchar(255),
    foreign key (idusuario) REFERENCES usuario(idusuario)
);

describe usuario;

INSERT INTO usuario (id, nome, senha) values (1,"Emanuel","Teste");

select * FROM usuario;

-- Aula

use info3;

drop table telefones;

show tables;

(Select nome AS nome2 FROM usuario2) union (select id as codigo FROM usuario);

describe usuario2