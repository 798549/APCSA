import java.util.Scanner;
public class myClassRunner
{
    public static void main(){
        Scanner input = new Scanner(System.in);
        myClass myClassObject = new myClass();
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        myClassObject.message(name);
    }
}