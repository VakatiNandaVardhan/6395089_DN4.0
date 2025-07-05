<<<<<<< HEAD
-- Scenario 1: Apply Discount to Loan Interest Rates for Customers Above 60
BEGIN
  FOR rec IN (SELECT CustomerID, InterestRate FROM Loans JOIN Customers USING(CustomerID) WHERE (SYSDATE - DOB)/365 > 60) LOOP
    UPDATE Loans SET InterestRate = InterestRate - 1 WHERE CustomerID = rec.CustomerID;
  END LOOP;
  COMMIT;
END;
/

-- Scenario 2: Promote Customers to VIP Status Based on Balance
BEGIN
  FOR rec IN (SELECT CustomerID FROM Customers WHERE Balance > 10000) LOOP
    UPDATE Customers SET IsVIP = TRUE WHERE CustomerID = rec.CustomerID;
  END LOOP;
  COMMIT;
END;
/

-- Scenario 3: Send Reminders for Loans Due in Next 30 Days
BEGIN
  FOR rec IN (SELECT CustomerID, LoanID FROM Loans WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || rec.LoanID || ' for Customer ' || rec.CustomerID || ' is due soon.');
  END LOOP;
END;
/
=======
-- Scenario 1: Apply Discount to Loan Interest Rates for Customers Above 60
BEGIN
  FOR rec IN (SELECT CustomerID, InterestRate FROM Loans JOIN Customers USING(CustomerID) WHERE (SYSDATE - DOB)/365 > 60) LOOP
    UPDATE Loans SET InterestRate = InterestRate - 1 WHERE CustomerID = rec.CustomerID;
  END LOOP;
  COMMIT;
END;
/

-- Scenario 2: Promote Customers to VIP Status Based on Balance
BEGIN
  FOR rec IN (SELECT CustomerID FROM Customers WHERE Balance > 10000) LOOP
    UPDATE Customers SET IsVIP = TRUE WHERE CustomerID = rec.CustomerID;
  END LOOP;
  COMMIT;
END;
/

-- Scenario 3: Send Reminders for Loans Due in Next 30 Days
BEGIN
  FOR rec IN (SELECT CustomerID, LoanID FROM Loans WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || rec.LoanID || ' for Customer ' || rec.CustomerID || ' is due soon.');
  END LOOP;
END;
/
>>>>>>> b7746a9255ed925a349be5a919b1f618bac055ef
