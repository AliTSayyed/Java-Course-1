
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int count = 0;
        while (count < number) {
            System.out.print("*");
            count++;            
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int count = 0;
        while (count < size) {
            printStars(size);
            //System.out.println("");
            count++;
        }
    }

    public static void printRectangle(int width, int height) {
        int count = 0;
        while (count < height) {
            printStars(width);
            //System.out.println("");
            count++;
        }
    }

    public static void printTriangle(int size) {
        int count = 1;
        for (int i = 0; i < size; i++) {
            printStars(count);
            //System.out.println("");
            count++;
        }
    }
}
