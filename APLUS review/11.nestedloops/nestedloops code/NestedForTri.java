// A+ Computer Science
// www.apluscompsci.com

//nested for loop example

public class NestedForTri
{
    public static void main(String args[])
    {

        /*
         *
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *********
         */

        int stop=9;
        
        //add in a for loop to print the rows
        for (int i = 1; i <= stop; i++){   //rows
            //add in a for loop to print out the * on each row
            for (int j = 1; j <= i; j++){   //columns
                System.out.print("*");
                
            }
            //print out a new line
            System.out.println();
        }

           
        
        
        

    }
}