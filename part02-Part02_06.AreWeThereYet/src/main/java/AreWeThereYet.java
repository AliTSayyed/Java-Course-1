
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create while loop and inputs
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            // set break statement
            if (number == 4) {
                break;
            }
            System.out.println(number);
        }
    }
}
