drop database if exists demo1;
create database if not exists demo1;
use demo1;
create table users (
id int(10) not null auto_increment ,
name varchar(50) ,
email varchar(50),
country varchar(50),
primary key(id)
);
insert into users(name,email,country) values ('hoang','hoang@113.com','Viet Nam');
insert into users(name,email,country) values ('Rell','rell@113.com','My');
insert into users(name,email,country) values ('trung','trung@113.com','Trung Quoc');
insert into users(name,email,country) values ('kem','kem@113.com','nhat ban');
