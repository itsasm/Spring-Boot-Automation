package com.ajay.spring.automation.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public boolean isEvenNumber(long number) {
        return number % 2 == 0;
    }
}
