
/**
 * Write a description of class AliceAndBobEngine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AliceAndBobEngine
{
    String result;
    
    AliceAndBobEngine(){
        result = "";
    }

    //HINT: LOOK AT THE TESTS TO SEE WHAT IS EXPECTED FOR DIFFERENT CONDITIONS
    public String evaluateAliceOrBob(String input)
    {
       // Check to see if the input value matches Alice
        if (input.equals ("Alice")){
            result = "Hello Alice";
        }
        else if (input.equals ("Bob")) // check to see if the input value matches Bob
        {
        result = "Hello Bob";
        }
        else // if the input value is other than Alice or Bob
        {
        result = "I DON'T KNOW YOU, YOU ARE SCARY";
        }
        
        return result;
    }
}
