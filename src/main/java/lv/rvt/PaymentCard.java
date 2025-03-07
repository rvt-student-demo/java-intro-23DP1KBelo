package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        if (this.balance + increase > 150 ){
            this.balance = 150;   
        } else if (increase < 0 ){
            this.balance = this.balance;
        } else{
            this.balance += increase;
        }
    }
    boolean wasSuccessful = true;
    public boolean takeMoney(double amount) {
        if (this.balance - amount > 0){
            this.balance -= amount;
            return wasSuccessful = true;
        } else{
            return wasSuccessful = false;
        }

    }


    public String toString(){
        return "The card has a balance of "+ this.balance+ " euros" ;
    }

    
}
