drop database if exists test2 ;
create database if not exists test2 ;
use test2 ;
create table customer1 (
customerNumber int unique not null ,
customerName varchar(40) not null ,
contactFirstName varchar(40) not null ,
contactLastName varchar(40) not null ,
phone int not null ,
addressLine1 varchar(60) ,
constraint pk_customerNumber primary key (customerNumber)
);
DELIMITER //

CREATE PROCEDURE findAllCustomers()

BEGIN

  SELECT * FROM customer1;

END //

DELIMITER ;
DELIMITER //

DROP PROCEDURE IF EXISTS `findAllCustomers`//

CREATE PROCEDURE findAllCustomers()

BEGIN

   SELECT *  FROM customers where customerNumber = 175;

END; //

DELIMITER ;

 

