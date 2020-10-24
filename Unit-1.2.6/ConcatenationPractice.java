/*
 * Activity 1.2.6
 * Jake Stachlewitz
 * 3. Your code for Step 7: ("Complete the code below (in Step 7) using each of the concatenation operators where noted in the comments. When the program runs, it should display Whoopie Pie and Wild Blueberry") (10 points)
 */
public class ConcatenationPractice
{
  public static void main(String[] args) 
  {
    String stateTreat = "Whoopie";
    String stateBerry = "Wild ";
    /* This can also be done in the variable definition. */
    System.out.println(stateTreat + " Pie");
    System.out.println(stateBerry += "Blueberry");
  }
}