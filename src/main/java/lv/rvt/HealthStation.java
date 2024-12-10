package lv.rvt;

public class HealthStation {
    public double weigh (Person person){
        return person.getWeight();
    }
    public void feed(Person person){
        
        double weight = person.getWeight();
        weight += 1;
        person.setWeight(weight);
    }
}
