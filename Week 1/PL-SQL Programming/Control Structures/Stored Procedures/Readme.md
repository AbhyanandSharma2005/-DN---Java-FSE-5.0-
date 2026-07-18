# Exercise 3 - Stored Procedures in PL/SQL

## Objective

This exercise demonstrates the implementation of **Stored Procedures** in PL/SQL for a banking management system.

The exercise covers:

- Creating stored procedures
- Using parameters
- Performing UPDATE operations
- Conditional statements
- Transaction management (COMMIT / ROLLBACK)

---

## Scenario 1 – Process Monthly Interest

The bank applies **1% monthly interest** to all savings accounts.

### Procedure
`ProcessMonthlyInterest`

### Operations Performed

- Retrieves all savings accounts.
- Calculates 1% interest.
- Updates account balance.
- Displays the updated account information.

---

## Scenario 2 – Employee Bonus

Employees receive bonuses based on department performance.

### Procedure
`UpdateEmployeeBonus`

### Parameters

- Department ID
- Bonus Percentage

### Operations Performed

- Finds employees belonging to the specified department.
- Increases their salary by the given percentage.
- Updates employee records.

---

## Scenario 3 – Fund Transfer

Customers can transfer money between accounts.

### Procedure
`TransferFunds`

### Parameters

- Source Account Number
- Destination Account Number
- Transfer Amount

### Operations Performed

- Checks source account balance.
- Verifies sufficient funds.
- Deducts amount from source account.
- Adds amount to destination account.
- Commits transaction.
- Displays success or failure message.

---

## Database Tables

### Accounts

| Column | Data Type |
|---------|-----------|
| AccountID | NUMBER |
| CustomerName | VARCHAR2(100) |
| AccountType | VARCHAR2(20) |
| Balance | NUMBER |

---

### Employees

| Column | Data Type |
|---------|-----------|
| EmployeeID | NUMBER |
| EmployeeName | VARCHAR2(100) |
| DepartmentID | NUMBER |
| Salary | NUMBER |

---

## Software Used

- Oracle Live SQL
- Oracle PL/SQL

---

## Learning Outcomes

After completing this exercise, you will understand:

- Stored Procedures
- Procedure Parameters
- UPDATE Statements
- Transaction Management
- Conditional Logic
- Exception Handling