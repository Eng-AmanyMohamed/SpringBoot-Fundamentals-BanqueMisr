package com.example.springboot_fundamentals.TimeServiceDI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
    private final TimeService timeService;

    public TimeController(@Qualifier("mock") TimeService timeService)
    {
        this.timeService =timeService;
    }

    @GetMapping("/time")
    public String time() {
        return timeService.getTime();
    }
}
