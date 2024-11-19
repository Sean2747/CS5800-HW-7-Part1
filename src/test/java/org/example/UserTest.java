package org.example;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    public void userTest() {
        ChatServer server = new ChatServer();
        User sender = new User("Han", server);
        User recipient = new User("Sean", server);

        assertEquals(sender.getName(), "Han");
        assertEquals(recipient.getName(), "Sean");
    }
}