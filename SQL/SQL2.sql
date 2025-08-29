CREATE TABLE tb_pessoa2 (
	id bigint not null,
	nome varchar(50) not null,
	idade integer constraint check_idade
	CHECK (idade > 0 and idade < 120), 
	SEXO varchar(1) not null,
	constraint pk_id_pessoa primary key (id)
	
);

CREATE TABLE tb_estado (
	id bigint not null,
	nome varchar(50) not null, 
	sigla varchar(2) not null,
	constraint pk_sigla_estado primary key (sigla)
); 

alter table tb_pessoa2
add column sigla_estado varchar(2); 

alter table tb_pessoa2
add constraint fk_sigla_estado foreign key (sigla_estado) references tb_estado(sigla); 

Select * from tb_pessoa;
Select * from tb_estado;

drop table tb_pessoa; 

insert into tb_pessoa2 values (1, 'Rodrigo', 36, 'SP', 102030); 

CREATE TABLE tb_pessoa (
	id bigint not null,
	nome varchar(50) not null, 
	idade integer, 
	SEXO varchar(1), 
	sigla_estado varchar(2) not null,
	cpf bigint,
	constraint check_idade_pessoa CHECK (idade > 0 and idade < 120),
	constraint check_sexo_pessoa CHECK (sexo = 'M' or 'F'),
	constraint uq_cpf_pessoa unique (cpf),
	constraint pk_id_pessoa primary key(id),
	constraint fk_sigla_estado_pessoa foreign key (sigla_estado) references tb_estado(sigla)
); 	

insert into tb_estado(id, sigla, nome) values (nextval('sq_estado'), 'SP', 'São Paulo');
insert into tb_estado(id, sigla, nome) values (nextval('sq_estado'), 'RJ', 'Rio de Janeiro');

delete from tb_estado; 
delete from tb_pessoa;

insert into tb_pessoa values ();

create sequence sq_estado
start 1
increment 1 
owned by tb_estado.id;

insert into tb_estado(id, sigla, nome) values (nextval('sq_estado'), 'MG', 'Minas Gerais');

insert into tb_pessoa(id, nome,idade,sexo, sigla_estado, cpf) values (nextval('sq_pessoa2'), 'Rodrigo', 36,'M', 'SP', 102030);
insert into tb_pessoa(id, nome,idade,sexo, sigla_estado, cpf) values (nextval('sq_pessoa2'), 'Rodrigo', 36,'M', 'SP', 102040);

select currval('sq_pessoa2');


select * from tb_pessoa;
select * from tb_estado; 

--inner join 

select * from tb_pessoa p, tb_estado e
where p.sigla_estado = e.sigla;

select p.nome as nome_pessoa, e.nome as nome_estado 
from tb_pessoa as p
inner join tb_estado as e on p.sigla_estado = e.sigla;

select p.nome, e.nome 
from tb_pessoa as p, tb_estado as e
where p.sigla_estado = e.sigla;

select p.id, p.nome pessoa, e.id, e.nome estado
from tb_pessoa p
inner join tb_estado e on e.sigla = p.sigla_estado;

select p.nome as nome_pessoa, e.nome as nome_estado 
from tb_pessoa as p, tb_estado as e
where p.sigla_estado = e.sigla;

select p.id, p.nome as pessoa, e.id, e.nome as estado
from tb_pessoa as p
inner join tb_estado as e on e.sigla = p.sigla_estado;

--Left join

select p.id, p.nome as pessoa, e.id, e.nome as estado
from tb_pessoa as p
left join tb_estado as e on e.sigla = p.sigla_estado;

--Right join

select p.id, p.nome as pessoa, e.id, e.nome as estado
from tb_pessoa as p
right join tb_estado as e on e.sigla = p.sigla_estado;

--Full join(Menos utilizados, melhor usar o right ou left)

select p.id, p.nome as pessoa, e.id, e.nome as estado
from tb_pessoa as p
full join tb_estado as e on e.sigla = p.sigla_estado;

--Cross join (Repete os valores da tabela. Pouco utilizado)

select p.nome as nome_pessoa
from tb_pessoa as p
cross join tb_estado;
















