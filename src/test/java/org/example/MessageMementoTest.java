package org.example;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessageMementoTest {
    @Test
    public void testMessageMementoConstructor() {
        ChatHistory chatHistory = new ChatHistory();
        User sender = new User("Sean", new ChatServer());
        User recipient = new User("Gio", new ChatServer());
        Message message = new Message(sender, recipient, "Hey!");
        chatHistory.addMessage(message);
        MessageMemento memento = new MessageMemento(chatHistory);

        assertEquals("Hey!", memento.getBackUp().getMessages().get(0).getMessage());
    }
}