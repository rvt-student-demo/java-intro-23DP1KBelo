package lv.rvt;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private double initialBalance;
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.history = new ChangeHistory();
    }

    public String history(){
        return this.history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        this.history.add(amount); // Seit ir kluda, nebus amount parametrs
        super.addToWarehouse(amount);
    }   

    @Override
    public double takeFromWarehouse(double amount) {
        this.history.add(amount);
        return super.takeFromWarehouse(amount);
    }

}
