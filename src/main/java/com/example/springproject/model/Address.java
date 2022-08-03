package com.example.springproject.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Builder
public class Address {
    @Value("${address1}")
    String address1;
    @Value("${address2}")
    String address2;
    public String getAddress(){
        return address1+address2;
    }
}
