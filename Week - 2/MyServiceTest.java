import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

public class MyServiceTest {

    // --- Interface to be mocked ---
    interface ExternalApi {
        String getData();
    }

    // --- Class that depends on ExternalApi ---
    class MyService {
        private ExternalApi api;

        public MyService(ExternalApi api) {
            this.api = api;
        }

        public String fetchData() {
            return api.getData();
        }
    }

    // --- Test using Mockito for mocking and stubbing ---
    @Test
    public void testExternalApi() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }
}
