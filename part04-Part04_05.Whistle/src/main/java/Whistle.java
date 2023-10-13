/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ATS
 */
public class Whistle {
   // initilize variable for only object to use 
    private String sound;
   // create constructor to make object
    public Whistle(String whistleSound){
        this.sound = whistleSound;
    }
    // create method to print whilse sound
    public void sound(){
        System.out.println(sound);
    }
    
    
}
