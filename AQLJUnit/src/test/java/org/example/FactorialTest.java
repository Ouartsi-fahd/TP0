package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorial() {
        assertEquals(120,Factorial.factorial(5));
    }
}