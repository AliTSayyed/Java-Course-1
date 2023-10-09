
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);              
        
        int sum = 0;        
        int count = 0;
        int length = 0;
        String name = "name";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String pieces[] = input.split(",");
            int year = Integer.valueOf(pieces[1]);
            sum = sum + year;
            count++;
            
            if (input.length() > length){
                length = input.length();
                name = pieces[0];
            }                
        }
        
        double avg = 1.0 * sum / count;
        
        System.out.println("Longest name: " + name);
        
        if (count == 0){
            System.out.println("No input given");
        } else {
            System.out.println("Average of the birth years: " + avg);
        }
    }
}
