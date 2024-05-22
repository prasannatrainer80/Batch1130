drop database if exists db225;

create database db225;

use db225;

drop table if exists restaurant;

create table restaurant
(
   restaurantId int primary key auto_increment,
   RestaurantName varchar(30),
   City varchar(30),
   State varchar(30),
   Rating varchar(10)
);

Insert into Restaurant(RestaurantName,City,State,Rating)
values('Mehfil','Hyderabad','TS','5.5'),
('Chutneys','Hyderabad','TS','4.5'),
('Swathi','Chennai','TN','5.6'),
('Dolphin','Vizag','AP','5.5'),
('Daspalla','Hyderabad','TS','5.2'),
('Swagath','Chennai','TN','5.6');

Create Table Menu
(
   MenuID INT Auto_Increment primary key,
   RestaurantID INT REFERENCES Restaurant(RestaurantID),
   ItemName varchar(30),
   Price numeric(9,2)
);

Insert into Menu(RestaurantId,ItemName,Price)
values(1,'Biryani',664),(1,'Paneer Butter Masala',633),
(1,'Malai Kofta',522),(2,'Rajma',525),
(2,'Butter Nan',45),(3,'French Fries',155),
(3,'Noodles',52),(3,'Chicken Biryani',676);

Create Table Customer
(
   CustomerId INT Primary Key auto_increment,
   FirstName varchar(30),
   LastName varchar(30),
   CustomerUserName varchar(30) unique,
   CustomerPassword varchar(100),
   CustomerEmail varchar(40)
);

Insert into Customer(FirstName, LastName,CustomerUserName,CustomerPassword,CustomerEmail) 
values('Akhil','Kumar','Akhil','Kumar','akhil@gmail.com'),
('Ramu','Badugu','Ram107','Ram@117','Ram@gmail.com'),
('Bhuvaneshwar','Rao','bhuvan','jajula','bj@gmail.com'),
('Pavani','Y','Pavani114','Pavani@007','pavani@gmail.com');

Create Table Vendor
(
   VendorId INT Primary Key auto_increment,
   FirstName varchar(30),
   LastName varchar(30),
   VendorUserName varchar(30),
   VendorPassword varchar(100),
   VendorEmail varchar(30)
);

Insert into Vendor(FirstName,LastName,VendorUserName,VendorPassword,VendorEmail)
values('Smrithi','Salendri','Smriti111','cater@007','smrithi@gmail.com'),
('Aarifa','Saleem','aarif','chennai@123','aarifa@gmail.com'),
('Anukrithi','Bordia','Anu','bordia@155','anukrithi@gmail.com'),
('Ksheerabdhi','Vasanth','ksheera','vasantha114','ksheerabdhi@gmail.com');

Create Table Wallet
(
   walletId INT primary key auto_increment,
   CustomerID INT REFERENCES Customer(CustomerID),
   WalletType ENUM('PHONEPE','GPAY','NETBANKING','CREDITCARD'),
   WalletAmount numeric(9,2)
);

Insert into Wallet(CustomerID, WalletType, WalletAmount) values(1,'PHONEPE',55222),(1,'GPAY',22555),(1,'NETBANKING',5422),
(2,'CREDITCARD',55222),(2,'GPAY',54444),
(3,'PHONEPE',55223),(3,'NETBANKING',55222),(3,'GPAY',88221),(3,'CREDITCARD',52255),
(4,'PHONEPE',88222);

