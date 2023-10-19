
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try ( Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                int number = Integer.valueOf(scan.nextLine());                
                if (number <= upperBound && number >= lowerBound) {
                    numbers.add(number);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
        System.out.println("Numbers: " + numbers.size());
    }

}
