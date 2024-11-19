package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //initiation
        ChatServer serverOne = new ChatServer();
        User Sean = new User("Sean", serverOne);
        User Gio = new User("Gio", serverOne);
        User Han = new User("Han", serverOne);
        serverOne.registerUser(Sean);
        serverOne.registerUser(Gio);
        serverOne.registerUser(Han);
        List<User> gioAndHan = new ArrayList<>();
        gioAndHan.add(Han);
        gioAndHan.add(Gio);

        //sending and receiving messages, undo sent message and display chat history
        Sean.sendMessage(Han, "Hey, girl~");
        Han.sendMessage(Sean, "Hey, boy lol");
        Sean.sendMessage(gioAndHan, "Wanna go to a movie?");
        Han.sendMessage(Sean, "Sure. When?");
        Sean.sendMessage(Han, "May I come to your place tonight?");
        Sean.displayChatHistoryWith(Han);
        System.out.println();
        Sean.undoLastSent();
        System.out.println();
        Han.displayChatHistoryWith(Sean);
        System.out.println();

        //blocking a user and attempting to send messages to the blocker
        Gio.sendMessage(Sean, "Stop bothering me!");
        Gio.blockUser(Sean);
        Sean.sendMessage(Gio, "Bro?");
        Sean.sendMessage(Gio, "Oh, c'mon!");
        System.out.println();
        Sean.displayChatHistoryWith(Gio);
        System.out.println();
        Gio.displayChatHistoryWith(Sean);
    }
}