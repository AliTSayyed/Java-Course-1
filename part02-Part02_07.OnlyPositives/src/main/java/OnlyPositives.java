
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // declate variable outside of loop, mke value greater than 0
        int number = 1;

        // create a while loop with the condition number is greater than 0
        while (number > 0) {
            // create prompt to ask user for number and update value of number
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            
            // create if statement to break loop if number is equal to 0
            if (number == 0) {
                break;
            }

            // create if statement to restart the loop if number is less than 0
            if (number < 0) {
                System.out.println("Unsuitable number");
                number = 1;
                continue;
            }

            // print desired result when number is greater than 0
            System.out.println(number * number);
        }

    }
}
