/* #####################################_________STEP TWO_________#####################################
 * Activity 1.2.6
 * Jake Stachlewitz
 * 
 * 1. Your modified code that displays two new strings, Step 2 (5 points)
 * 2.  Your answers to Step 3 (Predict the output) (5 points)
 */
public class StringCreationMethods 
{
  public static void main(String[] args) /*step one*/
  {
    String theGreatestState = "Maine";
      theGreatestState = theGreatestState.concat(". But there are far better states.");
    String secondState = new String(" Concatenating this string to the other, I can add: Massachusetts, Connecticut, Rhode Island, and New York.");
    System.out.print(theGreatestState);
    System.out.print(secondState);
  }
}

/* #####################################_________STEP THREE_________#####################################
*     It will not output anything except the word "Winter" as there is no equals sign making stateHerb = stateHerb.concat...
*/