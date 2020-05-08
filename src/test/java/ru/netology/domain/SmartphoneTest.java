package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    Smartphone smartphone = new Smartphone(4, "Iphone", 10000, "Apple");

    @Test
    void shouldMatchByNameIfExists() {
        String textToFind = "Iphone";
        assertTrue(smartphone.matches(textToFind));
    }

    @Test
    void shouldMatchByNameIfNotExists() {
        String textToFind = "Galaxy";
        assertFalse(smartphone.matches(textToFind));
    }

    @Test
    void shouldMatchByProducerIfExists() {
        String textToFind = "Apple";
        assertTrue(smartphone.matches(textToFind));
    }

    @Test
    void shouldMatchByProducerIfNotExists() {
        String textToFind = "Samsung";
        assertFalse(smartphone.matches(textToFind));
    }

}