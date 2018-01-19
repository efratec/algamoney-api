create table categoria (
	codigo BIGINT(20) auto_increment,
	nome VARCHAR(50) not null
	primary key (codigo)
) ENGINE=InnoDB default charset = utf8;

insert into categoria (nome) values ('Lazer');
insert into categoria (nome) values ('Alimentação');
insert into categoria (nome) values ('Supermercado');
insert into categoria (nome) values ('Farmácia');
insert into categoria (nome) values ('Outros');