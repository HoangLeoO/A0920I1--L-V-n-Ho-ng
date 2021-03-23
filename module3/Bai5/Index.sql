drop database if exists classicmodels ;
create database if not exists classicmodes ;
use classicmodes ;
create table customer (
customerNumber int unique not null ,
customerName varchar(40) not null ,
contactFirstName varchar(40) not null ,
contactLastName varchar(40) not null ,
phone int not null ,
addressLine1 varchar(60) ,
constraint pk_customerNumber primary key (customerNumber)
);
select * from customer ;
select * from customer where customerNumber = 3;
explain select * from customer where customerNumber = 3;
alter table customer add index idx_customerNumber(customerNumber) ;
explain select * from customer where customerNumber = 3;