package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void helloWorld() {
        String result = "Hello world!";
        assertEquals(Main.helloWorld(), result);
    }

    @Test
    void returnThree() {
        int result = 3;
        assertEquals(Main.returnThree(), result);
    }

}
