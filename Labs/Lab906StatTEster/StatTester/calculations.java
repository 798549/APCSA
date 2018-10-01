
/**
 * Write a description of class calculations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class calculations
{
    public static void main(String[] args) {
        //sum
        int nums[] = new int[10];
        for(int i = 0; i < nums.length; i++){ //  length 10
            nums[i] = (int)(Math.random()*10 + 1);
        }
        int numbs = 0;
        int numbs10 = 10;
        int sum = 0;
        // adds all values to sum
        for(int i = 0; i < nums.length; i++){ 
            sum = sum + nums[i];
        }
        System.out.println("Your numbers are " + Arrays.toString(nums));
        System.out.println(sum);
        // mean 
        double tot = 0;
        double mean = 0;

        for(int i = 0; i < numbs10; i++){
            tot = tot + nums[i];
        }
        mean = tot/numbs10;
        System.out.println("Your mean value is: " + mean);

        // median 
        double median = 0;
        double middle= 0;
        if(numbs10 %2 ==0)
        {
            int val=(numbs10/2)-1;
            for(int i=0; i<numbs10;i++)
            {
                if(val==i||(val+1)==i)
                {
                    middle= middle+numbs[i];
                }
            }
            middle = middle/2;
            System.out.println("The Median value is: "+middle);
        }
        else
        {
            int val= (numbs10/2);
            for(int i=0; i<numbs10; i++)
            {
                if( val==i)
                {
                    middle=numbs[i];
                    System.out.println("The Median value is: "+middle);
                }
            }
        }

    }
}