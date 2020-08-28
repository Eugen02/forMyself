package for_myself_testing.GOF_patterns.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat,"Admin");
        User user = new SimpleUser(chat,"User 1");
        User user1 = new SimpleUser(chat,"User 2");

        chat.setAdmin(admin);
        chat.addUserToChar(user);
        chat.addUserToChar(user1);
        user.sendMessage("ASDASDASD");
        admin.sendMessage("ASasdasdasdasDASDASD");

    }
}
