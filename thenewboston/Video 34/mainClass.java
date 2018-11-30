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
        // syntax for 2 dimentional array: int[][] array = new int[5][5];
        // syntax for 2 dimentional array: int[][] array = {{1,2,3,4,5},{1,2,3,4,5}};
        int[] oneDArray = {1,2,3,4,5};
        System.out.println(oneDArray);
        int[][] array = {{1,2,3,4,5},{1,2,3,4,5}};
        int[][] array2 = {{10,10,10,10},{10,10,10,10}};
        
        System.out.println("This is the first array");
        display(array);
        
        System.out.println("This is the second array");
        display(array2);
    }
    
    public static void display(int x[][]){
        for (int row = 0; row < x.length; row++){
            for(int column = 0; column < x[row].length; column++){
                System.out.print(x[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
