import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SupportRequestTest {
    @Test
    void testSupportRequestFields() {
        SupportRequest request = new SupportRequest();
        request.setSupportID("S001");
        request.setIssueDescription("Login issue");
        request.setDateSubmitted("2025-04-28");

        assertEquals("S001", request.getSupportID());
        assertEquals("Login issue", request.getIssueDescription());
        assertEquals("2025-04-28", request.getDateSubmitted());
    }
}
