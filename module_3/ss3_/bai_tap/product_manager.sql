create database product_manager;
use product_manager;

CREATE TABLE customer (
    c_id INT PRIMARY KEY,
    c_name VARCHAR(45),
    c_age INT
);
CREATE TABLE product (
    p_id INT PRIMARY KEY,
    p_name VARCHAR(45),
    p_price INT
);
CREATE TABLE `order` (
    o_id INT PRIMARY KEY,
    c_id INT,
    o_date DATE,
    o_total_price DOUBLE,
    FOREIGN KEY (c_id)
        REFERENCES customer (c_id)
);
CREATE TABLE order_detail (
    o_id INT,
    p_id INT,
    PRIMARY KEY (o_id , p_id),
    FOREIGN KEY (o_id)
        REFERENCES `order` (o_id),
    FOREIGN KEY (p_id)
        REFERENCES product (p_id),
    od_qty INT
);

insert into customer (c_id , c_name , c_age ) values ('1', 'Minh Quan', '10');
insert into customer (c_id , c_name , c_age ) values ('2', 'Ngoc Oanh', '20');
insert into customer (c_id , c_name , c_age ) values ('3', 'Hong Ha', '50');

insert into product (p_id, p_name, p_price) values ('1', 'May Giat', '3');
insert into product (p_id, p_name, p_price) values ('2', 'Tu Lanh', '5');
insert into product (p_id, p_name, p_price) values ('3', 'Dieu Hoa', '7');
insert into product (p_id, p_name, p_price) values ('4', 'Quat', '1');
insert into product (p_id, p_name, p_price) values ('5', 'Bep Dien', '2');

insert into order_detail (o_id, p_id, od_qty) values ('1', '1', '3');
insert into order_detail (o_id, p_id, od_qty) values ('1', '3', '7');
insert into order_detail (o_id, p_id, od_qty) values ('1', '4', '2');
insert into order_detail (o_id, p_id, od_qty) values ('2', '1', '1');
insert into order_detail (o_id, p_id, od_qty) values ('3', '1', '8');
insert into order_detail (o_id, p_id, od_qty) values ('2', '5', '4');
insert into order_detail (o_id, p_id, od_qty) values ('2', '3', '3');

insert into `order` (o_id, c_id, o_date, o_total_price) values (1, 1,'2006-3-21', Null);
insert into `order` (o_id, c_id, o_date, o_total_price) values ('2','2','2006-3-23', Null);
insert into `order` (o_id, c_id, o_date, o_total_price) values ('3','1','2006-3-16', Null);

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
SELECT 
    `order`.o_id, `order`.o_date, `order`.o_total_price
FROM
    `order`;
    --  hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua boi các khách hang
select customer.c_name,`order`.o_id,product.p_name
from customer join `order` on `order`.c_id = customer.c_id
join order_detail on `order`.o_id = order_detail.o_id
join product on order_detail.p_id = product.p_id;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select customer.c_name,`order`.o_id
from customer left join `order` on  customer.c_id =`order`.c_id
where `order`.o_id is null;

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của 
-- từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
select `order`.o_id, `order`.o_date, (select sum(order_detail.od_qty * product.p_price)
from order_detail 
join product on order_detail.p_id = product.p_id
where order_detail.o_id = `order`.o_id)as o_total_price
from `order` ;


