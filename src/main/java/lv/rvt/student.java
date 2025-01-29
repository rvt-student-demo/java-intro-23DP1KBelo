package lv.rvt;

public class student extends Person {
    private Integer credit;

    public student(String name, String address){
        super(name, address);
        this.credit = credit;
    }

    this.credit = 0;

    public int study(){
        int summa = credit+1;
        return summa;
    }

}

