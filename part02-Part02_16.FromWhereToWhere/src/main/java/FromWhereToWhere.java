
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // give to prompt
        System.out.print("Where to? ");

        // read user input
        int to = Integer.valueOf(scanner.nextLine());
        
        // give from prompt
        System.out.print("Where from? ");
        
        //read user input
        int from = Integer.valueOf(scanner.nextLine());

        // create for loop to count numbers
        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }

    }
}
