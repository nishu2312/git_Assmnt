package com.nagarro.exittest;

public class Calculator {
    public static double calculator(double num1, char operator, double num2) {
        try {
            switch (operator) {
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case '*':
                    return num1 * num2;
                case '/':
                    if (num2 != 0) {
                        return num1 / num2;
                    } else {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    public static void main(String[] args) {
       
        System.out.println(calculator(10, '+', 5)); 
        System.out.println(calculator(10, '-', 5)); 
        System.out.println(calculator(10, '*', 5));
        System.out.println(calculator(10, '/', 0)); 
        System.out.println(calculator(10, '%', 5)); 
    }
}
    
