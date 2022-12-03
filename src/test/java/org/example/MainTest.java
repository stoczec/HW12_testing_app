package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test_multiplication() {
        int answer = Main.multiplication(6, 2);
        assertEquals(12, answer);

        answer = Main.multiplication(0,0);
        assertEquals(0, answer);

        answer = Main.multiplication(2_000_000_000,2_000_000_000);
        assertEquals(4_000_000_000L, answer);
    }
    @Test
    public void test_division() {
        int answer = Main.division(6, 2);
        assertEquals(3, answer);

        answer = Main.division(6, 0); // error
        assertEquals(0, answer);

        answer = Main.division(2_000_000_000, 2_000_000);
        assertEquals(10, answer);

    }
    @Test
    public void test_sum() {
        int answer = Main.sum(6, 2);
        assertEquals(8, answer);

        answer = Main.sum(999, 1);
        assertEquals(1000, answer);

        answer = Main.sum(2_000_000_000, 2_000_000_000);
        assertEquals(4_000_000_000L, answer);
    }
    @Test
    public void test_substraction() {
        int answer = Main.substraction(6, 2);
        assertEquals(4, answer);

        answer = Main.substraction(6, 6);
        assertEquals(0, answer);

        answer = Main.substraction(2_000_000_000, 1_989_899_002);
        assertEquals(10_100_998, answer);
    }
}