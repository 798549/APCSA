import java.util.Random;
/**
 * Write a description of class mainClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mainClass
{
    public static void main(){
        Random dice = new Random();
        int number;
        
        for(int i = 1; i <= 10; i++){
            number = 1 + dice.nextInt(6);
            System.out.println(number + "    ");
        }
    }
}
