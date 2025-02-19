package com.example.calculatorapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    private  Calculator calculator = new Calculator();
    private final StringBuilder input = new StringBuilder();
    private boolean startNewNumber = true;

    @FXML
    private TextField display;

    @FXML
    public void handleDigitButton(javafx.event.ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        if (startNewNumber) {
            input.setLength(0); // Clear previous input
            startNewNumber = false;
        }
        input.append(value);
        display.setText(input.toString());
    }

    @FXML
    public void handleOperatorButton(javafx.event.ActionEvent event) {
        if (!input.isEmpty()) {
            calculator.setOperand1(Double.parseDouble(input.toString()));
            input.setLength(0); // Reset input for the next operand
            String operator = ((Button) event.getSource()).getText();
            calculator.setOperator(operator.charAt(0));
        }
        startNewNumber = true;
    }

    @FXML
    public void handleEqualsButton() {
        if (!input.isEmpty()) {
            calculator.setOperand2(Double.parseDouble(input.toString()));
            calculator.calculate();
            if (calculator.isError()) {
                display.setText("Error");
            } else {
                display.setText(Double.toString(calculator.getResult()));
            }
            startNewNumber = true;
        }
    }

    @FXML
    public void handleClearButton() {
        calculator.reset();
        input.setLength(0);
        display.setText("");
        startNewNumber = true;
    }
}