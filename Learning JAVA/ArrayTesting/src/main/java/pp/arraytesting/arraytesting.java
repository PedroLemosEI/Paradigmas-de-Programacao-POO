package pp.arraytesting;
import java.util.*;

public class arraytesting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Important part here VVV
        System.out.println("Enter the array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        
        System.out.println("Enter 5 elements: ");
        
        for (int i=0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Entered values are:\t");
        
        for(int i=0; i < arr.length; i++){
            System.out.print(" | " + arr[i] + " | ");
            
        }
        
    }
    
}
