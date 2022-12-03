package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = getNumber();
        int b = getNumber();
        System.out.println(multiplication(a, b));
        System.out.println(division(a, b));
        System.out.println(sum(a, b));
        System.out.println(substraction(a, b));
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int substraction(int a, int b) {
        return a - b;
    }


}