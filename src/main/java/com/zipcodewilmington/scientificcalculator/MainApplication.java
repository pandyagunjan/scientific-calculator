package com.zipcodewilmington.scientificcalculator;
//Eric Ringer
/**
 * Created by leon on 2/9/18.
 */

public class MainApplication {
    public static void main(String[] args) {
        Boolean loopYN = true;
        Double output = 0.00;
        Double ans = 0.00;

        Console.println("Welcome to our calculator!");

        while (loopYN){
            Console.println("12. Inverse");
            Console.println("11. Sign inverter");
            Console.println("20. Logarithmic functions list");
            Console.println("19. Memory options");
            Console.println("22. Degrees or radians");
            Console.println("21. Print the previous answer");

            Integer i = Console.getIntegerInput("Please enter the respective number for which operation you would like to perform");

            switch (i) {
                case 4:
                    //Integer i = Console.getIntegerInput("Enter an integer");
                    num1 = Console.getDoubleInput("Enter a Number 1 :");
                    num2 = Console.getDoubleInput("Enter a Number 2 :");
                    //answer = num1 / num2;
                    if(num2 == 0){
                        CalcE.error();
                    }
                    answer=CalculationsMethods.divideNumbers(num1,num2);
                    output=answer;
                    Console.println("Division output : %.2f", answer);
                    break;
                case 11:
                    output = CalcE.inverter(Console.getDoubleInput("Please enter the number you would like to invert. "));
                    System.out.println(output);
                    break;
                case 12:
                    output = CalcE.inverse(Console.getDoubleInput("Please enter the number you would like the inverse of. "));
                    System.out.println(output);
                    break;

                case 19:
                    Console.println("Here are the options for memory:\n 1. M+\n 2: MC\n 3: MRC\n");
                    Integer m = Console.getIntegerInput("Please enter a number for which memory operation you would like to perform ");
                    switch (m) {
                        case 1: //Gets user input then adds to memory
                            CalcE.memoryPlus(Console.getDoubleInput("Please enter the number you would like to add to memory. "));
                            break;
                        case 2:
                            CalcE.memoryClear();
                            break;
                        case 3:
                            System.out.println(CalcE.memoryRecall());
                            break;
                        default:
                            Console.println("No selection made, returning to main menu.");
                            break;
                    }
                    break;
                case 20:
                    Console.println("Here are the options for Logarithmic functions:\n 1. Logarithm\n 2: Natural logarithm\n 3: Inverse logarithm\n 4: inverse natural logarithm");
                    Integer l = Console.getIntegerInput("Please enter a number for Logarithm operation you would like to perform ");
                    switch (l) {
                        case 1: //Gets user input then calculates and displays Log
                            output = CalcE.log(Console.getDoubleInput("Please enter the number you would like the Logarithm of. "));
                            System.out.println(output);
                            break;
                        case 2:
                            output = CalcE.logNat(Console.getDoubleInput("Please enter the number you would like the natural logarithm of. "));
                            System.out.println(output);
                            break;
                        case 3:
                            output = CalcE.logInv(Console.getDoubleInput("Please enter the number you would like the log10 of. "));
                            System.out.println(output);
                            break;
                        case 4:
                            output = CalcE.antiLog(Console.getDoubleInput("Please enter the number you would like the inverse natural log of. "));
                            System.out.println(output);
                            break;
                        default:
                            Console.println("No selection made, returning to main menu.");
                            break;
                    }
                    break;
                case 21:
                    System.out.println(ans);
                    break;
                case 22:
                    Integer d = Console.getIntegerInput("Please enter a 1 to change to degrees, or a 2 for radians. ");
                    if(d == 1){
                        CalcE.switchUnitsMode("Deg");
                    }
                    CalcE.switchUnitsMode("Rad");
                    break;

                case 25:
                    loopYN = false;
                    break;
                default:
                    Console.println("Please select one of the options listed above");
            }
            ans = output;
        }
    }
}
