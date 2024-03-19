package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void isPrime() {

        assertEquals(false, Prime.isPrime(119));

        assertEquals(true , Prime.isPrime(149));
    }
}