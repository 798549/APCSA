import java.util.Scanner;
public class apples
{
    public static void main(String args[]){
        // this makes a variable, buckly, equal to whatever the keyboard input is
        Scanner buckly = new Scanner(System.in);
        // this creates your variables
        double num1, num2, answer;
        
        //this creates a basic user interface, and sets the inputs equal to variables
        System.out.println("What is your first number: ");
        num1 = buckly.nextDouble();
        System.out.println("What is your second number: ");
        num2 = buckly.nextDouble();
        
        // this adds the two inputs together
        answer = num1+num2;
        System.out.println(answer);
        
    }
}
