
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables and assign user input
        int number = Integer.valueOf(scanner.nextLine());

        // set up conditional
        if (number < 0) {
            int newNumber = number * -1;
            System.out.println(newNumber);
        } else {
            System.out.println(number);
        }
    }
}
