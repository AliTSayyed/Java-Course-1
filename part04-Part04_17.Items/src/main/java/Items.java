
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // create while loop to read in name and create a new object for each name
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }
            items.add(new Item(name));
        }
        
        System.out.println("");
        // for each object in the list print out the to string method
        for (Item name : items) {
            System.out.println(name);
        }
    }
}
