package com.example.calculator.model;

import java.math.BigDecimal;

public class CalculationResponse {
    private final BigDecimal result;
    public CalculationResponse(BigDecimal result) { this.result = result; }
    public BigDecimal getResult() { return result; }
}
