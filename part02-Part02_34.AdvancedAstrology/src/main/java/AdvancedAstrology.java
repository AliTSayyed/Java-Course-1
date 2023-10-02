
public class AdvancedAstrology {

    public static void printStars(int number) {
        // create print stars method that will print n amount of stars 
        int count = 0;
        while (count < number) {
            System.out.print("*");
            count++;
        }
        // add println statement to move on to next line for future methods being combined with this methods
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // create method that prints n amount of spaces (no println statement)
        int count = 0;
        while (count < number) {
            System.out.print(" ");
            count++;
        }
    }

    public static void printTriangle(int size) {
        // create method that prints stars in a triangle but with the tip of the triangle at the center
        // make spaces 1 less and add a star at the end
        // decrease amount of spaces by 1 and increment stars by 1 every new line
        int count = 1;
        int space = size - 1;
        while (count <= size) {
            printSpaces(space);
            space--;
            printStars(count);
            count++;
        }
    }

    public static void christmasTree(int height) {
        // create method that makes a chirstams tree with a base
        // make spaces 1 less than the max number and decrease it by one every line
        // make stars increment by 2 every line
        // make count less than 2*height so that all rows will be executed       
        int count = 1;
        int space = height - 1;
        while (count <= 2 * height) {
            printSpaces(space);
            space--;
            printStars(count);
            count += 2;
        }        
        // print base at the bottom of the tree
        // make spaces 2 less than the max number before printing stars
        // print 3 stars in a row twice 
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
