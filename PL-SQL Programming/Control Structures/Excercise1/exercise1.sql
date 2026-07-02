-- Exercise 1 : Control Structures
-- Author : Abhyanand Sharma

-- CREATE TABLES


CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    DOB DATE,
    Balance NUMBER,
    IsVIP VARCHAR2(5)
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER,
    DueDate DATE,
    FOREIGN KEY (CustomerID)
    REFERENCES Customers(CustomerID)
);

-- INSERT SAMPLE DATA

INSERT INTO Customers
VALUES (1,'Rahul',DATE '1960-05-10',15000,'FALSE');

INSERT INTO Customers
VALUES (2,'Priya',DATE '1995-08-20',9000,'FALSE');

INSERT INTO Customers
VALUES (3,'Amit',DATE '1955-03-12',25000,'FALSE');

INSERT INTO Loans
VALUES (101,1,9.5,SYSDATE+20);

INSERT INTO Loans
VALUES (102,2,10.0,SYSDATE+40);

INSERT INTO Loans
VALUES (103,3,8.5,SYSDATE+10);

COMMIT;

-- DISPLAY INITIAL DATA

SELECT * FROM Customers;

SELECT * FROM Loans;

-- SCENARIO 1
-- Apply 1% Discount on Loan Interest

DECLARE

    CURSOR cust_cursor IS
        SELECT c.CustomerID,
               c.DOB,
               l.LoanID,
               l.InterestRate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID=l.CustomerID;

    v_age NUMBER;

BEGIN

    FOR rec IN cust_cursor LOOP

        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE,rec.DOB)/12);

        IF v_age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;

            DBMS_OUTPUT.PUT_LINE(
                'Updated Loan : '||rec.LoanID
            );

        END IF;

    END LOOP;

    COMMIT;

END;
/

-- VERIFY SCENARIO 1

SELECT * FROM Loans;

-- SCENARIO 2
-- Promote Customers to VIP

BEGIN

FOR rec IN
(
SELECT CustomerID,
       Balance
FROM Customers
)

LOOP

    IF rec.Balance > 10000 THEN

        UPDATE Customers
        SET IsVIP='TRUE'
        WHERE CustomerID=rec.CustomerID;

        DBMS_OUTPUT.PUT_LINE(
            'VIP Customer : '||
            rec.CustomerID
        );

    END IF;

END LOOP;

COMMIT;

END;
/


-- VERIFY SCENARIO 2

SELECT * FROM Customers;

-- SCENARIO 3
-- Loan Reminder

BEGIN

FOR rec IN
(
SELECT c.Name,
       l.LoanID,
       l.DueDate
FROM Customers c
JOIN Loans l
ON c.CustomerID=l.CustomerID
WHERE l.DueDate BETWEEN SYSDATE
AND SYSDATE+30
)

LOOP

DBMS_OUTPUT.PUT_LINE(
'Reminder : Dear '||
rec.Name||
', Loan '||
rec.LoanID||
' is due on '||
TO_CHAR(rec.DueDate,'DD-MON-YYYY')
);

END LOOP;

END;
/

-- FINAL OUTPUT

SELECT * FROM Customers;

SELECT * FROM Loans;