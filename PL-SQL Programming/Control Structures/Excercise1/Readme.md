# Exercise 1 - Control Structures in PL/SQL

## Objective

This exercise demonstrates the use of **PL/SQL control structures**, including:

- Cursors
- FOR loops
- IF statements
- UPDATE statements
- COMMIT
- DBMS_OUTPUT.PUT_LINE

The exercise is based on a banking management scenario.

---

## Scenarios

### Scenario 1 – Loan Interest Discount

The bank wants to provide a **1% discount** on loan interest rates for customers who are **above 60 years of age**.

**Operations Performed**
- Fetch customer and loan details using a cursor.
- Calculate customer age.
- Check if age is greater than 60.
- Reduce the loan interest rate by 1%.
- Display the updated loan information.

---

### Scenario 2 – VIP Customer Promotion

Customers having an account balance greater than **10,000** are promoted to **VIP** status.

**Operations Performed**
- Iterate through all customers.
- Check account balance.
- Update the `IsVIP` column.
- Display promoted customers.

---

### Scenario 3 – Loan Due Reminder

The bank sends reminders to customers whose loan due date falls within the next **30 days**.

**Operations Performed**
- Retrieve loans due within 30 days.
- Display reminder messages using `DBMS_OUTPUT.PUT_LINE`.

---

## Database Tables

### Customers

| Column | Data Type |
|---------|-----------|
| CustomerID | NUMBER |
| Name | VARCHAR2(100) |
| DOB | DATE |
| Balance | NUMBER |
| IsVIP | VARCHAR2(5) |

### Loans

| Column | Data Type |
|---------|-----------|
| LoanID | NUMBER |
| CustomerID | NUMBER |
| InterestRate | NUMBER |
| DueDate | DATE |

---

## Software Used

- Oracle Live SQL
- Oracle PL/SQL

---

## How to Run

1. Open Oracle Live SQL.
2. Create the tables.
3. Insert the sample data.
4. Execute each PL/SQL block.
5. Verify the results using the provided `SELECT` queries.

---

## Learning Outcomes

After completing this exercise, you will understand:

- PL/SQL blocks
- Cursors
- FOR loops
- IF conditions
- UPDATE statements
- COMMIT
- DBMS_OUTPUT
- Basic database manipulation using PL/SQL