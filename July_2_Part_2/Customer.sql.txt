drop database if exists testdb;

create database testdb;

use testdb;

create table Customer
(
	custId int primary key auto_increment,
    custName varchar(30),
	custUserName varchar(30),
    custPassword varchar(100),
    custEmail varchar(30),
    custPhoneNo varchar(30),
    custStatus INT
);

Create Table Otp 
(
   otpId int primary key auto_increment,
   custId INT REFERENCES customer(custId),
   otpCode varchar(30),
   otpPurpose varchar(30),
   otpstatus varchar(30) default 'ACTIVE'
);