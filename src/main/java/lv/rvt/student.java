package lv.rvt;

public class student extends Person {
    private Integer credit;

    public student(String name, String address){
        super(name, address);
        credit = this.credit;
        credit = 0;
    }


    public int study(){
        credit++;
        return credit;
    }

    public int credits(){
        return credit;
    }

     @Override
     public String toString() {
        return super.toString() + "\n\t"+ "Study credits " +this.credit;
    }

}

