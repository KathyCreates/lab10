package org.example.junit4;

import com.example.Calculator;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import io.qameta.allure.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    @Description("Test for addition")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Arithmetic Operations")
    @Story("Addition")
    public void testAdd(){
        performAddition(2, 3);
    }

    @Step("Performing addition of {0} and {1}")
    public void performAddition(double num1, double num2) {
        double result = calculator.add(num1, num2);
        assertEquals("Addition result should be 5", 5.0, result, 0.0001);
    }

    @Test
    @Description("Test for subtraction")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Arithmetic Operations")
    @Story("Subtract")
    public void testSubtract(){
        performSubtraction(7, 2);
    }

    @Step("Performing subtraction of {0} and {1}")
    public void performSubtraction(double num1, double num2) {
        double result = calculator.subtract(num1, num2);
        assertEquals("Subtraction result should be 5", 5.0, result, 0.0001);
    }

    @Test
    @Description("Test for multiplication")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Arithmetic Operations")
    @Story("Multiply")
    public void testMultiply(){
        performMultiplication(1, 2);
    }

    @Step("Performing multiplication of {0} and {1}")
    public void performMultiplication(double num1, double num2) {
        double result = calculator.multiply(num1, num2);
        assertEquals("Multiplication result should be 2", 2.0, result, 0.0001);
    }

    @Test
    @Description("Test for division")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Arithmetic Operations")
    @Story("Divide")
    public void testDivide(){
        performDivision(8, 2);
    }

    @Step("Performing division of {0} and {1}")
    public void performDivision(double num1, double num2) {
        double result = calculator.divide(num1, num2);
        assertEquals("Division result should be 4", 4.0, result, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    @Description("Test for divide by zero")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Arithmetic Operations")
    @Story("Divide by zero")
    public void testDivideByZero(){
        performDivideByZero(1, 0);  // Цей крок повинен викликати виключення
    }

    @Step("Performing division by zero for {0} and {1}")
    public void performDivideByZero(double num1, double num2) {
        calculator.divide(num1, num2);  // Очікується виключення
    }

    @Test
    @Description("Test for square root")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Arithmetic Operations")
    @Story("Square root")
    public void testSqrt() {
        performSqrt(16.0);
    }

    @Step("Performing square root of {0}")
    public void performSqrt(double num) {
        double result = calculator.sqrt(num);
        assertEquals("Square root result should be 4", 4.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    @Description("Test for sqrt of negative number")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Arithmetic Operations")
    @Story("Sqrt of negative")
    public void testSqrtOfNegative() {
        performSqrtOfNegative(-1.0);  // Очікується виключення
    }

    @Step("Performing square root of negative number {0}")
    public void performSqrtOfNegative(double num) {
        calculator.sqrt(num);  // Очікується виключення
    }

    @Test
    @Description("Test for power")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Arithmetic Operations")
    @Story("Power")
    public void testPower() {
        performPower(2, 3);
    }

    @Step("Performing power calculation for {0} raised to {1}")
    public void performPower(double base, double exponent) {
        double result = calculator.power(base, exponent);
        assertEquals("Power result should be 8", 8.0, result, 0.001);
    }
}
