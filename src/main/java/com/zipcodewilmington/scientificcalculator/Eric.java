package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Eric {
    public static void error(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Error\n" + "Please input 0 to clear this message.");

        String clear = scan.next();
        if(!clear.equals("0")){ //Input validation, loops through previous message until 0 is inputted
            while(!clear.equals("0")){
                System.out.println("Please input 0 to clear this message.");
                clear = scan.next();
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


}