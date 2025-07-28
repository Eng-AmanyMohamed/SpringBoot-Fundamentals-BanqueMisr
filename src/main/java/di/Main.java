package main.java.di;

public class Main {
    public static void main(String[] args) {
        // Constructor Injection
        Printer printer = new Printer();
        UserService user1 = new UserService(printer);
        user1.sendMessage();

        // Setter Injection
        UserService user2 = new UserService(null);
        user2.setPrinter(printer);
        user2.sendMessage();
    }
}
