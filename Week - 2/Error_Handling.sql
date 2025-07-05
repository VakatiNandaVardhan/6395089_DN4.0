-- Scenario 1: Safe Fund Transfer with Exception Handling
CREATE OR REPLACE PROCEDURE SafeTransferFunds(src_acc NUMBER, dest_acc NUMBER, amt NUMBER) AS
BEGIN
  UPDATE Accounts SET Balance = Balance - amt WHERE AccountID = src_acc AND Balance >= amt;
  IF SQL%ROWCOUNT = 0 THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds');
  END IF;
  UPDATE Accounts SET Balance = Balance + amt WHERE AccountID = dest_acc;
  COMMIT;
EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/

-- Scenario 2: Update Salary with Error Handling
CREATE OR REPLACE PROCEDURE UpdateSalary(emp_id NUMBER, percent NUMBER) AS
BEGIN
  UPDATE Employees SET Salary = Salary * (1 + percent/100) WHERE EmployeeID = emp_id;
  IF SQL%ROWCOUNT = 0 THEN
    RAISE_APPLICATION_ERROR(-20002, 'Employee not found');
  END IF;
  COMMIT;
EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/

-- Scenario 3: Add New Customer with Duplicate Check
CREATE OR REPLACE PROCEDURE AddNewCustomer(cust_id NUMBER, name VARCHAR2, dob DATE, balance NUMBER) AS
BEGIN
  INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified) VALUES (cust_id, name, dob, balance, SYSDATE);
  COMMIT;
EXCEPTION
  WHEN DUP_VAL_ON_INDEX THEN
    DBMS_OUTPUT.PUT_LINE('Error: Customer with this ID already exists.');
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
