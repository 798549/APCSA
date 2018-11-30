import java.util.Scanner;
public class mainClass
{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        myClass myClassObject = new myClass();
        System.out.println("Enter a name ");
        String tempvar = scanner.nextLine();
        myClassObject.setName(tempvar);
        myClassObject.saying();
    }
}