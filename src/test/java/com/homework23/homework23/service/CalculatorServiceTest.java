package com.homework23.homework23.service;

import com.calculator.calculator.exceptions.DevisionByZeroExceptions;
import com.calculator.calculator.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void sumPositive() {
        assertEquals(10, calculatorService.plus(3, 7));
    }

    @Test
    void sumNegative() {
        assertEquals(-10, calculatorService.plus(-3, -7));
    }

    @Test
    void sumSymmetry() {
        assertEquals(calculatorService.plus(3, 7), calculatorService.plus(7, 3));
    }

    @Test
    void minusPositive() {
        assertEquals(4, calculatorService.minus(7, 3));
    }

    @Test
    void minusNegative() {
        assertEquals(-4, calculatorService.minus(3, 7));
    }

    @Test
    void minusSymmetry() {
        assertNotEquals(calculatorService.minus(12, 7), calculatorService.minus(7, 3));
    }

    @Test
    void multiplyPositive() {
        assertEquals(21, calculatorService.multiply(7, 3));
    }

    @Test
    void multiplyNegative() {
        assertEquals(-21, calculatorService.multiply(-3, 7));
    }

    @Test
    void multiplySymmetry() {
        assertEquals(calculatorService.multiply(12, 7), calculatorService.multiply(7, 12));
    }

    @Test
    void dividePositive() {
        assertEquals(2, calculatorService.divide(7, 3));
    }

    @Test
    void divideNegative() {
        assertEquals(-5, calculatorService.divide(-10, 2));
    }

    @Test
    void divideByZero() {
        assertThrows(DevisionByZeroExceptions.class, () -> {
            calculatorService.divide(10, 0);
        });
    }
}
