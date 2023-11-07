/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ATS
 */
import java.util.Scanner;

public class TextUI {

    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (input.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
                continue;
            }

            if (input.equals("search")) {
                System.out.print("To be Translated: ");
                String word = scanner.nextLine();

                if (dictionary.translate(word) == null){
                System.out.println("Word " + word + " was not found");                
            }
                if (dictionary.translate(word) != null){
                 System.out.println("Translation: " + dictionary.translate(word));
            }              
                continue;
            }

            System.out.println("Unknown Command");
        }

    }

}
