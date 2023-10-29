
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if (this.squares > compared.squares){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared){
        int price= this.squares * this.princePerSquare;
        int price2 = compared.squares * compared.princePerSquare;
        int diff =0;
        
        if (price >= price2){
           diff = price - price2;
        } else{
            diff = price2 - price;
        }        
        
        return diff;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int price= this.squares * this.princePerSquare;
        int price2 = compared.squares * compared.princePerSquare;
        int diff =0;
        
        if (price > price2){
           return true;
        } else{
            return false;
        }                
    }
}
