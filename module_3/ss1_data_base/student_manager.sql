create database student_manager;
use student_manager;
create table class (
id int,
name varchar(50)
);
insert into class (id,name) values (1,'c1022g1');
select*from class;

create table teacher (
id int,
name varchar(50),
age int,
country varchar(50)
);
insert into teacher (id,name,age,country) values (2,'chanh',40,'Việt Nam');
select * from teacher;
