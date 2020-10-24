/*
 * Activity 1.2.6
 * Jake Stachlewitz
 * 4.  Your program: (60 points) Use VS Code, trinket.io to create a program that produces output that includes each of the following:
 */
public class StepFour
{
    public static void main(String[] args) 
    {
        String stateSongL1 = new String("Yankee Doodle went to town");
        String stateSongL2 = "Riding on a pony,";
        String stateSongL3 = "Stuck a feather in his hat,";
        System.out.print(stateSongL1);
        System.out.print('\t' + System.lineSeparator() + stateSongL2 += '\b');
        System.out.println(System.lineSeparator() + stateSongL3);
        System.out.println("And called it macaroni.");
    }
}

/*

    How do String objects differ from primitive types like int and double?
        String objects contain more complex data of many types.

    What do the + and += operators do when applied to String objects?
        The + and += operators append data.

*/