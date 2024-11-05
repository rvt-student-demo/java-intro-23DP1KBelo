package lv.rvt;

public class DecreasingCounter {
    private int value;

    public DecreasingCounter(int initialValue){
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("Value: " + this.value);
    }

    public void decrement(){
        this.value -= 1;
    }




}
