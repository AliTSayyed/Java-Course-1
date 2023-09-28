
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // decalare sum varaible outside of loop
        int sum = 0;

        // start loop to count sum of numbers
        while (true) {
            // prompt user for input and assign it to a vairable
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            // create if statement to exit loop
            if (number == 0) {
                break;
            }

            // sum the total numbers and store it to the variable sum
            sum = sum + number;
        }
        // print sum when loop is exited
        System.out.println("Sum of the numbers: " + sum);
    }
}
