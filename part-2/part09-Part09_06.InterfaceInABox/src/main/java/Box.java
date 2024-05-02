
import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> cartbox;
    private double capacity;

    public Box(double capacity) {
        this.capacity = capacity;
        this.cartbox = new ArrayList<>();
    }

    public void add(Packable item) {
        if (item.weight() + weight() < this.capacity) {
            cartbox.add(item);
        }
    }

    public double weight() {
        double totalWeight = 0;
        for (Packable item : cartbox) {
            totalWeight = item.weight() + totalWeight;
        }
        return totalWeight;
    }

    public String toString() {
        return "Box: " + this.cartbox.size() + " items, total weight " + weight() + " kg";
    }

}
