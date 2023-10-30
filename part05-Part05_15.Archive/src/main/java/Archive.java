/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ATS
 */
public class Archive {
    private String id;
    private String name;
   
    public Archive(String id, String name){
        this.id = id;
        this.name = name;                
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean equals(Object compare){
        if (this == compare){
            return true;
        }
        
        if (!(compare instanceof Archive)){
            return false;
        }
        
        Archive comparedObject = (Archive) compare;
        if (this.id.equals(comparedObject.getId())){
            return true;
        }
        return false;
    }
    
    public String toString(){
        return this.id + ": " + this.name;
    }
    
}
