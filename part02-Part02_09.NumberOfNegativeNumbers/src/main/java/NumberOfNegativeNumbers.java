
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // declare variable outside of loop
        int count = 0;
        
        // create while loop 
        while (true){
            // create prompt and user input
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            
            // create if statement to break loop
            if (value == 0){
                break;           
            }
            
            // create if statement to update count if value is negative
            if (value < 0){
                count = count + 1;
            }                       
        }
        
        System.out.println("Number of negative numbers: " + count);

    }
}
