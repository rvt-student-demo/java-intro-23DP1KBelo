package lv.rvt;

public class Agent {
    private String fname;
    private String lname;

    public Agent(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }
    
    @Override
    public String toString(){
        return "My name is " + this.lname + ", " + this.fname + " "+ this.lname;
    }
}
