drop database if exists resort ;
create database if not exists resort ;
use resort ;

create table customer_type (
customer_type_id int ,
customer_type_name varchar(45),
primary key(customer_type_id)
);
create table customer (
customer_id int ,
customer_type_id int ,
customer_name varchar(45),
customer_birthday date ,
customer_gender bit(1),
customer_id_card varchar(45),
customer_phone varchar(45) ,
customer_email varchar(45),
customer_address varchar(45),
constraint pk_customer_id primary key(customer_id),
constraint fk_customer_type_id foreign key (customer_type_id) references  customer_type(customer_type_id)
);
create table service_type (
service_type_id int ,
service_type_name varchar(45),
primary key(service_type_id)
);
create table rent_type (
rent_type_id int ,
rent_type_name varchar(45),
rent_type_cost double,
primary key(rent_type_id)
);
create table service (
service_id int ,
service_name varchar(45),
service_area int ,
service_cost double ,
service_max_people int ,
rent_type_id int ,
service_type_id int ,
standard_room varchar(45),
description_other_convenience varchar(45),
pool_area double ,
number_of_floors int ,
constraint pk_service_id primary key (service_id),
constraint fk_rent_type_id foreign key (rent_type_id) references rent_type (rent_type_id),
constraint fk_service_type_id foreign key(service_type_id) references service_type (service_type_id)
);

create table employee (
employee_id int ,
employee_name varchar (45),
employee_birthday date ,
employee_id_card varchar(45),
employee_salary double ,
employee_phone varchar (45),
employee_email varchar(45),
employee_address varchar(45),
position_id int ,
education_degree_id int ,
division_id int ,
username varchar(255),
constraint pk_employee_id primary key (emloyee_id),
constraint fk_position_id foreign key (position_id) references position (position_id),
constraint fk_education_degree_id foreign key (education_degree_id) references education_degree_id (education_degree_id),
constraint fk_division_id foreign key (division_id) references division(division_id),
constraint fk_username foreign key (username) references user (username)
);
create table position (
position_id int ,
position_name varchar(45),
primary key (position_id)
);
create table education_degree (
education_degree_id int ,
education_degree_name varchar(45),
primary key (education_degree_id)
);
create table division (
division_id int ,
division_name varchar(45),
primary key(division_id)
);
create table contract (
contract_id int ,
contract_start_date datetime,
contract_end_date datetime,
contract_deposit double ,
contract_total_money double,
employee_id int ,
customer_id int ,
service_id int,
constraint pk_contract_id primary key (contract_id),
constraint fk_employee_id foreign key (employee_id) references employee (employee_id),
constraint fk_customer_id foreign key (customer_id) references customer (customer_id),
constraint fk_service_id foreign key (service_id) references service (service_id)
);
create table contract_detail (
contract_detail_id int ,
contract_id int, 
attach_service_id int,
quantity int ,
constraint pk_contract_detail_id primary key (contract_detail_id),
constraint fk_contract_id foreign key (contract_id)references contract(contract_id),
constraint fk_attach_service_id foreign key (attach_service_id) references attach_service (attach_service_id)
);
create table attach_service(
attach_service_id int ,
attach_service_name varchar(45),
attach_service_cost double ,
attach_service_unit int,
attach_service_status varchar(45),
primary key (attach_service_id)
);
create table user (
username varchar(255),
password varchar(255)

);
create table role (
role_id int ,
role_name varchar(255)
);
create table user_role (
role_id int,
username varchar (255)
);