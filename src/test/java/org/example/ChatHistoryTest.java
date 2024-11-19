package org.example;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChatHistoryTest {
    @Test
    public void addMessageTest() {
        ChatHistory chatHistory = new ChatHistory();
        User sender = new User("Sean", new ChatServer());
        User recipient = new User("Han", new ChatServer());
        Message message = new Message(sender, recipient, "I love you.");
        chatHistory.addMessage(message);

        assertEquals("I love you.", chatHistory.getMessages().get(0).getMessage());
    }

    @Test
    public void getLastSentTest() {
        ChatHistory chatHistory = new ChatHistory();
        User sender = new User("Gio", new ChatServer());
        User recipient = new User("Sean", new ChatServer());
        Message message = new Message(sender, recipient, "Let's go to a movie!");
        chatHistory.addMessage(message);

        assertEquals("Let's go to a movie!", chatHistory.getLastSent().getMessage());
    }
}