
/**
 * Write a description of class SimpleCalc here.
 *
 * @author Jeremiah Ponce
 * @version 822
 */
public class SimpleCalc
{
    // instance variables - replace the example below with your own
    private int divNumb;

    /**
     * Constructor for objects of class SimpleCalc
     */
    public SimpleCalc()
    {
        // initialise instance variables
    }
    // adds two integers
        public double add(int x, int y){
        return x + y;
    }
    // subtracts two integers
    public double subtract(int x, int y){
        return x-y;
    }
    // multiplys two integers
    public double multiply(int x, int y){
        return x*y;
    }
    // divides two integers
    public double divide(int x, int y){
        if (y!=0){
            divNumb = x/y;
        }
        return divNumb;
    }
    // mods two integers
    public double moduloDivide(int x, int y){
        return x%y;
    }
}