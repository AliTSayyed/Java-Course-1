
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // give user prompt for numbers and read them 
        System.out.print("Frist number? ");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Second number? ");    
        int num2 = Integer.valueOf(scanner.nextLine());
        
        // decalre sum variable
        int sum = 0;
        
        // create for loop to sum from first to last numbers given
        for (int i = num1; i <= num2; i++){
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }
}
