package financialapp;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void testAccountWithMockUser() {
        User mockUser = mock(User.class);
        when(mockUser.getName()).thenReturn("Sai Teja");

        Account account = new Account();
        account.setUser(mockUser);

        assertEquals("Sai Teja", account.getUser().getName());
    }
}
