package com.example;

public class Calculator{
    public double add(double a, double b){
        return a + b;
    }

    public double subtract(double a, double b){

        return a - b;
    }

    public double multiply(double a, double b){

        return a * b;
    }

    public double divide(double a, double b){
        if (b == 0){
            throw new IllegalArgumentException("Divide by zero");
        }
        return a / b;
    }

    public double sqrt(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(a);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}