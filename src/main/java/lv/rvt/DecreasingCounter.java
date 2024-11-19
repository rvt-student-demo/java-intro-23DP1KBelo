package lv.rvt;

public class DecreasingCounter {
    private int value;

    public DecreasingCounter(){
        this.value = 0;
    }

    public DecreasingCounter(int startValue){
        this.value = startValue;
    }

    public void decrement(){
            this.value -= 1;
    }
    
    public void increase(){
        this.value += 1;
        
    }

    public void reset(){
        this.value = 0;
    }

    public int value(){
        return this.value;
    }


    public void printValue() {
        System.out.println("Value: " + this.value);
    }
}
