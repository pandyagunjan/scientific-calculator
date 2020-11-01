package com.zipcodewilmington.scientificcalculator;

import com.sun.javafx.css.CalculatedValue;

/**
 * Updated by Gunjan /Eric /Munir
 */
public class MainApplication {
    public static void main(String[] args) {

        Double num1;
        Double num2;
        Double answer;
        Integer choiceInput;
        Integer switchMode;
        Boolean flagToContinue=true;

        String pressContinue="";

        Console.println("\u001B[31m      Welcome to our calculator! \u001B[31m");
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
                       break;

                 case 2:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number 1 :");
                        num2 = Console.getDoubleInput("Enter a Number 2 :");
                        //answer = num1 - num2;
                        answer=CalcMethods.subtractNumbers(num1,num2);
                        CalcMethods.displayModeOutput(switchMode,answer);
                        break;

                    case 10:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number 1 :");
                        num2 = Console.getDoubleInput("Enter a Number 2 :");
                        //answer = num1 - num2;
                        answer=CalcMethods.exponentNumbers(num1,num2);
                        Console.println("Exponents of %.2f ^ %.2f is : %.2f  \n", num1,num2,answer);
                        System.out.println("\u001B[0m");
                        pressContinue=Console.getStringInput("Press to continue...");
                        break;
                    case 9:
                        num1 = Console.getDoubleInput("Enter a Number :");
                        answer=CalcMethods.findFactorial(num1);
                        Console.println("Factorial of %.2f is : %.2f  \n", num1,answer);
                        System.out.println("\u001B[0m");
                        pressContinue=Console.getStringInput("Press to continue...");
                        break;

                    case 16:

                        num1 = Console.getDoubleInput("Enter a Number :");
                        answer=CalcMethods.inversrseSine(num1);
                        Console.println("Inverse Sine of %.2f is : %.2f  \n", num1,answer);
                        System.out.println("\u001B[0m");
                        pressContinue=Console.getStringInput("Press to continue...");
                        break;
                    case 17:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        answer=CalcMethods.inverseCosine(num1);
                        Console.println("Inverse Cosine of %.2f is : %.2f  \n", num1,answer);
                        System.out.println("\u001B[0m");
                        pressContinue=Console.getStringInput("Press to continue...");
                        break;
                    case 18:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        answer=CalcMethods.invserseTangent(num1);
                        Console.println("Inverse Tangent of %.2f is : %.2f  \n", num1,answer);
                        System.out.println("\u001B[0m");
                        pressContinue=Console.getStringInput("Press to continue...");
                        break;
                    case 7:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        answer=CalcMethods.cubeRoot(num1);
                        Console.println("Cube root of %.2f is : %.2f  \n", num1,answer);
                        System.out.println("\u001B[0m");
                        pressContinue=Console.getStringInput("Press to continue...");
                        break;

                    case 23:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        answer=CalcMethods.tenthPow(num1);
                        Console.println("Tenth Power of %.2f is : %.2f  \n", num1,answer);
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
            }

catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
    }

    }



}
