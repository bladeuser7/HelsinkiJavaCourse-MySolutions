
public class ProductWarehouseWithHistory extends ProductWarehouse {

//    private double initialBalance;
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
        super.addToWarehouse(initialBalance);

    }

    public String history() {
        return this.history.toString();

    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());

    }

    public double takeFromWarehouse(double amount) {
        double first = super.getBalance();
        super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());
        if (amount > first) {
            return first;
        } else {
            return amount;
        }
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + "\n"
                + "History: " + this.history.toString() + "\n"
                + "Largest amount of product: " + this.history.maxValue() + "\n"
                + "Smallest amount of product: " + this.history.minValue() + "\n"
                + "Average: " + this.history.average()
        );
    }
}
