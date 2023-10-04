
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        // ask user for stat index
        System.out.print("From where? ");
        int start = Integer.valueOf(scanner.nextLine());
        // ask user for end index
        System.out.print("To where? ");
        int end = Integer.valueOf(scanner.nextLine());
        
        
        System.out.println(numbers.get(start));
        System.out.println(numbers.get(end));
        
    }
}
