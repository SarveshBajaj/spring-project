package com.example.springproject.service;

import com.example.springproject.model.Address;
import com.example.springproject.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EmployeeNewChangesCheck implements Runnable {

    @Autowired
    Employee employee;

    @Override
    public void run() {
        employee.setAddress(Address.builder().address1("second").address2("value").build());
        log.info("Thread2 before timeout: " + employee.getAddress().toString());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("Thread2 after timeout: " + employee.getAddress().toString());
    }
}
