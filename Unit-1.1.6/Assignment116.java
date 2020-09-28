/*
 *  Activity 1.1.6
 *  Jake Stachlewitz  
 */
 
import java.util.Scanner;

public class Assignment116 {

    public static void main(final String[] args) {
        //Setting up the scanning variable, asking for the variable, printing it back to the user
        Scanner newScan = new Scanner(System.in);
        System.out.println("Please type your number:");
        String num = newScan.nextLine();
        System.out.println("...");
        System.out.println("Selected Number: " + num + ". If your number is not an integer, it will be converted by rounding it down.");
        
        //Converting the number num from string to float, number, to integer, numberButNotDecimal. This bypasses a lot of issues and allows for (almost) an endless string to be inputted, without the need to input just a double
        float number = Float.parseFloat(num);
        int numberButNotDecimal = (int) number;
        //If the value of the string is is not a number (eg boolean or character), the program errors here. Inclusion of an if statement dictating all types of variables could detour this issue. Below I've set some variables.
        int numberDouble;
        int numberPlusSix;
        int numberHalved;
        int probablyThree;

        //Telling the user what's going on with the math behind the conversion.
        System.out.println("Your number has undergone conversion, it is now: " + numberButNotDecimal + ".");
        System.out.println("...");
        numberDouble = numberButNotDecimal * 2;
        System.out.println("Your number times two: " + numberDouble);
        numberPlusSix = numberDouble + 6;
        System.out.println(numberDouble + " + 6: " + numberPlusSix);
        numberHalved = numberPlusSix / 2;
        System.out.println(numberPlusSix + " / 2: " + numberHalved);
        probablyThree = numberHalved - numberButNotDecimal;
        System.out.print(numberHalved + " - " + numberButNotDecimal);
        System.out.print(" should equal three. Let's see what it made: " + probablyThree);
        newScan.close();
    }
  
  }