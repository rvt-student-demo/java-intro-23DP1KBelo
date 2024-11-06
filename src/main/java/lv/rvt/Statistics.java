package lv.rvt;

public class Statistics {
    private int count;
    private double sum;

    public Statistics() {
        this.count = count;
        this.sum = sum;
    }

    public void addNumber(int number) {
        this.count ++;
        this.sum += number;
        
    }

    public int getCount() {
        return this.count;
    }
    public double sum() {
        return this.sum;

    }

    public double average() {
        return this.sum / this.count;
    }

}
