
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        
       // create cards and load balance
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        //paul eats heartily
        paulsCard.eatHeartily();
        
        //Matt eats affordably
        mattsCard.eatAffordably();
        
        //print card values
        System.out.println("Paul " + paulsCard);
        System.out.println("Matt " + mattsCard);
        
        //Paul tops up 20 euros
        paulsCard.addMoney(20);
        
        //Matt eats heartily
        mattsCard.eatHeartily();
        
        //print card values
        System.out.println("Paul " + paulsCard);
        System.out.println("Matt " + mattsCard);
        
        //Paul eats affordably
        paulsCard.eatAffordably();
        
        //Paul eats affordably
        paulsCard.eatAffordably();
        
        //Matt tops up 50 euros
        mattsCard.addMoney(50);
        
        //print card values
        System.out.println("Paul " + paulsCard);
        System.out.println("Matt " + mattsCard);
        
    }
}
