
/**
 * Write a description of class mainClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mainClass
{
    public static void main(){
        int[] array = {3,4,5,6,7};
       arrayChanger(array);
       for(int i: array){
           System.out.println(i);
       }
    }
    
    public static void arrayChanger(int x[]){
        for (int i = 0; i < x.length; i++){
            x[i]+=5;
        }
    }
}
