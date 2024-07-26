drop database if exists Insurance;

create database insurance;

use insurance;

create table Insurance_Details
(
   InsuranceID INT PRIMARY KEY AUTO_INCREMENT,
   CompanyName varchar(30),
   PolicyName varchar(100),
   PremiumAmount numeric(9,2),
   Paymode ENUM('MONTHLY','QUARTERLY','HALFYEARLY','YEARLY','ALL'),
   launchedOn date,
   expiresOn date,
   coverageAmount numeric(11,2),
   status ENUM('ACTIVE','INACTIVE')
);

Create Table Customer
(
    CustomerId INT AUTO_INCREMENT,
    CustomerName varchar(30),
    DateOfBirth date,
    PMH varchar(300),
    Surgery ENUM('YES','NO'),
    MobileNo varchar(30),
    Email varchar(30)
);
