create table tb_produto (
	id bigint not null,
	nome varchar(50) not null, 
	preco decimal(10,2) not null,
	estoque int not null,
	CONSTRAINT pk_id_produto primary key (id),
	constraint ckeck_preco_produto CHECK (preco >= 1),
	constraint check_estoque_produto CHECK (estoque >= 1)
); 

create table tb_cliente (
	id bigint not null,
	nome varchar(50) not null, 
	cpf bigint not null,
	telefone varchar(10),
	constraint pk_id_cliente primary key(id),
	constraint uq_cpf_cliente unique(cpf)
);


create table tb_venda (
	id bigint not null, 
	id_cliente bigint not null,
	id_produto bigint not null,
	quantidade int, 
	data_venda timestamp,
	constraint pk_id_venda primary key (id),
	constraint fk_id_cliente foreign key (id_cliente) references tb_cliente(id),
	constraint fk_id_produto foreign key (id_produto) references tb_produto(id),
	constraint check_quantidade_venda CHECK (quantidade >= 1)
);


create sequence tb_id_produto
start 1
increment 1 
owned by tb_produto.id;

create sequence tb_id_cliente
start 1
increment 1 
owned by tb_cliente.id;

create sequence tb_id_venda
start 1
increment 1 
owned by tb_venda.id;


insert into tb_produto (id, nome, preco, estoque) values (nextval('tb_id_produto'), 'Ipad', 5000.00, 10); 
insert into tb_produto (id, nome, preco, estoque) values (nextval('tb_id_produto'), 'Iphone', 7000.00, 5); 
insert into tb_produto (id, nome, preco, estoque) values (nextval('tb_id_produto'), 'MotoG', 1200.00, 20); 
select * from tb_produto;

insert into tb_cliente (id, nome, cpf, telefone) values (nextval('tb_id_cliente'), 'Stefanie', 11111111111, '99999-9999'); 
insert into tb_cliente (id, nome, cpf, telefone) values (nextval('tb_id_cliente'), 'Rodrigo', 22222222221, '98888-8888'); 
insert into tb_cliente (id, nome, cpf, telefone) values (nextval('tb_id_cliente'), 'Tania', 33333333331, '97777-7777'); 
select * from tb_cliente;

insert into tb_venda (id, id_cliente, id_produto, quantidade, data_venda) values (nextval('tb_id_venda'), 1, 2,10, now()); 
insert into tb_venda (id, id_cliente, id_produto, quantidade, data_venda) values (nextval('tb_id_venda'), 1, 1,1, now()); 
insert into tb_venda (id, id_cliente, id_produto, quantidade, data_venda) values (nextval('tb_id_venda'), 1, 2,3, now()); 
select * from tb_venda;

-- todas as vendas 
select v.id as tb_venda,
	c.nome as tb_cliente,
	p.nome as tb_produto,
	v.quantidade, 
	v.data_venda
from tb_venda v
inner join tb_cliente c on v.id_cliente = c.id
inner join tb_produto p on v.id_produto = p.id;






