
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // create loop to print words and stop if no word is entered
        while (true) {
            String word = scanner.nextLine();
            String pieces[] = word.split(" ");
            if (word.equals("")) {
                break;
            }
            for (int i = 0; i < pieces.length; i++) {
                if (pieces[i].contains("av")) {
                    System.out.println(pieces[i]);
                }
            }

        }

    }
}
