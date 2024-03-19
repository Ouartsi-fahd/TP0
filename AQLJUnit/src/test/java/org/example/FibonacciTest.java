package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacci() {
        int n  =  5 ;

        assertEquals(5,Fibonacci.fibonacci(n));

    }
}