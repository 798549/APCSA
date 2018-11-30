import java.util.Scanner;
/**
 * Write a description of class mainClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mainClass
{
    public static void main(){
        // all the variables about going to be used
        Scanner input = new Scanner(System.in);
        int total = 0;
        int grade;
        int average;
        int counter = 0;
        
        // this lets you input the number. It keeps a tally of all the numbers inputed
        while (counter < 10){
            grade = input.nextInt();
            total = total + grade;
            counter++;
        }
        // this is to find the average of all the inputs
        average = total / 10;
        System.out.println("Your average is " + average);
    }
}
