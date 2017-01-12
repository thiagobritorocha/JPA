# jpa
#Inserts table locacaoprodutos

insert into locacaoprodutos(idLocacao,CPFCliente,NomeCliente,CodigoProduto) values (1001,50037256718,'Andre',1);
insert into locacaoprodutos(idLocacao,CPFCliente,NomeCliente,CodigoProduto) values (1002,69023631889,	'Murilo',	2);
insert into locacaoprodutos(idLocacao,CPFCliente,NomeCliente,CodigoProduto) values (1003,73882115270,	'Fernando',	3);
insert into locacaoprodutos(idLocacao,CPFCliente,NomeCliente,CodigoProduto) values (1004,50037256718,	'Andre',	1);
insert into locacaoprodutos(idLocacao,CPFCliente,NomeCliente,CodigoProduto) values (1005,69023631889,	'Murilo',	2);
insert into locacaoprodutos(idLocacao,CPFCliente,NomeCliente,CodigoProduto) values (1006,73882115270,	'Fernando',	1);
insert into locacaoprodutos(idLocacao,CPFCliente,NomeCliente,CodigoProduto) values (1007,50037256718,	'Andre',	1);
insert into locacaoprodutos(idLocacao,CPFCliente,NomeCliente,CodigoProduto) values (1008,69023631889,	'Murilo',	2);
insert into locacaoprodutos(idLocacao,CPFCliente,NomeCliente,CodigoProduto) values (1009,73882115270,	'Fernando',	3);
insert into locacaoprodutos(idLocacao,CPFCliente,NomeCliente,CodigoProduto) values (100010,50037256718,	'Andre',	1);
insert into locacaoprodutos(idLocacao,CPFCliente,NomeCliente,CodigoProduto) values (100011,69023631889,	'Murilo',	2);
insert into locacaoprodutos(idLocacao,CPFCliente,NomeCliente,CodigoProduto) values (100012,73882115270,	'Fernando',	1);

#inserts table pagamentoprodutos

insert into pagamentoprodutos (Locacao_idLocacao,dia,valorPagamento) values (1001,	STR_TO_DATE("11/01/17","%d/%m/%Y"),	100);
insert into pagamentoprodutos (Locacao_idLocacao,dia,valorPagamento) values (1002,	STR_TO_DATE("11/01/17","%d/%m/%Y"),	500);
insert into pagamentoprodutos (Locacao_idLocacao,dia,valorPagamento) values (1002,	STR_TO_DATE("11/01/17","%d/%m/%Y"),	100);
insert into pagamentoprodutos (Locacao_idLocacao,dia,valorPagamento) values (1003,	STR_TO_DATE("11/01/17","%d/%m/%Y"),	200);
insert into pagamentoprodutos (Locacao_idLocacao,dia,valorPagamento) values (1004,	STR_TO_DATE("11/01/17","%d/%m/%Y"),	300);
insert into pagamentoprodutos (Locacao_idLocacao,dia,valorPagamento) values (1005,	STR_TO_DATE("11/01/17","%d/%m/%Y"),	300);
insert into pagamentoprodutos (Locacao_idLocacao,dia,valorPagamento) values (1007,	STR_TO_DATE("11/01/17","%d/%m/%Y"),	300);
insert into pagamentoprodutos (Locacao_idLocacao,dia,valorPagamento) values (1008,	STR_TO_DATE("11/01/17","%d/%m/%Y"),	400);
insert into pagamentoprodutos (Locacao_idLocacao,dia,valorPagamento) values (1009,	STR_TO_DATE("12/01/17","%d/%m/%Y"),	300);
insert into pagamentoprodutos (Locacao_idLocacao,dia,valorPagamento) values (100010,STR_TO_DATE("12/01/17","%d/%m/%Y"),	300);
insert into pagamentoprodutos (Locacao_idLocacao,dia,valorPagamento) values (100012,STR_TO_DATE("12/01/17","%d/%m/%Y"),	400);
insert into pagamentoprodutos (Locacao_idLocacao,dia,valorPagamento) values (1002,	STR_TO_DATE("12/01/17","%d/%m/%Y"),	100);

#Query
select * from pagamentoprodutos
where dia = "2017-01-11%";
