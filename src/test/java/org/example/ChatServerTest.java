package org.example;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ChatServerTest {
    @Test
    public void registerUserTest() {
        ChatServer server = new ChatServer();
        User user = new User("Han", server);
        server.registerUser(user);
        assertTrue(server.registeredUsers.contains(user));
    }

    @Test
    public void unregisterUserTest() {
        ChatServer server = new ChatServer();
        User user1 = new User("Han", server);
        User user2 = new User("Sean", server);
        User user3 = new User("Gio", server);
        server.registerUser(user1);
        server.registerUser(user2);
        server.registerUser(user3);
        server.unregisterUser(user1);
        assertTrue(!server.registeredUsers.contains(user1));
    }
}