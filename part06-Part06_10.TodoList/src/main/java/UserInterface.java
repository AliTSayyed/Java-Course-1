/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ATS
 */
import java.util.Scanner;
public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;                
    }
    
    public void start(){
        while (true){
            System.out.print("Command: ");
            String input = scanner.nextLine();
            
            if(input.equals("stop")){
                break;
            }
            
            if (input.equals("add")){
                System.out.print("To add: ");
                String add = scanner.nextLine();
                list.add(add);
                continue;
            }
            
            if (input.equals("list")){
                list.print();
            }
            
            if (input.equals("remove")){
                System.out.print("Which one is removed? ");
                int remove = Integer.valueOf(scanner.nextLine());
                list.remove(remove);
            }            
        }
        
    }
    
}
