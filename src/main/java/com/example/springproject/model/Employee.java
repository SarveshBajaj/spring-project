package com.example.springproject.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Employee {
    public Address address;
}
