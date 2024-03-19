package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getFullName(){
        Person p = new Person("Fahd","Ouartsi",23);
        assertEquals("Fahd Ouartsi", p.getFullName());
    }

    @Test
    void isAdult(){
        Person p = new Person("Fahd","Ouartsi",23);
        assertEquals(true, p.isAdult());
    }


}