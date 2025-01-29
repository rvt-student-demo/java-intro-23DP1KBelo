package lv.rvt;

public class Teacher extends Person {
    private Integer salary;

    public Teacher(String name, String address, int salary){
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
       return super.toString() + "\n\t"+ "salary " +this.salary + " euro/month";
   }

}
