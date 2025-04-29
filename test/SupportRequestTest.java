import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SupportRequestTest {
    @Test
    void testSupportRequestObjectCreation() {
        SupportRequest request = new SupportRequest();
        assertNotNull(request);
    }
}
