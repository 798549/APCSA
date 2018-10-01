
/**
 * Write a description of class CalcRunner here.
 *
 * @author Jeremiah Ponce
 * @version 822
 */
public class CalcRunner
{
    public static void main(){
        SimpleCalc output = new SimpleCalc();
        System.out.println(output.add(10,20));
        System.out.println(output.subtract(10,20));
        System.out.println(output.multiply(10,20));
        System.out.println(output.divide(10,20));
        System.out.println(output.moduloDivide(10,20));
}
}