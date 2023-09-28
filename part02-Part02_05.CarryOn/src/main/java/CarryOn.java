
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create while loop with prompt and input
        while (true) {
            System.out.println("Shall we carry on?");
            String input = scanner.nextLine();

            // create conditional statement for break
            if (input.equals("no")) {
                break;
            }

        }

    }
}
