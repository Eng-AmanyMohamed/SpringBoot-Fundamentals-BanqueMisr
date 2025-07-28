package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private Printer printer;
    @Autowired
    public UserService(Printer printer)
    {
        this.printer = printer;
    }
    public void sendMessage(){
        printer.print("Hello from Spring UserService");
    }
}
