package org.example;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MessageTest {
    @Test
    public void messageTest() {
        ChatServer server = new ChatServer();
        User sender = new User("Han", server);
        User recipient = new User("Sean", server);
        String text = "I love you.";
        Message message = new Message(sender, recipient, text);

        assertEquals(sender, message.getSender());
        assertEquals(recipient, message.getRecipient());
        assertEquals(text, message.getMessage());
    }
}