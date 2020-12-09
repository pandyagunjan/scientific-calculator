package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Updated by Gunjan 
 */
public class Console {

    public static void Console() {    }
    public  void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public   void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public  String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);

        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }
    // This method checks if the entered value is 'Int' , If not requests user to key in another value.
    public  Integer getIntegerInput(String prompt) {
        Console useConsole=new Console();
        Scanner scanner = new Scanner(System.in);
        Integer userInput = 0;
        println(prompt);


        if (scanner.hasNextInt()) {
            userInput = scanner.nextInt();
        } else
        {
            userInput = useConsole.getIntegerInput ("Not a Number value, Please re-enter:");

        }

        return userInput;


    }
// This method checks if the entered value is 'Double' , If not requests user to key in another value.

    public  Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        Console getDoubleConsole=new Console();
        Double userInputDouble = 0D;
        print(prompt);
        //println(userInputDouble);

        if (scanner.hasNextDouble()) {
            userInputDouble = scanner.nextDouble();
        } else
        {
            userInputDouble = getDoubleConsole.getDoubleInput ("Not a Number value, Please re-enter:");

        }

        return userInputDouble;
    }

    public   String getOperationInput(String prompt)
    {
        Scanner operation = new Scanner(System.in);
        println (prompt);
        String ops = operation.nextLine();
        return ops;
    }


  public void displayConsole()
  {
      Double num1;
      Double num2;
      Double answer;
      Integer choiceInput;
      Integer switchMode;
      Boolean flagToContinue=true;
      Double output = 0.00;
      Double ans = 0.00;
      CalcMethods calcMethodsG= new CalcMethods();
      Console mainConsoleDisplay=new Console();
      CalcE calcMethodsE= new CalcE();
      CalculationsMethods calcMethodsM= new CalculationsMethods();
      String pressContinue="";
      mainConsoleDisplay.println("\u001B[31m      Welcome to calculator made by Eric,Gunjan,Munir ! \u001B[31m");
      switchMode = calcMethodsG.switchDisplay();


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
          choiceInput = mainConsoleDisplay.getIntegerInput("\u001B[34m Please enter the choice of action you want to perform: \u001B[34m");

          try {
              switch (choiceInput) {
                  case 1 :
                      num1 = mainConsoleDisplay.getDoubleInput("Enter a Number 1 :");
                      num2 = mainConsoleDisplay.getDoubleInput("Enter a Number 2 :");
                      answer=calcMethodsG.addTheNumbers(num1,num2);
                      calcMethodsG.displayModeOutput(switchMode,answer);
                      output=answer;
                      break;

                  case 2:

                      num1 = mainConsoleDisplay.getDoubleInput("Enter a Number 1 :");
                      num2 = mainConsoleDisplay.getDoubleInput("Enter a Number 2 :");
                      //answer = num1 - num2;
                      answer=calcMethodsG.subtractNumbers(num1,num2);
                      calcMethodsG.displayModeOutput(switchMode,answer);
                      output=answer;
                      break;

                  case 3:

                      num1 = mainConsoleDisplay.getDoubleInput("Enter a Number 1 :");
                      num2 = mainConsoleDisplay.getDoubleInput("Enter a Number 2 :");
                      answer=calcMethodsM.multiplyNumbers(num1,num2);
                      calcMethodsG.displayModeOutput(switchMode,answer);
                      output=answer;
                      break;

                  case 4:
                      //Integer i = mainConsoleDisplay.getIntegerInput("Enter an integer");
                      num1 = mainConsoleDisplay.getDoubleInput("Enter a Number 1 :");
                      num2 = mainConsoleDisplay.getDoubleInput("Enter a Number 2 :");
                      //answer = num1 / num2;
                      if(num2 == 0){
                          calcMethodsE.error();
                          break;
                      }
                      answer=calcMethodsM.divideNumbers(num1,num2);
                      output=answer;
                      calcMethodsG.displayModeOutput(switchMode,answer);
                      break;
                  case 5:
                      //Integer i = mainConsoleDisplay.getIntegerInput("Enter an integer");
                      num1 = mainConsoleDisplay.getDoubleInput("Enter a Number 1 :");
                      num2 = mainConsoleDisplay.getDoubleInput("Enter a Number 2 :");
                      if(num2 == 0){
                          calcMethodsE.error();
                          break;
                      }
                      answer=calcMethodsM.Modulus(num1,num2);
                      output=answer;
                      mainConsoleDisplay.println("Modulus output : %.2f", answer);
                      break;
                  case 6:
                      //Integer i = mainConsoleDisplay.getIntegerInput("Enter an integer");
                      num1 = mainConsoleDisplay.getDoubleInput("Enter a Number :");
                      if(num1 < 0){
                          calcMethodsE.error();
                          break;
                      }
                      answer=calcMethodsM.squareroot(num1);
                      output=answer;
                      mainConsoleDisplay.println("Square root output : %.2f", answer);
                      break;
                  case 7:
                      //Integer i = mainConsoleDisplay.getIntegerInput("Enter an integer");
                      num1 = mainConsoleDisplay.getDoubleInput("Enter a Number :");
                      answer=calcMethodsG.cubeRoot(num1);
                      mainConsoleDisplay.println("Cube root of %.2f is : %.2f  \n", num1,answer);
                      output=answer;
                      System.out.println("\u001B[0m");
                      pressContinue=mainConsoleDisplay.getStringInput("Press to continue...");
                      break;
                  case 8:
                      //Integer i = mainConsoleDisplay.getIntegerInput("Enter an integer");
                      num1 = mainConsoleDisplay.getDoubleInput("Enter a Number :");
                      //answer = num1 ^ 2;
                      answer=calcMethodsM.squared(num1);
                      output=answer;
                      mainConsoleDisplay.println("Square output : %.2f", answer);
                      break;

                  case 9:
                      num1 = mainConsoleDisplay.getDoubleInput("Enter a Number :");
                      answer=calcMethodsG.findFactorial(num1);
                      mainConsoleDisplay.println("Factorial of %.2f is : %.2f  \n", num1,answer);
                      output=answer;
                      System.out.println("\u001B[0m");
                      pressContinue=mainConsoleDisplay.getStringInput("Press to continue...");
                      break;

                  case 10:
                      //Integer i = mainConsoleDisplay.getIntegerInput("Enter an integer");
                      num1 = mainConsoleDisplay.getDoubleInput("Enter a Number 1 :");
                      num2 = mainConsoleDisplay.getDoubleInput("Enter a Number 2 :");
                      //answer = num1 - num2;
                      answer=calcMethodsG.exponentNumbers(num1,num2);
                      output=answer;
                      mainConsoleDisplay.println("Exponents of %.2f ^ %.2f is : %.2f  \n", num1,num2,answer);
                      System.out.println("\u001B[0m");
                      pressContinue=mainConsoleDisplay.getStringInput("Press to continue...");
                      break;
                  case 11:
                      output = calcMethodsE.inverter(mainConsoleDisplay.getDoubleInput("Please enter the number you would like to invert. "));
                      System.out.println(output);
                      break;
                  case 12:
                      output = calcMethodsE.inverse(mainConsoleDisplay.getDoubleInput("Please enter the number you would like the inverse of. "));
                      System.out.println(output);
                      break;
                  case 13:
                      //Integer i = mainConsoleDisplay.getIntegerInput("Enter an integer");
                      num1 = mainConsoleDisplay.getDoubleInput("Enter a Number :");
                      //answer = sin(num1)
                      answer=calcMethodsM.Sin(calcMethodsE.degRadConverter(num1));
                      output=answer;
                      mainConsoleDisplay.println("Sin output : %.2f", answer);
                      break;
                  case 14:
                      //Integer i = mainConsoleDisplay.getIntegerInput("Enter an integer");
                      num1 = mainConsoleDisplay.getDoubleInput("Enter a Number :");
                      //answer = Cos(num1)
                      answer=calcMethodsM.Cos((calcMethodsE.degRadConverter(num1)));
                      output=answer;
                      mainConsoleDisplay.println("Cos output : %.2f", answer);
                      break;
                  case 15:
                      //Integer i = mainConsoleDisplay.getIntegerInput("Enter an integer");
                      num1 = mainConsoleDisplay.getDoubleInput("Enter a Number :");
                      //answer = Tan(num1)
                      answer=calcMethodsM.Tan((calcMethodsE.degRadConverter(num1)));
                      output=answer;
                      mainConsoleDisplay.println("Tan output : %.2f", answer);
                      break;
                  case 16:

                      num1 = mainConsoleDisplay.getDoubleInput("Enter a Number :");
                      answer=calcMethodsG.inversrseSine((calcMethodsE.degRadConverter(num1)));
                      mainConsoleDisplay.println("Inverse Sine of %.2f is : %.2f  \n", num1,answer);
                      System.out.println("\u001B[0m");
                      output=answer;
                      pressContinue=mainConsoleDisplay.getStringInput("Press to continue...");
                      break;
                  case 17:
                      //Integer i = mainConsoleDisplay.getIntegerInput("Enter an integer");
                      num1 = mainConsoleDisplay.getDoubleInput("Enter a Number :");
                      answer=calcMethodsG.inverseCosine((calcMethodsE.degRadConverter(num1)));
                      output=answer;
                      mainConsoleDisplay.println("Inverse Cosine of %.2f is : %.2f  \n", num1,answer);
                      System.out.println("\u001B[0m");
                      pressContinue=mainConsoleDisplay.getStringInput("Press to continue...");
                      break;
                  case 18:
                      //Integer i = mainConsoleDisplay.getIntegerInput("Enter an integer");
                      num1 = mainConsoleDisplay.getDoubleInput("Enter a Number :");
                      answer=calcMethodsG.invserseTangent((calcMethodsE.degRadConverter(num1)));
                      output=answer;
                      mainConsoleDisplay.println("Inverse Tangent of %.2f is : %.2f  \n", num1,answer);
                      System.out.println("\u001B[0m");
                      pressContinue=mainConsoleDisplay.getStringInput("Press to continue...");
                      break;
                  case 19:
                      mainConsoleDisplay.println("Here are the options for memory:\n 1. M+\n 2: MC\n 3: MRC\n");
                      Integer m = mainConsoleDisplay.getIntegerInput("Please enter a number for which memory operation you would like to perform ");
                      switch (m) {
                          case 1: //Gets user input then adds to memory
                              calcMethodsE.memoryPlus(mainConsoleDisplay.getDoubleInput("Please enter the number you would like to add to memory. "));
                              break;
                          case 2:
                              calcMethodsE.memoryClear();
                              break;
                          case 3:
                              System.out.println(calcMethodsE.memoryRecall());
                              break;
                          default:
                              mainConsoleDisplay.println("No selection made, returning to main menu.");
                              break;
                      }
                      break;
                  case 20:
                      mainConsoleDisplay.println("Here are the options for Logarithmic functions:\n 1. Logarithm\n 2: Natural logarithm\n 3: Inverse logarithm\n 4: inverse natural logarithm");
                      Integer l = mainConsoleDisplay.getIntegerInput("Please enter a number for Logarithm operation you would like to perform ");
                      switch (l) {
                          case 1: //Gets user input then calculates and displays Log
                              output = calcMethodsE.log(mainConsoleDisplay.getDoubleInput("Please enter the number you would like the Logarithm of. "));
                              System.out.println(output);
                              break;
                          case 2:
                              output = calcMethodsE.logNat(mainConsoleDisplay.getDoubleInput("Please enter the number you would like the natural logarithm of. "));
                              System.out.println(output);
                              break;
                          case 3:
                              output = calcMethodsE.logInv(mainConsoleDisplay.getDoubleInput("Please enter the number you would like the log10 of. "));
                              System.out.println(output);
                              break;
                          case 4:
                              output = calcMethodsE.antiLog(mainConsoleDisplay.getDoubleInput("Please enter the number you would like the inverse natural log of. "));
                              System.out.println(output);
                              break;
                          default:
                              mainConsoleDisplay.println("No selection made, returning to main menu.");
                              break;
                      }
                      break;
                  case 21:
                      System.out.println(ans);
                      break;
                  case 22:
                      Integer d = mainConsoleDisplay.getIntegerInput("Please enter a 1 to change to degrees, or a 2 for radians. ");
                      if(d == 1){
                          calcMethodsE.switchUnitsMode("Deg");
                      }
                      calcMethodsE.switchUnitsMode("Rad");
                      break;

                  case 23:
                      //Integer i = mainConsoleDisplay.getIntegerInput("Enter an integer");
                      num1 = mainConsoleDisplay.getDoubleInput("Enter a Number :");
                      answer=calcMethodsG.tenthPow(num1);
                      mainConsoleDisplay.println("Tenth Power of %.2f is : %.2f  \n", num1,answer);
                      output=answer;
                      System.out.println("\u001B[0m");
                      pressContinue=mainConsoleDisplay.getStringInput("Press to continue...");
                      break;

                  case 24:
                      switchMode = calcMethodsG.switchDisplay();
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

  public Double returnNumber()
  {
      Console returnNumberConsole=new Console();
      Double num1 = returnNumberConsole.getDoubleInput("Enter a Number :");
      return num1;
  }


}