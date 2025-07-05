import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

public class VerifyInteractionTest {

    // --- Interface to be mocked ---
    interface ExternalApi {
        String getData();
    }

    // --- Class that uses the external API ---
    class MyService {
        private ExternalApi api;

        public MyService(ExternalApi api) {
            this.api = api;
        }

        public void fetchData() {
            api.getData(); // interaction we want to verify
        }
    }

    // --- Test to verify interaction happened ---
    @Test
    public void testVerifyInteraction() {
        // Arrange
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        // Act
        service.fetchData();

        // Assert: check if getData() was called
        verify(mockApi).getData();
    }
}
