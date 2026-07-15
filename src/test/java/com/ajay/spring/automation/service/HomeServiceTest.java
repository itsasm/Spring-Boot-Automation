package com.ajay.spring.automation.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HomeServiceTest {

    HomeService service = new HomeService();

    @Test
    @DisplayName("Test 12 Is Even Number")
    public void testEvenNumber() {
        //Arrange
        int number = 12;

        //Act
        boolean actual = service.isEvenNumber(number);

        //Act
        assertTrue(actual);
    }

    @Test
    @DisplayName("Test 123 Is Not Even Number")
    public void testNotEvenNumber() {
        //Arrange
        int number = 123;

        //Act
        boolean actual = service.isEvenNumber(number);

        //Act
        assertFalse(actual);
    }
}