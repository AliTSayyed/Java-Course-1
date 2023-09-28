
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // declare number vairable outside of loop and assign it a value
        int numbers =0;
        
        // start while loop to count numbers inputed
        while (true){
            // give prompt and assign value to variable
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            
            // create if staement to break loop
            if (value ==0){
                break;
            }
            
            // update count of numbers
            numbers = numbers + 1;
        }
        
        // print out the count of numbers
        System.out.println("Number of numbers: " + numbers);
    }
}
