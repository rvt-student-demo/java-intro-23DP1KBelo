package lv.rvt;

public class Person {
    private String name;
    private int age;
    private double weight;
    private double height;

    // All args Class constructor
    public Person(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    // Second constructor wth only one parameter
    public Person(String name){
        this(name, 0, 0, 0);
    }

    @Override
    public String toString() {
         return this.name + ", age: " + this.age + ", height: " + this.height+ ", weight: " + this.weight ;
    }

    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }

    public void growOlder() {
        this.age = this.age + 1;
    }
    public void growOlder(int years) {
        this.age = this.age + years;
    }

    public int returnAge() {
        return this.age;
    }

    public boolean isOfLegalAge() {
        return this.age >= 18;
    }

    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public double getHeight(){
        return this.height;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }
    public void add(String[] pers) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

       
   public String toCsvRow(){
        return this.name +  ", " + this.age +  ", " + this.weight+  ", " + this.height;
    }

}


