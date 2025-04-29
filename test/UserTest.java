import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void testUserObjectCreation() {
        User user = new User();
        assertNotNull(user);
    }
}
