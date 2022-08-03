package com.example.springproject.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MultiThreadClass {

    @Autowired
    EmployeeNewChangesCheck employeeNewChangesCheck;

    @Autowired
    EmployeeCheckChangesImpl employeeCheckChanges;

    public void executeMultiThreading() {

        Thread thread = new Thread(employeeCheckChanges);
        thread.start();

        Thread thread1 = new Thread(employeeNewChangesCheck);
        thread1.start();

        log.info("Test completed!");
    }
}
