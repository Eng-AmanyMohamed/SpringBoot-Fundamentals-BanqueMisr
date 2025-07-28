package com.example;
import org.springframework.stereotype.Component;
  @Component
public class Printer {
    public void print(String msg)
    {
        System.out.println(msg);
    }
}
