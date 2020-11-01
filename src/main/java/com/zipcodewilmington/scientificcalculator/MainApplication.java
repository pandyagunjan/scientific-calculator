package com.zipcodewilmington.scientificcalculator;

/**
 * Updated by Gunjan /Eric /Munir
 */
public class MainApplication {
    public static void main(String[] args) {

        Double num1;
        Double num2;
        Double answer;
        Integer choiceInput;
        Boolean flagToContinue=true;


        Console.println("\u001B[31m  Welcome to our calculator! \u001B[31m");
        //String s = Console.getStringInput("Enter a string");

        while (flagToContinue) {

            System.out.println(" \u001B[36m >> Calculator options available << \u001B[36m" );
            System.out.println("\u001B[0m");
            System.out.println("        1.  Add ");
            System.out.println("        2.  Subtract");
            System.out.println("        3.  Multiply ");
            System.out.println("        4.  Division");
            System.out.println("        5.  Modulus ");
            System.out.println("        6.  Square Root");
            System.out.println("        7.  Average");
            System.out.println("        8.  Exponentiation");
            System.out.println("        9.  Mode");
            System.out.println("        21. Factorial");
            System.out.println("        22. Inverse Sin");
            System.out.println("        23. Inverse Cosine");
            System.out.println("        24. Inverse Tangent");
            System.out.println("        25. Cube Root");
            System.out.println("        26. Tenth Power");
            System.out.println("        Other.  To Quit");
            choiceInput = Console.getIntegerInput("\u001B[34m Please enter the choice of action you want to perform: \u001B[34m");


            try {
                switch (choiceInput) {
                    case 1:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number 1 :");
                        num2 = Console.getDoubleInput("Enter a Number 2 :");
                        //answer = num1 + num2;
                        answer=CalcMethods.addTheNumbers(num1,num2);
                        Console.println("Addition output : %.2f", answer);
                        System.out.println("\u001B[0m");
                        break;

                    case 2:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number 1 :");
                        num2 = Console.getDoubleInput("Enter a Number 2 :");
                        //answer = num1 - num2;
                        answer=CalcMethods.subtractNumbers(num1,num2);
                        Console.println("Subtraction output : %.2f", answer);
                        System.out.println("\u001B[0m");
                        break;

                    case 8:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number 1 :");
                        num2 = Console.getDoubleInput("Enter a Number 2 :");
                        //answer = num1 - num2;
                        answer=CalcMethods.exponentNumbers(num1,num2);
                        Console.println("Exponents of %.2f ^ %.2f is : %.2f  \n", num1,num2,answer);
                        System.out.println("\u001B[0m");
                        break;
                    case 21:
                        num1 = Console.getDoubleInput("Enter a Number :");
                        answer=CalcMethods.findFactorial(num1);
                        Console.println("Factorial of %.2f is : %.2f  \n", num1,answer);
                        System.out.println("\u001B[0m");
                        break;

                    case 22:

                        num1 = Console.getDoubleInput("Enter a Number :");
                        answer=CalcMethods.inversrseSine(num1);
                        Console.println("Inverse Sine of %.2f is : %.2f  \n", num1,answer);
                        System.out.println("\u001B[0m");
                        break;
                    case 23:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        answer=CalcMethods.inverseCosine(num1);
                        Console.println("Inverse Cosine of %.2f is : %.2f  \n", num1,answer);
                        System.out.println("\u001B[0m");
                        break;
                    case 24:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        answer=CalcMethods.invserseTangent(num1);
                        Console.println("Inverse Tangent of %.2f is : %.2f  \n", num1,answer);
                        System.out.println("\u001B[0m");
                        break;
                    case 25:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        answer=CalcMethods.cubeRoot(num1);
                        Console.println("Cube root of %.2f is : %.2f  \n", num1,answer);
                        System.out.println("\u001B[0m");
                        break;

                    case 26:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        answer=CalcMethods.tenthPow(num1);
                        Console.println("Tenth Power of %.2f is : %.2f  \n", num1,answer);
                        System.out.println("\u001B[0m");
                        break;



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
        //Integer i = Console.getIntegerInput("Enter an integer");
        //Double d = Console.getDoubleInput("Enter a double.");

        //Console.println("The user input %s as a string", s);
      //  Console.println("The user input %s as a integer", i);
      //  Console.println("The user input %s as a d", d);
    }
}
