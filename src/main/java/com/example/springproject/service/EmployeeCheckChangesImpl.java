package com.example.springproject.service;

import com.example.springproject.model.Address;
import com.example.springproject.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmployeeCheckChangesImpl implements Runnable {

    @Autowired
    Employee employee;

    @Override
    public void run() {
        try {
//            String abc = employee.getAddress().getAddress();
//            log.info("Thread 1 : before changes " + abc);
            Thread.sleep(10000);
            employee.setAddress(Address.builder().address1("lets").address2("see").build());
            log.info("Thread1, Address : {}", employee.toString());
            Thread.sleep(10000);
        } catch (Exception e) {
            log.info(e.getMessage()+":"+e.toString());
        }
        log.info("Thread1, after timeout, Address : {}", employee.toString());
    }
}
