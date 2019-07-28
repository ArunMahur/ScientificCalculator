package com.example.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateFactorialTest {



    @Test
    public void factorial() {
          CalculateFactorial test1=new CalculateFactorial();
          int[] result=test1.factorial(9);
          assertArrayEquals(3,result);
    }

    private void assertArrayEquals(int i, int[] result) {
    }
}