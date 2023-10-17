
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // create loop to read in values for the PersonalInformation objects
        while(true){
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()){
                break;
            }
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            
            System.out.print("Identification number: ");
            String id = scanner.nextLine();                        
       
            infoCollection.add(new PersonalInformation(firstName, lastName, id));
        }
        
        System.out.println("");
        
        // use enhanced for loop to print out the first and last name of each object added to the list.
        // here I create a new variable "info" of type PersonalInformation that uses methods from the PersonalInformation class.         
        for(PersonalInformation info :infoCollection){
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
        
    }
}
