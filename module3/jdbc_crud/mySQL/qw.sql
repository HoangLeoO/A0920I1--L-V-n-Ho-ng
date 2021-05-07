CREATE USER 'hoang1'@'%' IDENTIFIED BY '123456';
GRANT ALL PRIVILEGES ON * . * TO 'hoang1'@'%';
drop database if exists student ;
create database if not exists student ;
create table student.student(
 id varchar(40) primary key ,
 name varchar (40) ,
 age int ,
 address varchar (40)
)