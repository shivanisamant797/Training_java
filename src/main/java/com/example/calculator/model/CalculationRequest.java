package com.example.calculator.model;

import java.math.BigDecimal;

public class CalculationRequest {
    private BigDecimal firstNumber;
    private String operator;
    private BigDecimal secondNumber;
    public BigDecimal getFirstNumber() { return firstNumber; }
    public void setFirstNumber(BigDecimal firstNumber) { this.firstNumber = firstNumber; }
    public String getOperator() { return operator; }
    public void setOperator(String operator) { this.operator = operator; }
    public BigDecimal getSecondNumber() { return secondNumber; }
    public void setSecondNumber(BigDecimal secondNumber) { this.secondNumber = secondNumber; }
}
