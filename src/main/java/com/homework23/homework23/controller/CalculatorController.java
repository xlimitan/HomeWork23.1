package com.homework23.homework23.controller;

import com.homework23.homework23.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculator;

    public CalculatorController(CalculatorService calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/")
    public String greating() {
        return "Добро пожаловать в калькулятор!";
    }
    @GetMapping("/plus")
    public String plus(@RequestParam(name = "num1") int a, @RequestParam(name = "num2") int b) {
        return a + " + " + b + " = " + calculator.plus(a, b);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam(name = "num1") int a, @RequestParam(name = "num2") int b) {
        return a + " - " + b + " = " + calculator.minus(a, b);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam(name = "num1") int a, @RequestParam(name = "num2") int b) {
        return a + " * " + b + " = " + calculator.multiply(a, b);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam(name = "num1") int a, @RequestParam(name = "num2") int b) {
        if (b==0){
           return  "Делить на ноль нельзя";
        }
        return a + " / " + b + " = " + calculator.divide(a, b);
    }
}
