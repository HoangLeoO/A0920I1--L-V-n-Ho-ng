drop database if exists resort ;
create database if not exists resort ;
use resort ;

drop database if exists case_study_JSPS_ervlet;
create database case_study_JSPS_ervlet;
use case_study_JSPS_ervlet;

create table employee(
	employee_id int auto_increment,
    employee_name  varchar(45),
    employee_birthday date,
    employee_id_card  varchar(45),
    employee_salary double,
    employee_phone varchar(45),
    employee_email varchar(45),
    employee_address varchar(45),
    position_id int,
    education_degree_id int,
    division_id int,
    username varchar(45),
    PRIMARY KEY (employee_id)
);

create table customer(
	customer_id int primary key ,
    customer_type_id int,
    customer_name varchar(45),
    customer_birthday date,
    customer_gender boolean,
    customer_id_card varchar(45),
    customer_phone varchar(45),
    customer_email varchar(45),
    customer_address varchar(45)
);

create table positions(
	position_id int primary key auto_increment,
    position_name varchar(45)
);

create table education_degree(
	education_degree_id int primary key auto_increment,
    education_degree_name varchar(45)
);

create table division(
	division_id int primary key auto_increment,
    division_name varchar(45)
);

create table customer_type(
	customer_type_id int primary key auto_increment,
    customer_type_name varchar(45)
);

create table user(
	username varchar(255) primary key,
    password varchar(255)
);

create table role(
	role_id int primary key auto_increment,
    role_name varchar(45)
);

create table user_role(
	role_id int ,
    username varchar(255)
    );

create table contract(
	contract_id int primary key auto_increment,
    contract_start_date datetime,
    contract_end_date datetime,
    contract_deposit double,
    contract_total_money double,
    employee_id int,
    customer_id int,
    service_id varchar(50)
);

create table service(
	service_id varchar(50) primary key ,
    service_name varchar(45),
    service_area int,
    service_cost double,
    service_max_people int,
    rent_type_id int,
    service_type_id int,
    standard_room varchar(45),
    description_orther_convenience varchar(45),
    pool_area double,
    number_of_floor int
);

create table service_type(
	service_type_id int primary key auto_increment,
    service_type_name varchar(45)
);

create table rent_type(
	rent_type_id int primary key auto_increment,
    rent_type_name varchar(45),
    rent_type_cost double
);

create table contract_details(
	contract_details_id int primary key auto_increment,
    contract_id int,
    attach_service_id int,
    quality int
);

create table attach_service(
	attach_service_id int primary key auto_increment,
    attach_service_name varchar(45),
    attach_service_cost double,
    attach_service_unit int,
    attach_service_status varchar(45)
);

ALTER TABLE employee
ADD CONSTRAINT FK_position_id_employee
FOREIGN KEY (position_id) REFERENCES positions(position_id),
ADD CONSTRAINT FK_education_degree_id_employee
FOREIGN KEY (education_degree_id) REFERENCES education_degree(education_degree_id),
ADD CONSTRAINT FK_division_id_employee
FOREIGN KEY (division_id) REFERENCES division(division_id),
ADD CONSTRAINT FK_username_employee
FOREIGN KEY (username) REFERENCES user(username);


ALTER TABLE customer
ADD CONSTRAINT FK_customer_type_id_customer
FOREIGN KEY (customer_type_id) REFERENCES customer_type(customer_type_id);

ALTER TABLE user_role
ADD CONSTRAINT FK_role_id_user_role
FOREIGN KEY (role_id) REFERENCES role(role_id),
ADD CONSTRAINT FK_username_user_role
FOREIGN KEY (username) REFERENCES user(username);

ALTER TABLE contract
ADD CONSTRAINT FK_employee_id_contract
FOREIGN KEY (employee_id) REFERENCES employee(employee_id),
ADD CONSTRAINT FK_customer_id_contract
FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
ADD CONSTRAINT FK_service_id_contract
FOREIGN KEY (service_id) REFERENCES service(service_id);

ALTER TABLE service
ADD CONSTRAINT FK_rent_type_id_service
FOREIGN KEY (rent_type_id) REFERENCES rent_type(rent_type_id),
ADD CONSTRAINT FK_service_type_id_service
FOREIGN KEY (service_type_id) REFERENCES service_type(service_type_id);
