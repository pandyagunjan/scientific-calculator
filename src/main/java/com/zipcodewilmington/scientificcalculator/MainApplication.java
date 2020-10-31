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



        Console.println("Welcome to our calculator!");
        //String s = Console.getStringInput("Enter a string");

        while (flagToContinue) {

            System.out.println(">> Calculator options available: <<" );
            System.out.println("1.  Add ");
            System.out.println("2.  Subtract");
            //System.out.println("3.  Multiply ");
            System.out.println("Other.  To Quit");
            choiceInput = Console.getIntegerInput("Please enter the choice of action you want to perform:");


            try {
                switch (choiceInput) {
                    case 1:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number 1 :");
                        num2 = Console.getDoubleInput("Enter a Number 2 :");
                        //answer = num1 + num2;
                        answer=CalcMethods.addTheNumbers(num1,num2);
                        Console.println("Addition output : %.2f", answer);
                        break;

                    case 2:
                        //Integer i = Console.getIntegerInput("Enter an integer");
                        num1 = Console.getDoubleInput("Enter a Number 1 :");
                        num2 = Console.getDoubleInput("Enter a Number 2 :");
                        //answer = num1 - num2;
                        answer=CalcMethods.subtractNumbers(num1,num2);
                        Console.println("Subtraction output : %.2f", answer);
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
