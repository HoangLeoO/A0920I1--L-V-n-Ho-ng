drop database if exists thuchanh_1;
create database if not exists thuchanh_1;
use thuchanh_1 ;
create table productlines (
productLine  varchar(255) not null unique,
textDescription varchar(255) not null,
htmlDescription varchar(255) not null ,
image text not null ,
constraint pk_productLine primary key (productLine)
);
create table products (
productsCode int not  null,
productName  varchar (255)  not null,
productLine  varchar (255) not null,
productScale  varchar (255) not null,
productVendor  varchar (255) not null,
productDescription varchar (255) not null,
quantityInStock  int  not null,
buyPrice  float not null,
MSRP  varchar (255) not null ,
constraint pk_productsCode primary key (productsCode),
constraint fk_productLine foreign key (productLine) references productlines(productLine)
);
select productsCode, productName, buyprice, quantityInStock from products
where buyprice > 56.76 and quantityInStock > 10 ;
SELECT productsCode,productName, buyprice, textDescription
FROM products
INNER JOIN productlines
ON products.productline = productlines.productline
WHERE buyprice > 56.76 AND buyprice < 95.59;
select productsCode, productName, buyprice, quantityInStock, productVendor, productLine 
from products 
where productLine = 'Classic Cars' or productVendor = 'Min Lin Diecast' ;