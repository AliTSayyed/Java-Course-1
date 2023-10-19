
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        int count = 0;
        int win = 0;
        int loss = 0;
        try ( Scanner read = new Scanner(Paths.get(file))){
            while(read.hasNextLine()){
                String data = read.nextLine();
                String [] parts = data.split(",");
                String name_1 = parts[0];
                String name_2 = parts[1];
                int score_1 = Integer.valueOf(parts[2]);
                int score_2 = Integer.valueOf(parts[3]);
                
                if (team.equals(name_1)){
                count += 1;
                    if (score_1 > score_2){
                        win += 1;
                    } else {
                        loss += 1;
                    }
                } 
                if (team.equals(name_2)){
                    count+= 1;
                    if (score_1 < score_2){
                        win += 1;
                    } else {
                        loss += 1;
                    }
                }                             
            }            
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + count);  
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
        

    }

}
