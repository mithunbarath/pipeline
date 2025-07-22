package com.example.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Calculator class.
 */
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test addition of two positive numbers")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    @DisplayName("Test subtraction of two positive numbers")
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
    }

    @Test
    @DisplayName("Test multiplication of two numbers")
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
    }

    @Test
    @DisplayName("Test division of two numbers")
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3), "6 / 3 should equal 2");
    }

    @Test
    @DisplayName("Test division by zero should throw an exception")
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        }, "Dividing by zero should throw IllegalArgumentException");
    }
}