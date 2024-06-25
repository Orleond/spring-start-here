CREATE TABLE purchase (
    id SERIAL PRIMARY KEY,
    product VARCHAR(50) NOT NULL ,
    price DECIMAL(8, 2) NOT NULL
);