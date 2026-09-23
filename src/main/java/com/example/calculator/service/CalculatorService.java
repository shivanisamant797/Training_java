package com.example.calculator.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public BigDecimal calculate(BigDecimal firstNumber, String operator, BigDecimal secondNumber) {
        if (firstNumber == null || secondNumber == null || operator == null) throw new IllegalArgumentException("Both numbers and an operator are required.");
        switch (operator) {
            case "+": return firstNumber.add(secondNumber);
            case "-": return firstNumber.subtract(secondNumber);
            case "*": return firstNumber.multiply(secondNumber);
            case "/": return divide(firstNumber, secondNumber);
            case "%": return remainder(firstNumber, secondNumber);
            default: throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }
    private BigDecimal divide(BigDecimal firstNumber, BigDecimal secondNumber) {
        if (secondNumber.compareTo(BigDecimal.ZERO) == 0) throw new ArithmeticException("Cannot divide by zero.");
        return firstNumber.divide(secondNumber, 12, RoundingMode.HALF_UP).stripTrailingZeros();
    }
    private BigDecimal remainder(BigDecimal firstNumber, BigDecimal secondNumber) {
        if (secondNumber.compareTo(BigDecimal.ZERO) == 0) throw new ArithmeticException("Cannot calculate a remainder with zero.");
        return firstNumber.remainder(secondNumber);
    }
}
