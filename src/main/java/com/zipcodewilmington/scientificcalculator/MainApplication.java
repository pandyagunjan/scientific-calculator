package com.zipcodewilmington.scientificcalculator;
//Eric Ringer
/**
 * Created by leon on 2/9/18.
 */

public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to our calculator!");

        Integer i = Console.getIntegerInput("Please enter a number for which operation you woud like to perform");

        switch(i){
            case 10:
                Double invrse = CalcE.inverse(Console.getDoubleInput("Please enter the number you would like the inverse of."));
                System.out.println(invrse);
                break;
            case 11:
                Double invert = CalcE.inverse(Console.getDoubleInput("Please enter the number you would like to invert."));
                System.out.println(invert);
            case 12:
            default:

        }

    }

