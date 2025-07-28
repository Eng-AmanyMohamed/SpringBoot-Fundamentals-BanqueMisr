package main.java.di;

public class UserService {
    private Printer printer;

    // Constructor Injection
    public UserService(Printer printer) {
        this.printer = printer;
    }

    // Setter Injection
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void sendMessage() {
        printer.print("Hello from UserService ");
    }
}
