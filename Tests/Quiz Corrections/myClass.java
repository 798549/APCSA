
/**
 * Write a description of class myClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class myClass
{
    // the first problem
    // output is "War"
    public static void main(){

        int x = 12;
        int y =3;
        if(x < 4 && y != 3){

            System.out.println("Peace");
        }else if(x > 4 || y < 3){
            System.out.println("War");
        }else{

            System.out.println("War and Peace");
        }

        // question 2
        // output is 6
        int test = 0;
        int sum = 0;
        while(test < 4){
            sum += test;
            test++;
        }
        System.out.println(sum);
        
        // question 3
        // output is 2
        int sum1 = 0;
        int num1 = 4;
        for(int i = 1; i <= num1; i++){
            sum1 += i;
        }
        System.out.println(sum1/num1);
        
    }    
    
    
}