
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read user input value 
        int value = Integer.valueOf(scanner.nextLine());
        
        // create for loop to update values from 0
        for (int i = 0; i <= value; i++) {
            System.out.println(i);
        }

    }
}
