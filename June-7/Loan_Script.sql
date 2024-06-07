use sonixbank;

Create Table Loans
(
   LoanAccountId INT Primary Key,
   AccountNo INT REFERENCES Accounts(AccountNo),
   LoanSanctionAmount numeric(9,2),
   PayMode ENUM('MONTHLY','QUARTERLY'),
   periodInYears INT,
   installmentAmount numeric(9,2)
);

-- LoanAccountId to be started with 1000 
-- You need to geneate instalmentAmount based on loanSanctionAmount (vs) PeriodInYears

-- Example : if loan is 300000 and period id 3 years then 

-- 30000/36  -> 8334 is payment every month

-- if querteryly then its 25000 

-- that you need to generate
