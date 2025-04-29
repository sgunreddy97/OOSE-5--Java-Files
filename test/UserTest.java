package financialapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void testUserFields() {
        User user = new User();
        user.setUserID("U001");
        user.setName("Sai Teja");
        user.setEmail("sai@example.com");
        user.setPhone("9999999999");
        user.setLast4SSN("1234");
        user.setPassword("sai123");

        assertEquals("U001", user.getUserID());
        assertEquals("Sai Teja", user.getName());
        assertEquals("sai@example.com", user.getEmail());
    }
}
