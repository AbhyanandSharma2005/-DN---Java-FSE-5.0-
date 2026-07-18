-- Exercise 3 : Stored Procedures
-- Author : Abhyanand Sharma

-- CREATE TABLE : Accounts

CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(100),
    AccountType VARCHAR2(20),
    Balance NUMBER
);

-- CREATE TABLE : Employees

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    EmployeeName VARCHAR2(100),
    DepartmentID NUMBER,
    Salary NUMBER
);

-- INSERT SAMPLE DATA

INSERT INTO Accounts VALUES
(101,'Rahul','Savings',20000);

INSERT INTO Accounts VALUES
(102,'Priya','Savings',15000);

INSERT INTO Accounts VALUES
(103,'Amit','Current',30000);

INSERT INTO Accounts VALUES
(104,'Sneha','Savings',10000);

INSERT INTO Employees VALUES
(1,'Raj',10,50000);

INSERT INTO Employees VALUES
(2,'Aman',20,60000);

INSERT INTO Employees VALUES
(3,'Priya',10,45000);

INSERT INTO Employees VALUES
(4,'Neha',30,70000);

COMMIT;

-- DISPLAY INITIAL DATA


SELECT * FROM Accounts;

SELECT * FROM Employees;

-- SCENARIO 1
-- Process Monthly Interest

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN

    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType='Savings';

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Monthly interest processed successfully.');

END;
/

-- EXECUTE PROCEDURE

BEGIN
    ProcessMonthlyInterest;
END;
/

-- VERIFY

SELECT * FROM Accounts;

-- SCENARIO 2
-- Update Employee Bonus

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(

    p_DepartmentID NUMBER,
    p_BonusPercent NUMBER

)

IS
BEGIN

    UPDATE Employees
    SET Salary = Salary + (Salary * p_BonusPercent / 100)
    WHERE DepartmentID = p_DepartmentID;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Employee bonus updated.');

END;
/

-- EXECUTE PROCEDURE

BEGIN

    UpdateEmployeeBonus(10,10);

END;
/

-- VERIFY

SELECT * FROM Employees;

-- SCENARIO 3
-- Transfer Funds

CREATE OR REPLACE PROCEDURE TransferFunds(

    p_SourceAccount NUMBER,
    p_TargetAccount NUMBER,
    p_Amount NUMBER

)

IS

    v_balance NUMBER;

BEGIN

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_SourceAccount;

    IF v_balance >= p_Amount THEN

        UPDATE Accounts
        SET Balance = Balance - p_Amount
        WHERE AccountID = p_SourceAccount;

        UPDATE Accounts
        SET Balance = Balance + p_Amount
        WHERE AccountID = p_TargetAccount;

        COMMIT;

        DBMS_OUTPUT.PUT_LINE('Transfer Successful.');

    ELSE

        DBMS_OUTPUT.PUT_LINE('Insufficient Balance.');

    END IF;

END;
/

-- EXECUTE PROCEDURE

BEGIN

    TransferFunds(101,102,5000);

END;
/

-- VERIFY

SELECT * FROM Accounts;