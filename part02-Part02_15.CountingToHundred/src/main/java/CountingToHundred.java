
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // read user input
        int value = Integer.valueOf(scanner.nextLine());
        
        // create for loop to count to 100
        for (int i = value; i <= 100; i++){
            System.out.println(i);
        }

    }
}
