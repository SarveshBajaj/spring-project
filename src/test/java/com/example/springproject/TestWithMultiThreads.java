package com.example.springproject;

import com.example.springproject.model.Employee;
import com.example.springproject.service.EmployeeCheckChangesImpl;
import com.example.springproject.service.EmployeeNewChangesCheck;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestWithMultiThreads {

    //MockBean?
    @Autowired
    Employee employee;

    @Autowired
    EmployeeCheckChangesImpl employeeCheckChanges;

    @Autowired
    EmployeeNewChangesCheck employeeNewChangesCheck;

    public void test1() {

    }

}
