package com.zipcodewilmington.scientificcalculator;

public class CalcMethods {


    public static void CalcMethods()
    {

    }

    public static Double addTheNumbers(Double num1, Double num2) {

          return (num1 + num2);
    }

    public static Double subtractNumbers(Double num1 , Double num2)
    {

            return (num1 - num2);
    }

    public static double exponentNumbers(Double num1 , Double num2)
    {

        return Math.round(Math.pow(num1,num2));

    }
    public static Double inversrseSine(Double num1)
    {
        //Double asinResult=Math.asin(num1);
        return Math.asin(num1);
    }
    public static Double inverseCosine(Double num1)
    {
        // Double acosResult=Math.acos(num1);
        return Math.acos(num1);
    }
    public static Double invserseTangent(Double num1)
    {
        //Double atanResule=;
        return Math.atan(num1);
    }
    public static Double findFactorial(Double num1)
    {
        Double storeTempValue=1D;
        for(int i=1;i<=num1;i++)
        {
            storeTempValue= storeTempValue*i;
        }
        return storeTempValue;
    }
    public static Double cubeRoot(Double num1)
    {
        return Math.cbrt(num1);
    }

    public static double tenthPow(double num1){
        return Math.pow(10,num1);
    }

    public static Integer switchDisplay()
    {
        Integer switchMode = Console.getIntegerInput("\u001B[34m Display Mode (Applicable to +,-,/,*):\n 1.Decimal \n 2.Octal \n 3.Binary\n 4.Hexadecimal  \u001B[34m");
         if(switchMode < 1 || switchMode > 4)
         {
             switchMode = Console.getIntegerInput("\u001B[34m Reselect the Display Mode: 1.Decimal 2.Octal 3.Binary 4.Hexadecimal  \u001B[34m");
             if(switchMode < 1 || switchMode > 4)
             {
                 switchDisplay();
             }
         }

        return switchMode;
    }

    public static void displayModeOutput(Integer switchMode ,Double answer)
    {
        int tempAnswer;
        String strOutput;
        String pressContinue="";
        switch(switchMode)
        {
            case 1 :
                Console.println("Addition output : %.2f", answer);
                break;
            case 2:   tempAnswer = (int) Math.round(answer);
                strOutput= Integer.toOctalString(tempAnswer);
                Console.println("Output in Octal : %s ", strOutput);
                break;
            case 3:   tempAnswer = (int) Math.round(answer);
                strOutput= Integer.toBinaryString(tempAnswer);
                Console.println("Output in Binary : %s ", strOutput);
                break;
            case 4:   tempAnswer = (int) Math.round(answer);
                strOutput= Integer.toHexString(tempAnswer);
                Console.println("Output in Hexadecimal : %s ", strOutput);
                break;
        }
        System.out.println("\u001B[0m");
        pressContinue=Console.getStringInput("Press enter to continue...");

    }
}
