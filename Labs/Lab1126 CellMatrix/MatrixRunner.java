
/**
 * 
 * 
 * @author (Jeremiah Ponce) 
 * @version (11-26-18)
 */
public class MatrixRunner{
    
    public static void main(){
      CellMatrix cm = new CellMatrix(10, 10);  
      
      cm.loadMatrix();
      
      cm.printMatrix();
      System.out.println("\n Largest neighbor value = " +cm.getGreatestNeighbors());
    }
}