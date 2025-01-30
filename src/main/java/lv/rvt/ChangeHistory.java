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
    
    public void clear(){
        this.records.clear();
    }
    public String toString(){
        return this.records.toString();
    }
}
