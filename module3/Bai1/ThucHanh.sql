DROP  DATABASE IF EXISTS mydatabase;
CREATE DATABASE IF NOT EXISTS mydatabase ;
USE mydatabase ;
CREATE TABLE sv(
  id int primary key,
  name varchar(255),
  class int 
);
SELECT * FROM sv;