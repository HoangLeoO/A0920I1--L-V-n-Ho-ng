DROP DATABASE IF EXISTS baitap;
CREATE database if not exists baitap;
use baitap;
create table khach_hang(
 ID int primary key,
 Name varchar(255),
 Phone int ,
 City varchar(255)
);
select*from khach_hang ;
select*from khach_hang where Name = 'Atelier Graphique';
