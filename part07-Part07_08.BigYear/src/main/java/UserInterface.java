/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ATS
 */
import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {

    private final BirdDataBase birdsDataBase;
    private final Scanner scanner;

    public UserInterface(BirdDataBase birds, Scanner scanner) {
        this.birdsDataBase = birds;
        this.scanner = scanner;

    }

    public void start() {
        
        ArrayList<Bird> birds = this.birdsDataBase.birds();
        
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine().toLowerCase();
            if (command.equals("add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine().toUpperCase();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine().toUpperCase();
                birds.add(new Bird(name, latinName));
            } else if (command.equals("observation")) {
                System.out.print("Bird: ");
                String name = scanner.nextLine().toUpperCase();
                for (int i = 0; i < birds.size(); i++) {
                    if (birds.get(i).getName().equals(name)) {
                        birds.get(i).observation();
                    } else {
                        System.out.println("Not a Bird!");
                    }
                }
            } else if (command.equals("all")) {
                for (Bird bird : birds) {
                    System.out.println(bird.getName() + " ("
                            + bird.getLatinName() + "): " + bird.getObservation()
                            + " observations.");
                }
            } else if (command.equals("one")) {
                System.out.println("Bird?");
                String name = scanner.nextLine();
                for (Bird bird : birds) {
                    if (bird.getName().equals(name)) {
                        System.out.println(bird.getName() + " ("
                                + bird.getLatinName() + "): " + bird.getObservation()
                                + " observations.");
                    }
                }
            } else if (command.equals("quit")) {
                break;
            }
        }
    }
}