drop database if exists qlsp ;
create database if not exists qlsp ;
use qlsp ;

create table employee(
	employee_id int auto_increment,
    employee_name  varchar(45),
    employee_birthday date,
    employee_phone varchar(45),
    employee_email varchar(45),
    employee_address varchar(45),
    PRIMARY KEY (employee_id)
);

create table customer(
	customer_id int primary key ,
    customer_name varchar(45),
    customer_birthday date,
    customer_gender boolean,
    customer_phone varchar(45),
    customer_email varchar(45),
    customer_address varchar(45)
);

create table product (
product_id int primary key,
product_name varchar(50) not null,
product_price float ,
product_discount int ,
product_stock int 
);
create table orders (
	corders_id int primary key auto_increment,
    orders_start_date datetime,
    orders_end_date datetime,
    employee_id int,
    customer_id int,
    product_id int 
);
ALTER TABLE orders
ADD CONSTRAINT FK_employee_id
FOREIGN KEY (employee_id) REFERENCES employee(employee_id),
ADD CONSTRAINT FK_customer_id
FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
ADD CONSTRAINT FK_product_id
FOREIGN KEY (product_id) REFERENCES product(product_id);

INSERT INTO employee  VALUES ('1', 'A', '2010-10-1','0123456789', 'A@gmail.com', 'xya') ;
INSERT INTO employee  VALUES ('2', 'B', '2000-10-2','0123456789', 'B@gmail.com', 'ABC') ;
INSERT INTO employee  VALUES ('3', 'C', '2000-10-3','0123456789', 'C@gmail.com', 'ABc') ;
INSERT INTO employee  VALUES ('4', 'X', '2000-10-4','0123456789', 'D@gmail.com', 'QWE') ;
INSERT INTO employee  VALUES ('5', 'Y', '2000-10-5','0123456789', 'E@gmail.com', 'EAX') ;
INSERT INTO employee  VALUES ('6', 'Z', '2000-10-6','0123456789', 'F@gmail.com', 'Quang Nam') ;
INSERT INTO employee  VALUES ('7', 'L', '2000-10-7','0123456789', 'G@gmail.com', 'Quang Nam') ;
INSERT INTO employee  VALUES ('8', 'M', '2000-10-9','0123456789', 'H@gmail.com', 'Quang Nam') ;
INSERT INTO employee  VALUES ('9', 'N', '2000-10-10','0123456789', 'K@gmail.com', 'Quang Nam') ;
INSERT INTO employee  VALUES ('10', 'K', '2030-10-19','0123456789', 'N@gmail.com', 'Quang Nam') ;


INSERT INTO customer VALUES ('0001', 'Hung', '2000-10-19', 0,  '123151321', 'hung@gmail.com', 'Da Nang');
INSERT INTO customer VALUES ('0002', 'Huyen', '2000-10-19', 1,  '123112311', 'huyen@gmail.com', 'Hue');
INSERT INTO customer  VALUES ('0003','Hai','2000-10-19', 0,  '156188899', 'hai@gmail.com', 'Quang Nam');
INSERT INTO customer VALUES ('0004','Linh', '2000-10-19', 1, '641563123', 'linh@gmail.com', 'Quang Tri');
INSERT INTO customer VALUES ('0006','A', '2000-10-11', 1, '2132312123', 'A@gmail.com', 'ASDASD');
INSERT INTO customer VALUES ('0007','c', '2003-10-11', 1, '21323223123123', 'A@gmail.com', 'ASDASD');
INSERT INTO customer VALUES ('0009','d', '2002-10-11', 1, '2132t53123', 'A@gmail.com', 'ASDASD');
INSERT INTO customer VALUES ('0000','E', '2001-10-11', 1, '213273123', 'Ad@gmail.com', 'ASDASD');

insert into product values('1','May tinh','20000','5','200');
insert into product values('2','May tinh','20000','5','200');
insert into product values('3','May tinh','20000','5','200');
insert into product values('4','May tinh','20000','5','200');
insert into product values('5','May tinh','20000','5','200');
insert into product values('6','May tinh','20000','5','200');
insert into product values('7','May tinh','20000','5','200');
insert into product values('8','May tinh','20000','5','200');
insert into product values('9','May tinh','20000','5','200');
insert into product values('10','May tinh','20000','5','200');
