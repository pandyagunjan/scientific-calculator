package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Double num1;
        Double num2;
        Double answer;
        Integer choiceInput;
        Boolean flagToContinue=true;

        Console.println("Welcome to my calculator!");
        /*String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");*/

        while (flagToContinue) {

            System.out.println(">> Calculator options available: <<" );
            System.out.println("1.  Add ");
            System.out.println("2.  Subtract");
            System.out.println("3.  Multiply ");
            System.out.println("4.  Divide ");
            System.out.println("5.  Modulus ");
            System.out.println("6.  Square ");
            System.out.println("7.  Variable Exponent ");
            System.out.println("8.  Square Root ");
            System.out.println("9.  Sin ");
            System.out.println("10.  Cos ");
            System.out.println("11.  Tan ");
            System.out.println("12.  Clear Display ");
            System.out.println("Other.  To Quit");
            choiceInput = Console.getIntegerInput("Please enter the choice of action you want to perform:");


            try {
                switch (choiceInput) {
                   /*case 1:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number 1 :");
                        num2 = Console.getDoubleInput("Enter a Number 2 :");
                        //answer = num1 + num2;
                        //answer=CalculationsMethods.addTheNumbers(num1,num2);
                        Console.println("Addition output : %.2f", answer);
                        break;

                    case 2:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number 1 :");
                        num2 = Console.getDoubleInput("Enter a Number 2 :");
                        //answer = num1 - num2;
                       // answer=CalculationsMethods.subtractNumbers(num1,num2);
                        Console.println("Subtraction output : %.2f", answer);
                        break;*/

                    case 3:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number 1 :");
                        num2 = Console.getDoubleInput("Enter a Number 2 :");
                        //answer = num1 * num2;
                        answer=CalculationsMethods.multiplyNumbers(num1,num2);
                        Console.println("Multiplication output : %.2f", answer);
                        break;
//(clear the display, remainder, squared, square root) these things need to be done!!

                    case 4:
                       //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number 1 :");
                        num2 = Console.getDoubleInput("Enter a Number 2 :");
                        //answer = num1 / num2;
                        answer=CalculationsMethods.divideNumbers(num1,num2);
                        Console.println("Division output : %.2f", answer);
                        break;

                   case 5:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number 1 :");
                        num2 = Console.getDoubleInput("Enter a Number 2 :");
                        //answer = num1 % num2;
                        answer=CalculationsMethods.Modulus(num1,num2);
                        Console.println("Modulus output : %.2f", answer);
                        break;


                    case 8:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        //answer = num1 ^ 2;
                        answer=CalculationsMethods.squared(num1);
                        Console.println("Square output : %.2f", answer);
                        break;



                        case 10:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number 1 :");
                        num2 = Console.getDoubleInput("Enter a Number 2 :");
                        //answer = num1 ^ num2;
                        answer=CalculationsMethods.exponentv(num1,num2);
                        Console.println("Variable Exponent output : %.2f", answer);
                        break;

                    case 6:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        //answer = sqrroot(num1)
                        answer=CalculationsMethods.squareroot(num1);
                        Console.println("Square Root output : %.2f", answer);
                        break;

                    case 13:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        //answer = sin(num1)
                        answer=CalculationsMethods.Sin(num1);
                        Console.println("Sin output : %.2f", answer);
                        break;

                    case 14:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        //answer = Cos(num1)
                        answer=CalculationsMethods.Cos(num1);
                        Console.println("Cos output : %.2f", answer);
                        break;

                    case 15:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number :");
                        //answer = Tan(num1)
                        answer=CalculationsMethods.Tan(num1);
                        Console.println("Tan output : %.2f", answer);
                        break;

                   /* case 12: Runtime.getRuntime().exec("clear");
                    System.out.print("\033[H\033[2J");
                    System.out.flush();*/




                    default:
                        flagToContinue=false;
                        System.out.print("Quiting the calculator, Program Ending");
                        System.exit(0);
                        break;

                }
            }

            catch(Exception e)
            {
                System.out.print("NullPointerException Caught");
            }

       /* Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);*/
    }
}}
