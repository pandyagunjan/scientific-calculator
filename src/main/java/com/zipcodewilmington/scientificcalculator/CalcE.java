package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class CalcE {
    public static void error(){
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Error\n" + "Please input 0 to clear this message.");
        String clear = scan.next();*/

        String clear = Console.getStringInput("Error\n" + "Please input 0 to clear this message.");

        if(!clear.equals("0")){ //Input validation, loops through previous message until 0 is inputted
            while(!clear.equals("0")){
                /*Console.println("Please input 0 to clear this message.");
                clear = scan.next();*/
                clear = Console.getStringInput("Please input 0 to clear this message.");
            }
        }
        Console.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static Double inverse(Double input){
        return 1 / input;
    }
    public static Double inverter(Double input){
        if (input < 0){
            return input - (input * 2);
        }
        return input + (input * 2);
    }

    public static Double answer(Double input){//Saves the previous answer onto a variable called answer (probably redundant)
        double ans = input; //Im gonna need to see the Main code before I can figure out how to implement it
        return ans;
    }


}