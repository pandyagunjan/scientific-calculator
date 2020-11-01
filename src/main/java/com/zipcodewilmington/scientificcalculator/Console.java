package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
/**
 * Updated by Eric on 10/31/2020
 */
public class Console {
    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }
    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }
    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }
    // This method checks if the entered value is 'Int' , If not requests user to key in another value.
    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        Integer userInput = 0;
        println(prompt);
        if (scanner.hasNextInt()) {
            userInput = scanner.nextInt();
        } else
        {
            userInput = Console.getIntegerInput ("Not a Number value, Please re-enter:");
        }
        return userInput;
    }
    // This method checks if the entered value is 'Double' , If not requests user to key in another value.
    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        Double userInputDouble = 0D;
        print(prompt,userInputDouble);
        //println(userInputDouble);
        if (scanner.hasNextDouble()) {
            userInputDouble = scanner.nextDouble();
        } else
        {
            userInputDouble = Console.getDoubleInput ("Not a Number value, Please re-enter:");
        }
        return userInputDouble;
    }
    public static  String getOperationInput(String prompt)
    {
        Scanner operation = new Scanner(System.in);
        println (prompt);
        String ops = operation.nextLine();
        return ops;
    }
    /*public static  void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }*/
    }