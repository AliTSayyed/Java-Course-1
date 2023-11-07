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

public class Suitcase {
    private int maxWeight;
    private int totalWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int weight){
        this.maxWeight = weight;
        items = new ArrayList<>();
    }
    
    public void addItem(Item item){ 
        
        if(item.getWeight() <= this.maxWeight){
            items.add(item);
        }
        
        totalWeight = 0;
        for(Item object : items){
            totalWeight = totalWeight + object.getWeight();
        }
        
        if (totalWeight > this.maxWeight) {
            items.remove(item);
            totalWeight = totalWeight - item.getWeight();
        }
        
        
    }
    
    public void printItems(){
        String itemList = "";
        for (Item object : items){
            itemList = itemList + object.getName() + "(" + Integer.valueOf(object.getWeight()) + " kg)\n";
        }
        System.out.print(itemList);
    }
    
    public int totalWeight(){               
        return totalWeight;
    }
    
    
    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;                        
        }
        
        Item heaviest = items.get(0);
        for (Item object : items){
            if (heaviest.getWeight() < object.getWeight()){
                heaviest = object;
            }
        }
        return heaviest;
    }
    
    public String toString(){
        if (items.isEmpty()){
            return "no items (0 kg)";
        }
        
        if (items.size() == 1){
            return items.size() + " item (" + totalWeight + " kg)";
        }
        
        return items.size() + " items (" + totalWeight + " kg)";
    }
}
