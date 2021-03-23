drop database if exists test_table ;
create database test_table ;
use test_table ;
create table sv (
id int not null  ,
ten varchar(40) not null ,
tuoi int  default(18),
khoahoc varchar(40) not null ,
sotien float not null , 
constraint pk_id primary key (id)
);

select * from sv ;
select ten , count(ten) from sv where ten='huong';
select ten , sum(sotien) from sv where ten='huong';
select ten from sv group by ten ;
select * from sv ;