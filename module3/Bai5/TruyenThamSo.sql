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
select * from customer2 ;
DELIMITER //
CREATE PROCEDURE getCusById

(IN cusNum INT(11))

BEGIN

  SELECT * FROM customer2 WHERE customerNumber = cusNum;

END //

DELIMITER ;
call getCusById(2);
DELIMITER //

CREATE PROCEDURE GetCustomersCountByName(

    IN  in_Name VARCHAR(50),

    OUT total INT

)

BEGIN

    SELECT COUNT(customerNumber)

    INTO total

    FROM customer2

    WHERE customerName = in_Name;

END//

DELIMITER ;
select * from customer2 ;
CALL GetCustomersCountByName('A',@total);

SELECT @total;