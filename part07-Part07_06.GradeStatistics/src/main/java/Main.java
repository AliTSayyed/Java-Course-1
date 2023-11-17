
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        points totalPoints = new points();
        points passingPoints = new points();

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops: ");

        while (true) {
            int point = Integer.valueOf(scanner.nextLine());

            if (point == -1) {
                break;
            }
            totalPoints.add(point);

            if (point >= 50) {

                passingPoints.add(point);
            }

        }  
        
        int passingStudents = passingPoints.pointList().size();
        int totalStudents = totalPoints.pointList().size();
        double passPercentage = 100.0 * passingStudents / totalStudents;
                                        
        
        System.out.println("Point average (all): " + totalPoints);

        System.out.println("Point average (passing): " + passingPoints);
        
        System.out.println("Pass percentage: " + passPercentage);
        
        System.out.println("Grade distribution: ");
        totalPoints.printStars();
    }
}
