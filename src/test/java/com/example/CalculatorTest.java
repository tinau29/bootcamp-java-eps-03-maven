package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void sumTest() {

        Calculator calc = new Calculator();
        assertTrue(calc instanceof Calculator);
        // cal.Calculator();


        assertEquals(0, Calculator.sum(new int[]{}));

        int[] numbers = {1,2,3,4};
        assertEquals(10, Calculator.sum(numbers));
    }
}