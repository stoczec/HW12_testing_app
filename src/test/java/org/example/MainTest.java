package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test_multiplication() {

        int answer = Main.multiplication(6, 2);
        assertEquals(12, answer);
    }

    @Test
    public void test_multiplication_two() {

        int answer = Main.multiplication(0, 0);
        assertEquals(0, answer);
    }

    @Test
    public void test_multiplication_three() {

        int answer = Main.multiplication(2_000_000, 1_000);
        assertEquals(2_000_000_000L, answer);
    }

    @Test
    public void test_division() {

        int answer = Main.division(6, 2);
        assertEquals(3, answer);
    }

    @Test
    public void test_division_two() {

        int answer = Main.division(6, 0); // ERROR!!! You can't divide by 0!!!
        assertEquals(0, answer);
    }

    @Test
    public void test_division_three() {

        int answer = Main.division(2_000_000_000, 2_000_000);
        assertEquals(1000, answer);
    }

    @Test
    public void test_sum() {

        int answer = Main.sum(6, 2);
        assertEquals(8, answer);
    }

    @Test
    public void test_sum_two() {

        int answer = Main.sum(999, 1);
        assertEquals(1000, answer);
    }

    @Test
    public void test_sum_three() {

        int answer = Main.sum(1_000_000_000, 1_000_000_000);
        assertEquals(2_000_000_000, answer);
    }

    @Test
    public void test_substraction() {

        int answer = Main.substraction(6, 2);
        assertEquals(4, answer);
    }

    @Test
    public void test_substraction_two() {

        int answer = Main.substraction(2_000_000_000, 1_989_899_002);
        assertEquals(10_100_998, answer);
    }

    @Test
    public void test_substraction_three() {

        int answer = Main.substraction(6, 6);
        assertEquals(0, answer);
    }
}