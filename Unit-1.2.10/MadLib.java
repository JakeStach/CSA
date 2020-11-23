/*
 * Activity 1.2.10
 * Jake Stachlewitz
 * 
 * The plan for this program is to make three different Mad Libs. A random number generator will dictate the random number picked and the user can run the program again.
 */
import java.util.Scanner;
import java.util.Random;

public class MadLib {
    public static void main(String[] args) {
        Scanner reqLib = new Scanner(System.in);
        // makes new scanner, named reqLib, asks for the next thing
        System.out.println("Finding a Mad Lib for you...");
        Random rand = new Random(); //new random class, picks a random integer 1-3
        int randInt = rand.nextInt(3); 
        
        String name, adjective, noun;

        System.out.println("Enter a name: ");
        name = reqLib.next();
        System.out.println("Enter an adjective: ");
        adjective = reqLib.next();
        System.out.println("Enter a noun: ");
        noun = reqLib.next();

        if (randInt == 1) {
            System.out.println("Picked Option 1");
            System.out.println("The big, " + adjective + " bear felt " + noun + " inside of " + name + ".");
        }
        else if (randInt == 2) {
            System.out.println("Picked Option 2");
            System.out.println("The house was the color of " + noun + " and the lawn smelled like " + adjective + " so we decided to name it " + name + ".");
        }
        else {
            System.out.println("Picked Option 3");
            System.out.println("I didn't know how to " + adjective + " so I decided to " + noun + ".");
        }
    }
}