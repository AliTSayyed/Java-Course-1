
public class Main {

    public static void main(String[] args) {
        // test your program here!
        
        SimpleDate date = new SimpleDate(30,12,2011);
        System.out.println(date);
        date.advance();
        System.out.println(date);
        date.advance(3);
        System.out.println(date);
       
    }
}
