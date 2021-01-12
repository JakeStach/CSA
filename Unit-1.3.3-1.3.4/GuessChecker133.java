/*
 * Activity 1.3.3 and 1.3.4
 * Jake Stachlewitz
 */
import java.util.Scanner;
 
public class GuessChecker133
{
	public static void main(String[] args)
	{
    /* Add any variables you will need throughout the program here. */
  
    // Generate the random number
    String targetStr = makeCode();
    //System.out.println(targetStr);  // uncomment for debugging
    
    // Break the random number into four variables.
    int r1 = Integer.parseInt(targetStr.substring(0, 1));
    int r2 = Integer.parseInt(targetStr.substring(1, 2));
    int r3 = Integer.parseInt(targetStr.substring(2, 3));
    int r4 = Integer.parseInt(targetStr.substring(3, 4));
    
    // Get the user's guess.
    String guess = getGuess();
    //System.out.println(guess);   // uncomment for debugging
    
    // Break the user's guess into four variables.
    int g1 = Integer.parseInt(guess.substring(0, 1));
    int g2 = Integer.parseInt(guess.substring(1, 2));
    int g3 = Integer.parseInt(guess.substring(2, 3));
    int g4 = Integer.parseInt(guess.substring(3, 4));

    int hit = 0;
    int nearHit = 0;
    if (r1 == g1){
      System.out.println("Number in position 1 matched");
      hit++;
    }
    else if (r1 == g1 + 1 || r1 == g1 - 1){
        System.out.println("Number in position 1 is a near match");
        nearHit++;
    }
    else {
        System.out.println("Position 1: No Hit");
    }
    if (r2 == g2){
      System.out.println("Number in position 2 matched");
      hit++;
    } 
    else if (r2 == g2 + 1 || r2 == g2 - 1){
        System.out.println("Number in position 2 is a near match");
        nearHit++;
    }
    else {
        System.out.println("Position 2: No Hit");
    }
    if (r3 == g3){
      System.out.println("Number in position 3 matched");
      hit++;
    } 
    else if (r3 == g3 + 1 || r3 == g3 - 1){
        System.out.println("Number in position 3 is a near match");
        nearHit++;
    }
    else {
        System.out.println("Position 3: No Hit");
    }
    if (r4 == g4){
      System.out.println("Number in position 4 matched");
      hit++;
    }
    else if (r1 == g1 + 1 || r1 == g1 - 1){
        System.out.println("Number in position 4 is a near match");
        nearHit++;
    }
    else {
        System.out.println("Position 4: No Hit");
    }
    System.out.println("Total Hits: " + hit);
    System.out.println("Total Near Hits: " + nearHit);
	}
 
  // Checks to ensure no duplicate digits in a int.
	public static boolean hasDupes(int num)
	{ 
		boolean[] digs = new boolean[10];
		while (num > 0)
		{
			if (digs[num % 10])
			  return true;
			digs[num % 10] = true;
			num /= 10;
		}
		return false;
	}

  // Creates a new random 4 digit code 1000-9999 with no duplicates.
  public static String makeCode() 
  { 
		int target = (int) (Math.random() * 9000 + 1000);
		while (hasDupes(target))
		  target = (int) (Math.random() * 9000 + 1000);
    String targetStr = target + "";
    return targetStr;
  }

  // Prompts the user for a guess and repeats until valid guess is made.
  public static String getGuess() 
  { 
    Scanner sc = new Scanner(System.in);
    boolean validGuess = false;
    int userGuess = 0;
    while (!validGuess)
    {
      System.out.print("Guess a 4-digit number from 1000 to 9999 with no duplicate digits: ");
      userGuess = sc.nextInt();
      if (!(hasDupes(userGuess) || (userGuess < 1000))) 
        validGuess = true;
    }
    String userStr = userGuess + "";
    return userStr;
  }
}


/*
 * 2. a. What does the else statement do to the length and complexity of your code?
 *      I used "else if" statements to reduce the bulkiness of an else statement.
 *      I also used a "logical OR" to keep my code from getting too big.
 * 2.b. How is a two-way statement different from a one-way selection?
 *      One-way selection is limiting in scope. Expanding the scope in two-way selection allows for near hits to be counted.
 */