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

    @Test
    void forTest2() {
        Person person = new Person();

        int expected = 72;

        int actual = person.ForTest1();

        assertEquals(expected, actual);


    }

    @Test
    void forTest3() {
        Person person = new Person();

        int expected = 4;

        int actual = person.ForTest1();

        assertEquals(expected, actual);


    }

}