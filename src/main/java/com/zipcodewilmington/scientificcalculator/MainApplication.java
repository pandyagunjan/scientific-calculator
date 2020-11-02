package com.zipcodewilmington.scientificcalculator;

import com.sun.javafx.css.CalculatedValue;

/**
 * Updated by Gunjan /Eric /Munir on 11/01/2020
 */
public class MainApplication {
    public static void main(String[] args) {

        Double num1;
        Double num2;
        Double answer;
        Integer choiceInput;
        Integer switchMode;
        Boolean flagToContinue=true;
        Double output = 0.00;
        Double ans = 0.00;

        String pressContinue="";
        Console.println("\u001B[31m      Welcome to calculator made by Eric,Gunjan,Munir ! \u001B[31m");
        switchMode = CalcMethods.switchDisplay();


        while (flagToContinue) {
            int displayZero=0;
            System.out.println(" \u001B[36m >> Calculator options available << \u001B[36m\u001B[0m" );
            //System.out.println("\u001B[0m");
            System.out.println("        1.  Add ");
            System.out.println("        2.  Subtract ");
            System.out.println("        3.  Multiply ");
            System.out.println("        4.  Division ");
            System.out.println("        5.  Modulus ");
            System.out.println("        6.  Square Root");
            System.out.println("        7.  Cube Root ");
            System.out.println("        8.  Square");
            System.out.println("        9.  Factorial ");
            System.out.println("        10. Exponentiation");
            System.out.println("        11. Sign Inverter");
            System.out.println("        12. Inverse");
            System.out.println("        13. Sin");
            System.out.println("        14. Cosine");
            System.out.println("        15. Tangent");
            System.out.println("        16. Inverse Sine");
            System.out.println("        17. Inverse Cosine");
            System.out.println("        18. Inverse Tangent");
            System.out.println("        19. Memory Options");
            System.out.println("        20. Logarithmic Functions");
            System.out.println("        21. Print previous answer");
            System.out.println("        22. Radians or degrees");
            System.out.println("        23. Tenth Power");
            System.out.println("        24. Switch Display Mode");
            System.out.println("        Other.  To Quit");
            choiceInput = Console.getIntegerInput("\u001B[34m Please enter the choice of action you want to perform: \u001B[34m");

            try {
                switch (choiceInput) {
                   case 1 :

                       Console.println("Current number is : "  + displayZero);
                       num1 = Console.getDoubleInput("Enter a Number 1 :");
                       num2 = Console.getDoubleInput("Enter a Number 2 :");
                       answer=CalcMethods.addTheNumbers(num1,num2);
                       CalcMethods.displayModeOutput(switchMode,answer);
                       output=answer;
                       break;

                 case 2:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number 1 :");
                        num2 = Console.getDoubleInput("Enter a Number 2 :");
                        //answer = num1 - num2;
                        answer=CalcMethods.subtractNumbers(num1,num2);
                        CalcMethods.displayModeOutput(switchMode,answer);
                        output=answer;
                        break;

                    case 3:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number 1 :");
                        num2 = Console.getDoubleInput("Enter a Number 2 :");
                        //answer = num1 * num2;
                        answer=CalculationsMethods.multiplyNumbers(num1,num2);
                        Console.println("Multiplication output : %.2f", answer);
                        output=answer;
                        break;

                    case 4:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number 1 :");
                        num2 = Console.getDoubleInput("Enter a Number 2 :");
                        //answer = num1 / num2;
                        if(num2 == 0){
                            CalcE.error();
                            break;
                        }
                        answer=CalculationsMethods.divideNumbers(num1,num2);
                        output=answer;
                        Console.println("Division output : %.2f", answer);
                        break;
                    case 5:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number 1 :");
                        num2 = Console.getDoubleInput("Enter a Number 2 :");
                        if(num2 == 0){
                            CalcE.error();
                            break;
                        }
                        answer=CalculationsMethods.Modulus(num1,num2);
                        output=answer;
                        Console.println("Modulus output : %.2f", answer);
                        break;
                    case 6:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        if(num1 < 0){
                            CalcE.error();
                            break;
                        }
                        answer=CalculationsMethods.squareroot(num1);
                        output=answer;
                        Console.println("Square root output : %.2f", answer);
                        break;
                    case 7:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        answer=CalcMethods.cubeRoot(num1);
                        Console.println("Cube root of %.2f is : %.2f  \n", num1,answer);
                        output=answer;
                        System.out.println("\u001B[0m");
                        pressContinue=Console.getStringInput("Press to continue...");
                        break;
                    case 8:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        //answer = num1 ^ 2;
                        answer=CalculationsMethods.squared(num1);
                        output=answer;
                        Console.println("Square output : %.2f", answer);
                        break;

                    case 9:
                        num1 = Console.getDoubleInput("Enter a Number :");
                        answer=CalcMethods.findFactorial(num1);
                        Console.println("Factorial of %.2f is : %.2f  \n", num1,answer);
                        output=answer;
                        System.out.println("\u001B[0m");
                        pressContinue=Console.getStringInput("Press to continue...");
                        break;

                    case 10:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number 1 :");
                        num2 = Console.getDoubleInput("Enter a Number 2 :");
                        //answer = num1 - num2;
                        answer=CalcMethods.exponentNumbers(num1,num2);
                        output=answer;
                        Console.println("Exponents of %.2f ^ %.2f is : %.2f  \n", num1,num2,answer);
                        System.out.println("\u001B[0m");
                        pressContinue=Console.getStringInput("Press to continue...");
                        break;
                    case 11:
                        output = CalcE.inverter(Console.getDoubleInput("Please enter the number you would like to invert. "));
                        System.out.println(output);
                        break;
                    case 12:
                        output = CalcE.inverse(Console.getDoubleInput("Please enter the number you would like the inverse of. "));
                        System.out.println(output);
                        break;
                    case 13:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        //answer = sin(num1)
                        answer=CalculationsMethods.Sin(CalcE.degRadConverter(num1));
                        output=answer;
                        Console.println("Sin output : %.2f", answer);
                        CalcE.degRadConverter();
                        break;
                    case 14:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        //answer = Cos(num1)
                        answer=CalculationsMethods.Cos((CalcE.degRadConverter(num1)));
                        output=answer;
                        Console.println("Cos output : %.2f", answer);
                        break;
                    case 15:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        //answer = Tan(num1)
                        answer=CalculationsMethods.Tan((CalcE.degRadConverter(num1)));
                        output=answer;
                        Console.println("Tan output : %.2f", answer);
                        break;
                    case 16:

                        num1 = Console.getDoubleInput("Enter a Number :");
                        answer=CalcMethods.inversrseSine((CalcE.degRadConverter(num1)));
                        Console.println("Inverse Sine of %.2f is : %.2f  \n", num1,answer);
                        System.out.println("\u001B[0m");
                        output=answer;
                        pressContinue=Console.getStringInput("Press to continue...");
                        break;
                    case 17:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        answer=CalcMethods.inverseCosine((CalcE.degRadConverter(num1)));
                        output=answer;
                        Console.println("Inverse Cosine of %.2f is : %.2f  \n", num1,answer);
                        System.out.println("\u001B[0m");
                        pressContinue=Console.getStringInput("Press to continue...");
                        break;
                    case 18:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        answer=CalcMethods.invserseTangent((CalcE.degRadConverter(num1)));
                        output=answer;
                        Console.println("Inverse Tangent of %.2f is : %.2f  \n", num1,answer);
                        System.out.println("\u001B[0m");
                        pressContinue=Console.getStringInput("Press to continue...");
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

                    case 23:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        answer=CalcMethods.tenthPow(num1);
                        Console.println("Tenth Power of %.2f is : %.2f  \n", num1,answer);
                        output=answer;
                        System.out.println("\u001B[0m");
                        pressContinue=Console.getStringInput("Press to continue...");
                        break;

                    case 24:
                        switchMode = CalcMethods.switchDisplay();
                        continue;

                    default:
                        flagToContinue=false;
                        System.out.print("Quiting the calculator, Program Ending");
                        System.exit(0);
                        break;

                }
                ans=output;
            }

catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
    }

    }


}
