
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // decalare sum and count varaibles outside of loop
        int sum = 0;
        int count = 0;

        // start loop to sum and count the numbers
        while (true) {
            // prompt user for input and assign it to a vairable
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            // create if statement to exit loop
            if (number == 0) {
                break;
            }

            // sum the total numbers and update count
            sum = sum + number;
            count = count + 1;
        }
        // print sum when loop is exited
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);

    }
}
