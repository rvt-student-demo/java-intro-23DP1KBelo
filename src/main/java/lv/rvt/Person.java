package lv.rvt;

public class Person {
    private String name;
    private int age;
    private double weight;
    private double height;

    // All args Class constructor
    public Person(String name, int age, double weight, double height){
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
        return this.name + ", BMI: " + this.bodyMassIndex() + ", maximum heart rate: " + this.maximumHeartRate();
    }
    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }

    public void growOlder() {
        this.age = this.age + 1;
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

}


