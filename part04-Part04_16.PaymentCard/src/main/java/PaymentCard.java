/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ATS
 */
public class PaymentCard {

    //create instance variables 
    private double balance;

    //create constructor 
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    //create a toString method
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    //create eatAffordiably method
    public void eatAffordably() {

        if (this.balance - 2.60 >= 0) {
            this.balance = this.balance - 2.60;
        }
    }

    //create eatHeartily method
    public void eatHeartily() {
        if (this.balance - 4.60 >= 0) {
            this.balance = this.balance - 4.60;
        }
    }

    // create addMoney method
    public void addMoney(double amount) {
        if (amount < 0){
            amount = 0;
        }
        if (this.balance + amount > 150) {
            this.balance = 150;
        } else {
            this.balance = this.balance + amount;
        }
    }
}
