-- drop database if exists hospitaldb;

-- create database hospitaldb;

use hospitaldb;

create Table ConsultionBilling
(
   ConsultionID INT PRIMARY KEY AUTO_INCREMENT,
   AppointmentID INT,
   PatientID INT,
   STATUS ENUM('VISIT','ADMIT'),
   FeeAmount numeric(9,2),
   BillingDate Date,
   PaymentStatus ENUM('PENDING','PAID'),
   Comments varchar(200)
);

Create Table RoomDetails
(
    RoomId INT PRIMARY KEY AUTO_INCREMENT,
    RoomType ENUM('THREE','TWO','DELUX','SUITE'),
    RoomFare Numeric(9,2),
    RoomStatus ENUM('OCCUPIED','VACANT')
);

Create TABLE AdmitDetails
(
     AdmitID INT PRIMARY KEY AUTO_INCREMENT,
     RoomID INT,
     PatientID INT,
     AppointmentID INT,
     StartDate DATE,
     EndDate DATE,
     NoOfDays INT,
     BillingAmount numeric(9,2),
     status ENUM('PAID','PENDING'),
     comments varchar(100)
);