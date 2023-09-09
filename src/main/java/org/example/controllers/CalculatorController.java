package org.example.controllers;

import org.example.models.CalculatorDTO;
import org.example.models.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("spring-calculator")
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;
    @GetMapping
    public String renderCalculator(@ModelAttribute CalculatorDTO calculatorDTO) {
        return "calculator";
    }
    @PostMapping
    public String calculate(@ModelAttribute CalculatorDTO calculatorDTO, Model model) {
        double result = calculatorService.calculate(calculatorDTO);
        model.addAttribute("result", result);
        return "result";
    }
    @ExceptionHandler(IllegalArgumentException.class)
    public String handleIllegalArgumentException() {
        return "invalid-form";
    }
}
