drop database if exists quan_ly_tknh;
create database if not exists quan_ly_tknh;
use quan_ly_tknh;
create table customers (
number_customers int unique not null ,
fullname varchar(255) not null,
address varchar(255) not null,
email varchar(255) unique not null,
phone int unique not null ,
constraint pk_number_customers primary key (number_customers) 
);
create table accounts (
number_accounts int unique not null ,
accounts_type varchar (255) not null,
date_open_accounts date not null,
balence float not null ,
number_customers int ,
constraint pk_number_accounts primary key (number_accounts),
constraint fk_number_customers foreign key (number_customers) references customers (number_customers)
);
create table transations (
number_transations int unique not null ,
accounts_number int  not null,
date_transations date not null,
amounts float not null ,
descriptions varchar(255) not null ,
constraint pk_number_transations primary key (number_transations),
number_accounts int ,
constraint fk_number_accounts foreign key (number_accounts) references accounts (number_accounts)
);