
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // give user prompt
        System.out.print("Last number? ");
        
        //read user input
        int number = Integer.valueOf(scanner.nextLine());
        
        // decalre sum value
        int sum = 0;
        
        // create for loop
        for (int i = 0; i <= number; i++){
            sum = sum + i;
        }
        
        System.out.println("The sum is " + sum);

    }
}
