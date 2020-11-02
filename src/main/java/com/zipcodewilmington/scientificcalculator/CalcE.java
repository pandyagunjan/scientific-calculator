package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
//Eric

public class CalcE {
    public static Double mPlus = 0.00; //I need this to be global to clear it from memoryClear()
    public static Boolean degRad = true;
    public static void error() {
        String clear = Console.getStringInput("Error\n" + "Please input 0 to clear this message.");
        if (!clear.equals("0")) { //Input validation, loops through previous message until 0 is inputted
            while (!clear.equals("0")) {
                clear = Console.getStringInput("Please input 0 to clear this message.");
            }
        }
        Console.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public static Double inverse(Double input) {
        return 1 / input;
    }
    public static Double inverter(Double input) {
        return input - (input * 2);//No need for if statement
    }
    /*public static Double answer(Double input){//Saves the previous answer onto a variable called answer (probably redundant)
        double ans = input; //Im gonna need to see the Main code before I can figure out how to implement it
        return ans;
    }*/
    public static void memoryPlus(Double input) {
        mPlus += input;
    }
    public static void memoryClear() {
        memoryPlus(-mPlus);
    }
    public static Double memoryRecall(){
        return mPlus;
    }
    public static void switchUnitsMode(String mode){
        if(mode.equals("Deg")){
            degRad = true;
        }
        degRad = false;
    }
    public static Double degRadConverter(Double input){
        if (degRad){
            return Math.toDegrees(input);
        }
        return Math.toRadians(input);
    }
    public static Double logNat(Double input){
        return Math.log1p(input);
    }
    public static Double log(Double input){
        return Math.log(input);
    }
    public static Double logInv(Double input){
        return Math.log10(input);
    }
    public static Double antiLog(Double input){
        return Math.exp(Math.log(input));
    }
}