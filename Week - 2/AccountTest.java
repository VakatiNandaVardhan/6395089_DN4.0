import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {

    private Account account;

    // --- Class to be tested ---
    public class Account {
        private String holderName;
        private int balance;

        public Account(String holderName, int balance) {
            this.holderName = holderName;
            this.balance = balance;
        }

        public void deposit(int amount) {
            balance += amount;
        }

        public void withdraw(int amount) {
            balance -= amount;
        }

        public int getBalance() {
            return balance;
        }
    }

    // --- Setup before each test ---
    @Before
    public void setUp() {
        account = new Account("Nanda", 100);
    }

    // --- Teardown after each test ---
    @After
    public void tearDown() {
        account = null;
    }

    // --- Test Methods using Arrange-Act-Assert (AAA) pattern ---

    @Test
    public void testDeposit() {
        // Arrange done in setUp()

        // Act
        account.deposit(50);

        // Assert
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        // Arrange done in setUp()

        // Act
        account.withdraw(30);

        // Assert
        assertEquals(70, account.getBalance());
    }

    @Test
    public void testMultipleOperations() {
        // Arrange done in setUp()

        // Act
        account.deposit(100);
        account.withdraw(40);

        // Assert
        assertEquals(160, account.getBalance());
    }
}
