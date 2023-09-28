
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // decalare varaibles outside of loop
        int sum = 0;
        int count = 0;
        double avg = 0;

        // start loop to get count and sum of numbers
        while (true) {
            // prompt user for input and assign it to a vairable
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            // create if statement to exit loop
            if (number == 0) {
                break;
            }

            // sum the total numbers, update count, and calculate avg
            sum = sum + number;
            count = count + 1;
            avg = 1.0 * sum / count;
        }
        // print avg when loop is exited

        System.out.println("Average of the numbers: " + avg);

    }
}
