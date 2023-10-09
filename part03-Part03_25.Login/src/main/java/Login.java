
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prompt for user name and password
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // create conditions 
        while (true) {
            if (username.equals("alex") && password.equals("sunshine")) {
                System.out.println("You have successfully logged in!");
                break;
            } else if (username.equals("emma") && password.equals("haskell")) {
                System.out.println("You have successfully logged in!");
                break;
            } else {
                System.out.println("Incorrect username or password!");
                break;
            }

        }

    }
}
