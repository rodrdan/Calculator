package org.example.models;

public class CalculatorDTO {
    Double number1;
    Double number2;
    String operation;
    public void setNumber1(Double number) {
        this.number1 = number;
    }
    public void setNumber2(Double number) {
        this.number2 = number;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }
    public Double getNumber1() {
        return number1;
    }
    public Double getNumber2() {
        return number2;
    }
    public String getOperation() {
        return operation;
    }
}