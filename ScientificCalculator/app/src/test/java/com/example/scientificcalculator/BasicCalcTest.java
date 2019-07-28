package com.example.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasicCalcTest {

    @Test
    public void onCreate() {
        BasicCalc test=new BasicCalc();

          assertEquals(5,7-2);
          assertEquals(5,3+2);
          assertEquals(3,6/2);
          assertEquals(14,7*2);
    }
}