package lv.rvt;

public class Product {
    private double price;
    private int quantity;
    private String name;
    private int weight;
    private String location;

    public Product(String initialName, double initialPrice, int initialQuantity, String location, int weight ){
        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.name = initialName;
        this.weight = weight;
        this.location = location;
    }
    public Product(String name){
        this(name,0, 0,"shelf",1);
    }

    public Product(String name, String location){
        this(name, 0, 0, location, 1);
    }

    public Product(String name, int weight){
        this(name, 0, 0, "shelf", weight);
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight+ " kg" +")" + " can be found from the " + this.location;
    }

    public void printProduct(){
        System.out.println(this.name + ", price " + this.price +", " + this.quantity + " pcs" );
        
    }
}
