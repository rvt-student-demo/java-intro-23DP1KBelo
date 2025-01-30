package lv.rvt;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> records;

    public ChangeHistory(){
        this.records = new ArrayList<>();
    }

    public void add(double status){
        this.records.add(status);
    }

    public double maxValue(){
        double max = this.records.get(0);
        for(Double value : records){
            if(value > max){
                max = value;
            }
        }
        return max;
    }

    public double minValue(){
        double min = this.records.get(0);
        for(Double value : records){
            if(value > min){
                min = value;
            }
        }
        return min;
    }

    public double avarage(){
        double sum = 0;
        int sk = 0;
        for(double value : records){
            sum = value + sum;
            sk ++;
        }
        return sum / sk;
    }


    public void clear(){
        this.records.clear();
    }

    public String toString(){
        return this.records.toString();
    }
}
