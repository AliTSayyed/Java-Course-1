
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // create prompt for user
        System.out.println("Give numbers:");

        // declare sum, count, avg, even, odd variables
        int sum = 0;
        int count = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;

        //create while loop that allows for infinite number input                
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            // break if number  is -1. Prioritize this on top so -1 is not counted in the following operations.
            if (number == -1) {
                break;
            }

            // count even numbers
            // count odd numbers            
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            // sum the numbers at the end of the loop
            // create counter to track how many numbers were entered
            // avg the numbers
            sum = sum + number;
            count++;
            avg = 1.0 * sum / count;

        }

        // print outcome of loop exit        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
