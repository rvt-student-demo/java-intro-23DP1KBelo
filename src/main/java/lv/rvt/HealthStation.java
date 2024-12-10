package lv.rvt;

public class HealthStation {
    int kopa;
    public double weigh (Person person){
        kopa ++;
        return person.getWeight();
    }

    public void feed(Person person){
        
        double weight = person.getWeight();
        weight += 1;
        person.setWeight(weight);
    }

    public int weighings(){
        
        return kopa;
    }
}
