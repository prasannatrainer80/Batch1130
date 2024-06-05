drop database if exists inventory;

create database inventory;

use inventory;

create table Stock
(
   StockID varchar(30)  primary key,
   StockName varchar(30),
   Quantity int,
   price numeric(9,2)
);
-- StockId to auto_increment as S001, S002, S003 etc...



Create  table Orders
(
   OrderId int auto_increment  primary key,
   StockID varchar(30)
    references Stock(StockID),
   QtyOrd int,
   BillAmount numeric(9,2)
);
   
Create Table Amount
(
  Gamt numeric(9,2)
);
insert into Amount values(0)