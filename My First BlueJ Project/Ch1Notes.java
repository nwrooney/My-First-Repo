
/**
 * Noah Rooney
 * 8/23/22
 * Chapter 1 Notes
 * Class notes on basic concepts
 * Who helped me: Mr. Kischuk, Mr. Hayes, Dog
 * 
 
 
 
*/
public class Ch1Notes
{
    
    /**
     * This is our code notes
     */
    public static void main(String[] args)
    {
        //basic data types
        double number = 8.9,number2;
        int x = 9,y,z;
        boolean choice = false;
        char letter = 'b';
        float number3 = 8;
        long n2 =3;
        short n3 = 7;
        
        // Reserve Words:
        // Public, Static, Void, Main, if, while, for, else, true, false
        
        // Java likes to input and output strings
        // Identifiers can have no spaces, cannot start with a number,
        // cannot have any special characters except for _ and $,
        // cannot include reserve words, and has no character limit but 
        // only 42 characters will be recognized
        
        //These are Classes and Objects
        //Class     ID              Memory      Constructor
        //Name
        Integer     n1 =            new         Integer(47);
        String      word =          new         String("Noah Rooney");
        Double      number4 =       new         Double(6.7);
        
        System.out.print(word.length());
    }
}
