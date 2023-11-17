
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container_1 = new Container();
        Container container_2 = new Container();

        while (true) {
            System.out.println("First: " + container_1);
            System.out.println("Second: " + container_2);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            String value = parts[1];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount >= 0) {
                    container_1.add(amount);
                }

            }

            if (command.equals("move")) {
                if (amount >= 0) {
                    if (container_1.contains() < amount) {
                        container_2.add(container_1.contains());
                    }
                    if (container_1.contains() >= amount) {
                        container_2.add(amount);
                    }
                    container_1.remove(amount);
                }
            }

            if (command.equals("remove")) {
                if (amount > 0) {
                    container_2.remove(amount);
                }                
            }
            System.out.println("");
        }

    }
}
