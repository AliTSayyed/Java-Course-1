

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }
    
    // create new method
    public static void printFromNumberToOne(int number){
        int i = number;
        while (i > 0){
            System.out.println(i);
            i--;
        // could also do for (int i = number; i > 0; i--)                 
        }
    }

}
