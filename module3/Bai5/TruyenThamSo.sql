drop database if exists test3 ;
create database if not exists test3 ;
use test3;
create table customer2 (
customerNumber int unique not null ,
customerName varchar(40) not null ,
contactFirstName varchar(40) not null ,
contactLastName varchar(40) not null ,
phone int not null ,
addressLine1 varchar(60) ,
constraint pk_customerNumber primary key (customerNumber)
);