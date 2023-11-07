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

public class Hold {

    private int maxWeight;
    private int totalWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int weight) {
        this.maxWeight = weight;
        suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);
        }

        totalWeight = 0;
        for (Suitcase object : suitcases) {
            totalWeight = totalWeight + object.totalWeight();
        }

        if (totalWeight > this.maxWeight) {
            suitcases.remove(suitcase);
            totalWeight = totalWeight - suitcase.totalWeight();
        }
    }

    public String toString() {
        if (suitcases.isEmpty()) {
            return "no items (0 kg)";
        }

        if (suitcases.size() == 1) {
            return suitcases.size() + " suitcase (" + totalWeight + " kg)";
        }

        return suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase object : suitcases) {
            object.printItems();
        }

    }
}
