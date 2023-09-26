
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // read input and convert to integer
        int number = Integer.valueOf(scanner.nextLine());
        
        // multiply number by itself and assign to square variable 
        int square = number * number;
        
        //print result
        System.out.println(square);
        
    }
}
