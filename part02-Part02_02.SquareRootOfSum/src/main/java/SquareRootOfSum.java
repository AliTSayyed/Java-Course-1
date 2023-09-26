
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // read input and convert to integer
        int number1 = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
        
        // calculate sum
        int sum = number1 + number2;
        
        //calculate sqrt and make it a double
        double sqrt = Math.sqrt(sum);
        
        //print result
        System.out.println(sqrt);
                
        
    }
}
