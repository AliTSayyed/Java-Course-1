
public class Statistics {
    // instantiate variables
    private int count;
    private int sum;
    
    // create constructor 
    public Statistics(){
        this.count = 0;
    }
    // introduce addNumber method which increases the count by 1 and sums the numbers added
    public void addNumber(int number){
        this.sum = this.sum + number;
        this.count++;
    }
    // introduce getCount method that returns the count number
    public int getCount(){
        return this.count;
    }
    // returns the sum value
    public int sum(){       
       return this.sum;
    }
    // calculates and returns average 
    public double average(){
        if (this.count == 0){
            return 0;
        }
        return 1.0 * this.sum / this.count;
    }
    
}
