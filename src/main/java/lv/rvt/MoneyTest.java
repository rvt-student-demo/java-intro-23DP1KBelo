package lv.rvt;

public class MoneyTest {

    private final int euros;
    private final int cents;

    public MoneyTest(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public MoneyTest plus(MoneyTest addition) {
        MoneyTest newMoney = new MoneyTest(addition.euros + this.euros, addition.cents+this.cents);
                return newMoney;
            }
}
