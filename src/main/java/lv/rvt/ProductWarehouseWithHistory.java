package lv.rvt;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private double initialBalance;
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();
    }

    public String history(){
        return this.history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(super.getBalance()); 
        
    }   

    @Override
    public double takeFromWarehouse(double amount) {
        double recived = super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());
        return recived;
    }

  

}
