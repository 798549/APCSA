
/**
 * Write a description of class mainClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mainClass
{
    public static void main(){
        // formula for compound interest: A= P(1+R)^n
        double amount;
        double principal = 10000;
        double rate = 0.01;
        
        
        for(int day = 1; day < 20; day++){
            amount = principal * Math.pow(1 + rate, day);
            System.out.println(day + "    " + amount);
        }
    }
}
