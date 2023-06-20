package com.homework23.homework23.service.impl;

import com.homework23.homework23.exceptions.DevisionByZeroExceptions;
import com.homework23.homework23.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int plus (int a, int b) {
        return a + b;
    }
    @Override
    public int minus (int a, int b) {
        return a - b;
    }
    @Override
    public int multiply (int a, int b) {
        return a * b;
    }
    @Override
    public int divide (int a, int b) {
        if (b==0) {
            throw new DevisionByZeroExceptions();
        }
        return a / b;
    }
}
