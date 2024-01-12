package com.example;

class Calculator {

    public Calculator() {

    }

    public static int sum(int[] numbers) {

        int result = 0;

        for (int i: numbers) {
            result += i;
        }

        return result;
    }
}