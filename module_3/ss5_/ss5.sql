create database ss5;
use ss5;

create table products (
id int primary key,
product_code int,
product_name varchar(50),
product_price int,
product_amount int ,
product_description varchar(50),
product_status varchar(50)

);

insert into products (id,product_code,product_name,product_price,product_amount,product_description,product_status)
values (1,23,'bia',23000,5,'huda','còn'),
(2,12,'bia',21000,0,'tiger','hết'),
(3,32,'bia',40000,10,'heniken','còn'),
(4,43,'bia',22000,0,'saigon','hết');
-- bước 3
CREATE UNIQUE INDEX index_unique ON products(product_code);
create index index_composite on products(product_name,product_price);

explain select * from products where product_code = 12;
explain select * from products where product_price = 21000;
-- bước 4
-- tạo view
create view view_products(codee,namee,price,statuss) as
select product_code,product_name,product_price,product_status from products;

select * from view_products;
-- sửa view
update view_products
set namee = 'bia vip'
where codee = 32;
-- xoa view
drop view view_products;

-- buoc 5
-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
create procedure findAllProducts()
begin
select * from products;
end //
delimiter ;
call findAllProducts();

-- Tạo store procedure sửa một sản phẩm mới theo id
delimiter //
create procedure updateProduct(id int,code int,name varchar(50),price int, amount int ,description varchar(50),status varchar(50))
begin
update products p
set 
    p.product_code = code,
    p.product_name = name,
    p.product_price =price,
    p.product_amount = amount,
    p.product_description = description,
    p.product_status = status
    where p.id = id
;
end
// delimiter ;

call updateProduct(3,14,'bia',50000,4,'corona','còn');
-- Tạo store procedure thêm một sản phẩm mới
delimiter //
create procedure addProduct (id int,code int,name varchar(50),price int, amount int ,description varchar(50),status varchar(50))
begin
insert into products (id,product_code,product_name,product_price,product_amount,product_description,product_status)
values (id,code,name,price,amount,description,status);
end
// delimiter ;
call addProduct(15,66,'bia',100000,5,'truong','hết');

-- Tạo store procedure xoá sản phẩm theo id
delimiter //
create procedure deleteProduct(id int)
begin
delete from products p where p.id = id; 
end
// delimiter ;
call deleteProduct(15);

