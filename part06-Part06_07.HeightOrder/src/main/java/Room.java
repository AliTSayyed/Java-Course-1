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

public class Room {
    private ArrayList<Person> people;
    
    public Room(){
        people = new ArrayList<>();
    }
    
    public void add(Person person){
        people.add(person);
    }
    
    public boolean isEmpty(){
        if (people.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return people;
    }
    
    public Person shortest(){
        if (people.isEmpty()){
            return null;
        }
        Person shortest = people.get(0);
        for(Person info : people){
            if (shortest.getHeight() > info.getHeight()){  
                shortest = info;
            }                
        }
        return shortest;       
    }
    
    public Person take(){
          if (people.isEmpty()){
            return null;
        }
          
        Person shortest = people.get(0);
        for(Person info : people){
            if (shortest.getHeight() > info.getHeight()){  
                shortest = info;                
            }                
        } 
        people.remove(shortest);
        return shortest;
    }
    
}
