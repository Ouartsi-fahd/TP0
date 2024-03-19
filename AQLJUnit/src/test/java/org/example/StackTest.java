package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    void push() {
        Stack s = new Stack();
        s.push(3);
        s.push(2);

        int[] array_expected = new int[10] ;
        array_expected[0] = 3;
        array_expected[1] = 2 ;
        assertArrayEquals( array_expected ,s.getArray());
    }

    @Test
    void pop() {
        Stack s = new Stack();
        s.push(3);
        s.push(2);
        s.pop();

        int[] array_expected = new int[10] ;
        array_expected[0] = 3;
        assertEquals( 1 ,s.size());
    }

    @Test
    void peek() {
        Stack s = new Stack();
        s.push(3);
        s.push(2);
        assertEquals( 2 ,s.peek());

    }

    @Test
    void isEmpty() {
        Stack s = new Stack();
        s.push(3);
        assertEquals( false ,s.isEmpty());
        s.pop();
        assertEquals( true ,s.isEmpty());
    }
}