/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplecalculator;

/**
 *
 * @author Andrey
 */
public class Calculator {
    
    public double multiply(double a, double b) {
        
        return a * b;
    }

    public double divide(double a, double b) throws IllegalArgumentException {
  
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return a / b;
    }
}
