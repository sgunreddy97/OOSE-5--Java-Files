import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AccountTest {
    @Test
    void testAccountObjectCreation() {
        Account account = new Account();
        assertNotNull(account);
    }
}
