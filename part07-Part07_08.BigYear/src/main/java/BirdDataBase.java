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


public class BirdDataBase {

    private final ArrayList<Bird> birds;

    public BirdDataBase() {
        this.birds = new ArrayList<>();
    }

    public void add(Bird bird) {
        if (!(this.birds.contains(bird))) {
            birds.add(bird);
        } else {
            System.out.println("Bird is already in Birds Database");
        }
    }

    public ArrayList birds() {
        return birds;
    }
}