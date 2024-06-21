drop database if exists crimereport;
create database crimereport;

use crimereport;
-- CreatingVictims table
drop table if exists Victims;
CREATE TABLE Victims (
    VictimID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    DateOfBirth DATE,
    Gender Enum('Female','Male','Other'),
    PhoneNumber varchar(20) unique,
    Address varchar(20)
);

-- Creating Suspects table
drop table if exists Suspects;
CREATE TABLE Suspects (
    SuspectID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    DateOfBirth DATE,
    Gender Enum('Female','Male','other'),
    PhoneNumber varchar(20) unique,
    Address varchar(20)
);
-- Creating Law Enforcement Agencies table
drop table if exists LawEnforcementAgencies;
CREATE TABLE LawEnforcementAgencies (
    AgencyID INT PRIMARY KEY,
    AgencyName VARCHAR(100),
    Jurisdiction VARCHAR(100),
    PhoneNumber varchar(20) unique,
    Address varchar(20)
);

drop table if exists Incidents;
-- Creating Incidents table
CREATE TABLE Incidents (
    IncidentID INT PRIMARY KEY,
    IncidentType VARCHAR(100),
    IncidentDate DATE,
    Latitude DECIMAL(9, 6),
    Longitude DECIMAL(9, 6),
    Description  varchar(100),
    Status VARCHAR(50),
    VictimID INT, 
    SuspectID INT,
     
    FOREIGN KEY (VictimID) REFERENCES Victims(VictimID) on  update cascade,
    FOREIGN KEY (SuspectID) REFERENCES Suspects(SuspectID) on update cascade
  
);




-- Creating Officers table
drop table if exists Officers;
CREATE TABLE Officers (
    OfficerID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    BadgeNumber VARCHAR(20),
    Ranking VARCHAR(50),
    PhoneNumber varchar(20) unique,
    Address varchar(80),
    AgencyID INT,
    FOREIGN KEY (AgencyID) REFERENCES LawEnforcementAgencies(AgencyID) on delete cascade
);

-- Creating Evidence table
drop table if exists Evidence;
CREATE TABLE Evidence (
    EvidenceID INT PRIMARY KEY,
    Description  varchar(50),
    LocationFound VARCHAR(255),
    IncidentID INT,
    FOREIGN KEY (IncidentID) REFERENCES Incidents(IncidentID) on delete cascade
);


-- Creating Reports table
drop table if exists Reports;
CREATE TABLE Reports (
    ReportID INT PRIMARY KEY,
    IncidentID INT,
    ReportingOfficer INT,
    ReportDate DATE,
    ReportDetails varchar(50),
    Status VARCHAR(50),
    FOREIGN KEY (IncidentID) REFERENCES Incidents(IncidentID) on delete cascade,
    FOREIGN KEY (ReportingOfficer) REFERENCES Officers(OfficerID) on delete cascade
);











delete from suspects;
insert into suspects( suspectID,FirstName,LastName,DateOfBirth,Gender,PhoneNumber,Address)
values(1,'Sharleen','Chopra','2002-01-01','Female','8328223822','Kakinada'),
(2,'Neeraj','Chopra','2002-02-23','Male','7328223822','kolkata'),
(3,'Shashi','kapoor','1983-04-23','Male','6628223866','Bhopal'),
(4,'Shreya','Saran','1991-08-28','Female','7833662867','Hyderbad'),
(5,'Meera','Rajput','1983-01-18','Female','8955886899','Roorkee'),
(6,'Sriram','Chowdary','2002-11-30','Male','9956897899','Banglore'),
(7,'Srikanth','Modi','1964-05-11','Male','8956887789','Chennai'),
(8,'Narendra','Kuna','2002-12-24','Male','6956887889','Roorkee'),
(9,'Hari','Akkurada','2000-06-01','Female','7845678456','Baroda'),
(10,'Maneesha','Baggu','1992-07-17','Female','6789564444','Mumbai'),
(11,'Sagar','Simhadri','2002-02-22','Male','8938663966','Vishakhapatnam'),
(12,'Gayathri','Siginipalli','2004-07-29','Female','7766648849','Vijayawada'),
(13,'Nikhil','Chintha','2000-03-06','Male','8978665678','Roorkee'),
(14,'Shakhar','Chowdary','1964-04-25','Male','78976549898','Hyderbad'),
(15,'Sharukh','khan','1974-08-30','Male','9988667789','Mumbai');
select * from suspects;

delete  from victims;
insert into victims(VictimID,FirstName,LastName,DateOfBirth,Gender,PhoneNumber,Address)
values(16,'Praneetha','Krishnan','2002-03-06','Female','8673246789','Banglore'),
(17,'Abhishek','Agarwal','1993-05-11','Male','6765278978','Hyderbad'),
(18,'Sandhya','Jyostusula','1991-03-06','Female','7893135628','pune'),
(19,'Harika','Narayan','1999-09-09','Female','9966496290','Baroda'),
(20,'karthik','Rampa','2006-11-28','Male','6309695635','Ahemdabad'),
(21,'Jhon','thommas','1983-05-06','Male','8978226828','Mumbai'),
(22,'Elina','Dcruz','1991-05-28','Female','8978676828','Roorkee'),
(23,'Madhu','Madhan','1995-02-14','Male','6308695635','Vishakapatnam'),
(24,'Aditya','kashyap','1986-08-28','Male','87990015689','Madurai'),
(25,'Aruna','prakash','2002-11-06','Female','8799915689','Hyderbad'),
(26,'priya','Krishnan','2006-06-03','Female','6799115689','Banglore'),
(27,'Rachin','Raveendra','2000-03-31','Male','7993135628','pune'),
(28,'charan','Santhosh','2002-02-14','Male','8993135668','Roorkee'),
(29,'Pramod','kumar','2002-05-31','Male','7978228828','Baroda'),
(30,'Racha','Rajput','2002-03-06','Female','8993135778','Vishakapatnam');
select * from victims;

INSERT INTO LawEnforcementAgencies (AgencyID, AgencyName, Jurisdiction, PhoneNumber, Address) 
VALUES 
(31, 'Andhra Pradesh Police Department', 'Statewide', '9876543210', 'Andhra Pradesh'),
(32, 'Visakhapatnam City Police', 'Visakhapatnam City', '8765432109', 'Andhra Pradesh'),
(33, 'Vijayawada City Police', 'Vijayawada City', '7654321098', 'Andhra Pradesh'),
(34, 'Tirupati City Police', 'Tirupati City', '6543210987', 'Andhra Pradesh'),
(35, 'Guntur City Police', 'Guntur City', '5432109876', 'Andhra Pradesh'),
(36, 'Rajahmundry City Police', 'Rajahmundry City', '4321098765', 'Andhra Pradesh'),
(37, 'Nellore City Police', 'Nellore City', '3210987654', 'Andhra Pradesh'),
(38, 'Kurnool City Police', 'Kurnool City', '2109876543', 'Andhra Pradesh'),
(39, 'Anantapur City Police', 'Anantapur City', '1098765432', 'Andhra Pradesh'),
(40, 'Eluru City Police', 'Eluru City', '9876543021', 'Andhra Pradesh'),
(41, 'Kakinada City Police', 'Kakinada City', '8765432019', 'Andhra Pradesh'),
(42, 'Vizianagaram City Police', 'Vizianagaram City', '7654321987', 'Andhra Pradesh'),
(43, 'Ongole City Police', 'Ongole City', '6543219876', 'Andhra Pradesh'),
(44, 'Tenali City Police', 'Tenali City', '5432198765', 'Andhra Pradesh'),
(45, 'Srikakulam City Police', 'Srikakulam City', '4321987654', 'Andhra Pradesh');
select * from LawEnforcementAgencies;

INSERT INTO Incidents (IncidentID, IncidentType, IncidentDate, Latitude, Longitude, Description, Status, VictimID, SuspectID)
VALUES
    (46, 'Robbery', '2024-01-01', 40.7128, -74.0060, 'Robbery in Vijayawada market, cash stolen, suspect at large.', 'Open', 16, 1),
    (47, 'Homicide', '2024-03-05', 34.0522, -118.2437, 'Homicide in Visakhapatnam, victim identified, suspect arrested.', 'Closed', 17, 2),
    (48, 'Theft', '2024-04-10', 51.5074, -0.1278, 'Theft in Tirupati temple, stolen artifacts recovered, suspect apprehended.', 'Open', 18, 3),
    (49, 'Assault', '2024-04-15', 41.8781, -87.6298, 'Assault in Guntur mall, minor injuries reported, suspect detained.', 'Closed', 19, 4),
    (50, 'Burglary', '2024-04-20', 39.9526, -75.1652, 'Burglary in Kurnool residence, valuables stolen, suspect identified.', 'Closed', 20, 5),
    (51, 'Robbery', '2024-07-25', 33.4484, -112.0740, 'Robbery in Rajahmundry bank, cash and jewelry stolen, suspect on run.', 'Open', 21, 3),
    (52, 'Homicide', '2024-04-30', 37.7749, -122.4194, 'Homicide in Nellore alley, victim unknown, investigation ongoing.', 'Open', 22, 2),
    (53, 'Theft', '2024-05-05', 34.0522, -118.2437, 'Theft in Kakinada museum, stolen artifacts recovered, suspect in custody.', 'Closed', 23, 1),
    (54, 'Assault', '2024-05-10', 41.8781, -87.6298, 'Assault in Anantapur restaurant, victim hospitalized, suspect fled.', 'Open', 24, 5),
    (55, 'Burglary', '2024-05-15', 40.7128, -74.0060, 'Burglary in Eluru jewelry store, valuables missing, suspect at large.', 'Closed', 25, 2),
    (56, 'Robbery', '2024-05-20', 34.0522, -118.2437, 'Robbery in Vizianagaram market, cash and electronics stolen, suspect identified.', 'Open', 26, 3),
    (57, 'Homicide', '2024-08-25', 37.7749, -122.4194, 'Homicide in Ongole neighborhood, victim shot, suspect unknown.', 'Open', 27, 4),
    (58, 'Theft', '2024-08-30', 33.4484, -112.0740, 'Theft in Tenali supermarket, stolen goods recovered, suspect apprehended.', 'Closed', 28, 5),
    (59, 'Assault', '2024-06-05', 39.9526, -75.1652, 'Assault in Srikakulam park, minor injuries reported, suspect at large.', 'Open', 29, 1),
    (60, 'Burglary', '2024-06-10', 41.8781, -87.6298, 'Burglary in Kurnool pharmacy, drugs stolen, suspect identified.', 'Open', 30, 2);
select * from Incidents;




INSERT INTO Officers (OfficerID, FirstName, LastName, BadgeNumber, Ranking, PhoneNumber, Address, AgencyID)
VALUES
    (61, 'John', 'Doe', '12345', 63, '9876543210', '123 Main St, Visakhapatnam', 33),
    (62, 'Jane', 'Smith', '23456', 72, '8765432109', '456 Elm St, Vijayawada', 32),
    (63, 'Michael', 'Johnson', '34567', 51, '7654321098', '789 Oak St, Guntur', 33),
    (64, 'Emily', 'Brown', '45678', 70, '6543210987', '321 Pine St, Rajahmundry', 34),
    (65, 'David', 'Wilson', '56789', 85, '5432109876', '555 Cedar St, Tirupati', 35),
    (66, 'Sarah', 'Martinez', '67890', 73, '4321098765', '666 Pine St, Anantapur', 36),
    (67, 'Daniel', 'Anderson', '78901', 76, '3210987654', '777 Maple St, Eluru', 38),
    (68, 'Jessica', 'Taylor', '89012', 49, '2109876543', '888 Oak St, Kakinada', 38),
    (69, 'Christopher', 'Thomas', '90123', 80, '1098765432', '999 Walnut St, Vizianagaram', 39),
    (70, 'Amanda', 'Garcia', '01234', 94, '9876543021', '111 Elm St, Nellore', 40),
    (71, 'James', 'Martinez', '12345', 73, '8765432019', '222 Cedar St, Ongole', 42),
    (72, 'Linda', 'Rodriguez', '23456', 92, '7654321987', '333 Pine St, Tenali', 42),
    (73, 'Robert', 'Lee', '34567', 81, '6543219876', '444 Oak St, Srikakulam', 43),
    (74, 'Jennifer', 'Hernandez', '45678', 60, '5432198765', '555 Maple St, Kurnool', 45),
    (75, 'William', 'Gonzalez', '56789', 74, '4321987654', '666 Walnut St, Rajahmundry', 45);
  select * from Officers;  
  
  
  INSERT INTO Evidence (EvidenceID, Description, LocationFound, IncidentID)
VALUES
    (76, 'Weapon found at scene', 'Vijayawada market', 51),
    (77, 'Blood stains found', 'Visakhapatnam', 52),
    (78, 'Fingerprints found', 'Tirupati temple', 51),
    (79, 'Security camera footage', 'Guntur mall', 54),
    (80, 'Tool marks found', 'Kurnool residence', 55),
    (81, 'Security camera footage', 'Rajahmundry bank', 47),
    (82, 'Weapon found at scene', 'Nellore alley', 47),
    (83, 'Fingerprints found', 'Kakinada museum', 48),
    (84, 'Blood stains found', 'Anantapur restaurant', 50),
    (85, 'Tool marks found', 'Eluru jewelry store', 50),
    (86, 'Security camera footage', 'Vizianagaram market', 51),
    (87, 'Blood stains found', 'Ongole neighborhood', 52),
    (88, 'Fingerprints found', 'Tenali supermarket', 53),
    (89, 'Tool marks found', 'Srikakulam park', 55),
    (90, 'Security camera footage', 'Kurnool pharmacy', 55);
 select * from Evidence; 
 
 
 
INSERT INTO Reports (ReportID, IncidentID, ReportingOfficer, ReportDate, ReportDetails, Status) 
VALUES
    (91, 46, 61, '2024-04-02', 'Initial report filed', 'Draft'),
    (92, 47, 62, '2024-04-06', 'Investigation completed', 'Finalized'),
    (93, 48, 63, '2024-04-11', 'Evidence collected', 'Draft'),
    (94, 49, 64, '2024-04-16', 'Case closed', 'Finalized'),
    (95, 50, 65, '2024-04-21', 'Case reopened', 'Draft'),
    (96, 51, 66, '2024-04-26', 'Suspect identified', 'Draft'),
    (97, 52, 67, '2024-05-01', 'Investigation ongoing', 'Open'),
    (98, 53, 68, '2024-05-06', 'Suspect arrested', 'Finalized'),
    (99, 54, 69, '2024-05-11', 'Case reopened', 'Draft'),
    (100, 55, 70, '2024-05-16', 'Investigation completed', 'Finalized'),
    (101, 56, 71, '2024-05-21', 'Suspect identified', 'Draft'),
    (102, 57, 72, '2024-05-26', 'Investigation ongoing', 'Open'),
    (103, 58, 73, '2024-05-31', 'Suspect arrested', 'Finalized'),
    (104, 59, 74, '2024-06-06', 'Case reopened', 'Draft'),
    (105, 60, 75, '2024-06-11', 'Investigation ongoing', 'Open');

 select * from Reports;
