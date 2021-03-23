drop database if exists test ;
create database if not exists test ;
use test ;
create table orders (
orderNumber int not null unique ,
orderDate date not null ,
requredDate date not null ,
shipperDate date not null ,
status varchar (255)  ,
comments varchar (255) ,
customerNumber int not null unique,
constraint pk_orderNumber primary key (orderNumber)
);
select status from orders 
group by status;
select status, COUNT(*) as 'So luong status'
from orders
group by status;