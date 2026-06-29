SET SERVEROUTPUT ON;

BEGIN
    FOR rec IN (
        SELECT l.LoanID, l.InterestRate
        FROM Loans l
        JOIN Customers c
        ON l.CustomerID = c.CustomerID
        WHERE c.Age > 60
    )
    LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE LoanID = rec.LoanID;

        DBMS_OUTPUT.PUT_LINE(
            'Loan ID ' || rec.LoanID ||
            ' interest rate updated.'
        );
    END LOOP;

    COMMIT;
END;
/