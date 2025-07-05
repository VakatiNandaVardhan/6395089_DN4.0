<<<<<<< HEAD
import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    // --- Methods to be tested ---

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public String getNullString() {
        return null;
    }

    public String getNonNullString() {
        return "JUnit";
    }

    // --- JUnit Test Methods using assertions ---

    @Test
    public void testAssertEquals() {
        assertEquals("Addition should be correct", 10, add(4, 6));
    }

    @Test
    public void testAssertTrue() {
        assertTrue("Should return true for positive number", isPositive(5));
    }

    @Test
    public void testAssertFalse() {
        assertFalse("Should return false for negative number", isPositive(-1));
    }

    @Test
    public void testAssertNull() {
        assertNull("Should return null", getNullString());
    }

    @Test
    public void testAssertNotNull() {
        assertNotNull("Should return non-null", getNonNullString());
    }
}
=======
import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    // --- Methods to be tested ---

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public String getNullString() {
        return null;
    }

    public String getNonNullString() {
        return "JUnit";
    }

    // --- JUnit Test Methods using assertions ---

    @Test
    public void testAssertEquals() {
        assertEquals("Addition should be correct", 10, add(4, 6));
    }

    @Test
    public void testAssertTrue() {
        assertTrue("Should return true for positive number", isPositive(5));
    }

    @Test
    public void testAssertFalse() {
        assertFalse("Should return false for negative number", isPositive(-1));
    }

    @Test
    public void testAssertNull() {
        assertNull("Should return null", getNullString());
    }

    @Test
    public void testAssertNotNull() {
        assertNotNull("Should return non-null", getNonNullString());
    }
}
>>>>>>> b7746a9255ed925a349be5a919b1f618bac055ef
