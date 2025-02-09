package com.project;

import com.project.attempt.NumberContainers;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    static NumberContainers numberContainers;

    @BeforeAll
    public static void init() {

        numberContainers = new NumberContainers();

    }

    @Test
    public void changeTest() {

        numberContainers.change(2, 10);
        assertEquals(2, numberContainers.find(10));
        assertEquals(-1, numberContainers.find(11));

    }

    @Test
    public void findTest() {

        numberContainers.change(4, 15);
        assertEquals(4, numberContainers.find(15));
        assertEquals(-1, numberContainers.find(20));

    }

}
