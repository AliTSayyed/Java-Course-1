
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = scanner.nextLine();
            String pieces[] = word.split(" ");
            if (word.equals("")){
                break;
            }
            for (int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);                
            }
            
        }
    }
}
