package app.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    @Test
    void forTest1() {
        Person person = new Person();

        int expected = 9;

        int actual = person.ForTest1();

        assertEquals(expected, actual);


    }

}