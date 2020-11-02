package com.zipcodewilmington.scientificcalculator;
//Munir
public class CalculationsMethods {
    public static Double multiplyNumbers(Double num1, Double num2){
        return (num1 * num2);
    }
    public static Double divideNumbers(Double num1, Double num2) {
        return (num1 / num2);
    }
    public static Double Modulus(Double num1, Double num2) {
        return (num1 % num2);
    }
    public static Double exponentv(Double num1, Double num2) {
        return (Math.pow(num1,num2));
    }
    public static Double squareroot(Double num1) {
        return Math.sqrt(num1);
    }
    public static Double squared(Double num1) {
        return Math.pow(num1,2);
    }
    public static Double Sin(Double num1) {
        return Math.sin(num1);
    }
    public static Double Cos(Double num1) {
        return Math.cos(num1);
    }
    public static Double Tan(Double num1) {
        return Math.tan(num1);
    }
}