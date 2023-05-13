package com.example.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void  setUp(){
        calculator  = new Calculator();
    }

    @Test
    void testMultiply(){
        assertEquals(20 , calculator.multiply(4, 5));
    }

    @Test
    void testMultiplyWithDouble(){
        assertEquals(0 , calculator.multiply(0, 5));
    }
    @Test
    void testDivision(){
        assertEquals(5 , calculator.divided(25 , 5));
    }
}
