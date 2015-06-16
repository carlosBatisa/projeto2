drop database if exists boato;
create database boato;
use boato;

create table correntista(
numero int primary key,
nome varchar(35),
email varchar(50) unique,
saldo double);

create table movimentacao(
idmovimentacao int primary key auto_increment,
deposito double,
retirada double,
dataMovimentacao timestamp,
fknumero int,
foreign key(fknumero) references correntista(numero)
on delete cascade);