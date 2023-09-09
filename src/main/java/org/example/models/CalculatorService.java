package org.example.models;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
        public double calculate(CalculatorDTO calculator){
            switch (calculator.getOperation()) {
                case "+" -> {
                    return calculator.getNumber1() + calculator.getNumber2();
                }
                case "-" -> {
                    return calculator.getNumber1() - calculator.getNumber2();
                }
                case "*" -> {
                    return calculator.getNumber1() * calculator.getNumber2();
                }
                default -> {
                    if (calculator.getNumber2() == 0) {
                        throw new IllegalArgumentException("Second number cannot be 0!");
                    }
                    return calculator.getNumber1() / calculator.getNumber2();
                }
            }
        }
    }
