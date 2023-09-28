
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // give user prompt and read input
        System.out.print("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        
        // decalere product varaible
        int product = 1;
        
        // create for loop to do factorial function
        for (int i = 1; i <= num; i++){
            product = product * i;            
        }
        
        System.out.println("Factorial: " + product);

    }
}
