import org.junit.Test;
import static org.junit.Assert.*;

public class SetupJUnitTest {

    // Just a dummy method to demonstrate setup
    public boolean isWorking() {
        return true;
    }

    @Test
    public void testIsWorking() {
        SetupJUnitTest obj = new SetupJUnitTest();
        assertTrue(obj.isWorking());
    }
}
