drop database if exists test ;
create database if not exists test ;
use test ;
create table customers (
customerNumber int not null unique ,
customerName varchar(255) not null ,
contactLastName varchar(255) not null ,
contactFirstName varchar (255) not null ,
phone int unique not  null ,
addressLine1 varchar (255) unique not null ,
addressLine2 varchar (255) unique not null ,
city varchar(255) not  null ,
state varchar(255) not null ,
postalCode int unique not null ,
country varchar(255) not  null ,
salesRepEmployeeNumber int not null ,
creditLimit int not null ,
constraint pk_customerNumber primary key (customerNumber)
);
create table orders (
ordersNumber int unique not null ,
orderDate date not null ,
requiredDate date not null ,
shippedDate date not null ,
status  varchar(255) not null ,
comments varchar(255),
customerNumber int unique not null ,
constraint pk_ordersNumber primary key (ordersNumber) ,
constraint fk_customerNumber foreign key(customerNumber) references customers(customerNumber)
);
create table payments (
customerNumber int unique not null ,
checkNumber int not null ,
paymentDate date not null ,
amount float  not null ,
constraint pk_customerNumber_checkNumber primary key (customerNumber,checkNumber),
constraint fk_customer_Number foreign key(customerNumber) references customers(customerNumber)
);
select customers.customerNumber ,customerName , phone , paymentDate , amount from customers 
inner join payments on  customers.customerNumber = payments.customerNumber 
where city = 'Las Vegas' ;
select customers.customerNumber, customers.customerName, orders.ordersNumber, orders.status
from customers
left join orders
on customers.customerNumber = orders.customerNumber ;
select customers.customerNumber, customers.customerName, orders.ordersNumber, orders.status
from customers LEFT JOIN orders
on customers.customerNumber = orders.customerNumber
where ordersNumber is null;