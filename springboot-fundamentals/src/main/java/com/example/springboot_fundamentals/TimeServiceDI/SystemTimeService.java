package com.example.springboot_fundamentals.TimeServiceDI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
@Service
@Primary
public class SystemTimeService implements TimeService{
    @Override
    public String getTime() {
        return "System Time: "+LocalTime.now().toString();
    }
}
