package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherClass
{
    @GetMapping("/gridd")
    public int getGridCount()
    {
        return 20;
    }
}
