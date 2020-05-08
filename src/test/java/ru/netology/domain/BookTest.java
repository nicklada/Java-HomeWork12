package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book(1,"Story1",1000,"Lada");

    @Test
    void shouldMatchByNameIfExists() {
        String textToFind = "Story1";
        assertTrue(book.matches(textToFind));
    }

    @Test
    void shouldMatchByNameIfNotExists() {
        String textToFind = "Story2";
        assertFalse(book.matches(textToFind));
    }

    @Test
    void shouldMatchByAuthorIfExists() {
        String textToFind = "Lada";
        assertTrue(book.matches(textToFind));
    }

    @Test
    void shouldMatchByAuthorIfNotExists() {
        String textToFind = "Mari";
        assertFalse(book.matches(textToFind));
    }

}