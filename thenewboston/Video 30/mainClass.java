import java.util.Random;
public class mainClass
{
    public static void main(){
        Random random = new Random();
        int[] frequency = new int[7];
        
        for (int i = 1; i < 1000; i++){
            ++frequency[1+random.nextInt(6)];
        }
        System.out.println("Face\tFrequency");
        
        for (int i = 1; i < frequency.length; i ++){
            System.out.println(i+"\t"+frequency[i]);
        }
    }
}
