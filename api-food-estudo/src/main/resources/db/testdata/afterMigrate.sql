set foreign_key_checks = 0;

delete from cidade;
delete from cozinha;
delete from cidade;
delete from estado;
delete from restaurante;

set foreign_key_checks = 1;

alter table cidade auto_increment = 1;
alter table cozinha auto_increment = 1;
alter table cidade auto_increment = 1;
alter table estado auto_increment = 1;
alter table restaurante auto_increment = 1;

insert into cozinha (id, nome) values (1, 'Tailandesa');
insert into cozinha (id, nome) values (2, 'Japonesa');

insert into estado (id, nome) values (1, 'Veneza');

insert into restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao, endereco_cep, endereco_logradouro, endereco_numero, endereco_bairro) values (1, 'Thai B', 10, 1, utc_timestamp, utc_timestamp, '5456-5484', 'Rua Vezes' , '100' , 'Centro');
insert into restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) values (2, 'Thai A', 9.50, 1, utc_timestamp, utc_timestamp);
insert into restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) values (3, 'Sushi', 15, 2, utc_timestamp, utc_timestamp);