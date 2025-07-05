-- Exercise 3: Stored Procedures

-- Scenario 1: Process Monthly Interest for Savings Accounts
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
  UPDATE Accounts
  SET Balance = Balance * 1.01
  WHERE AccountType = 'Savings';
  COMMIT;
END;
/

-- Scenario 2: Update Employee Bonus
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(dept VARCHAR2, bonus_percent NUMBER) AS
BEGIN
  UPDATE Employees
  SET Salary = Salary * (1 + bonus_percent/100)
  WHERE Department = dept;
  COMMIT;
END;
/

-- Scenario 3: Transfer Funds Between Accounts
CREATE OR REPLACE PROCEDURE TransferFunds(src_acc NUMBER, dest_acc NUMBER, amt NUMBER) AS
BEGIN
  UPDATE Accounts
  SET Balance = Balance - amt
  WHERE AccountID = src_acc AND Balance >= amt;
  IF SQL%ROWCOUNT = 0 THEN
    RAISE_APPLICATION_ERROR(-20003, 'Insufficient funds');
  END IF;
  UPDATE Accounts
  SET Balance = Balance + amt
  WHERE AccountID = dest_acc;
  COMMIT;
EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
