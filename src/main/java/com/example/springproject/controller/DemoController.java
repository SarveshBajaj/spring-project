package com.example.springproject.controller;

import com.example.springproject.service.MultiThreadClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    MultiThreadClass multiThreadClass;

    @GetMapping("/testMultiThread")
    public String checkSingletonExample() {
        multiThreadClass.executeMultiThreading();
        return "Test Done bro!";
    }
}
