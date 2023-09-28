
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // decalre vaibales outside of loop
        int sum = 0;
        int count = 0;
        double avg = 0;

        // create loop to avg only positve numbers
        while (true) {
            // give user input and assign in to int variable value
            int value = Integer.valueOf(scanner.nextLine());

            // create exit condition
            if (value == 0) {
                break;
            }

            // update count and sum of only positive numbers
            if (value > 0) {
                sum = sum + value;
                count = count + 1;
            }
        }
        
        // avg postive values
        avg = 1.0 * sum / count;

        // create conditon if no positive value is given
        if (sum <= 0) {
            System.out.println("Cannot calculate the average");
        }
        
        // create condition to print average when positive values are given
        if (sum > 0) {
            System.out.println(avg);
        }
    }
}
