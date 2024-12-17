package lv.rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        int heartyMeals = this.heartyMeals;
        int affordableMeals = this.affordableMeals;

        double money = this.money;
        this.money = 1000;
    }
    double eatingHeartily = 4.30;
    double eatingAffordably = 2.50;
    double change;

    public double eatAffordably(double payment){
        if (eatingAffordably <= payment){
            this.money += payment - eatingAffordably;
            this.affordableMeals += 1;
            change = payment - eatingAffordably;
        } else if (eatingAffordably > payment){
             change = payment;
        }
        return change;
    }


    public double eatHeartily(double payment){
        if (eatingHeartily <= payment){
            this.money += payment - eatingHeartily;
            this.heartyMeals += 1;
            change = payment - eatingHeartily;
        } else if (eatingHeartily > payment){
             change = payment;
        }
        return change;
    }
    boolean wasSuccessful = true;
    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() - 2.50 > 0){
            card.takeMoney(2.50);
            this.affordableMeals++;
            this.money += 2.50;
            return wasSuccessful = true;
        } else{
            return wasSuccessful = false;
        }
    }

    
    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() - 4.30 > 0){
            card.takeMoney(4.30);
            this.heartyMeals++;
            this.money += 4.30;
            return wasSuccessful = true;
        } else{
            return wasSuccessful = false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
        
    }
    
    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}