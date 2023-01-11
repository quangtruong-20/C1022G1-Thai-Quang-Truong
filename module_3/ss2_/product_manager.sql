create database product_manager;

CREATE TABLE customer (
    c_id INT PRIMARY KEY auto_increment,
    c_name VARCHAR(45),
    c_age INT
);
CREATE TABLE order1 (
    o_id INT PRIMARY KEY auto_increment,
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
        REFERENCES order1 (o_id),
    FOREIGN KEY (p_id)
        REFERENCES product (p_id),
    od_qty INT
);
CREATE TABLE product (
    p_id INT PRIMARY KEY,
    p_name VARCHAR(45),
    p_price INT
);