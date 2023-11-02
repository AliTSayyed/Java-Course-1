
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
   
    @Override
    public String toString() {  
        
        String collection_1 = "";
        for (String input : this.elements){
            collection_1 = collection_1 + input;
        }
        String collection_2 ="";
        for (String input : this.elements){
            collection_2 = collection_2 + input + "\n";
        }
        
       if (elements.isEmpty()){
           return "The collection " + this.name + " is empty.";
       } 
       
       if (elements.size()== 1){
           return "The collection " + this.name + " has " + elements.size() + " element:" + "\n" + collection_1;
       }
       
       return "The collection " + this.name + " has " + elements.size() + " elements:" + "\n" + collection_2;
    }
    
}
