
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

  private  Map<String, Integer> warehouse;
    private Map<String, Integer> capacity;

    public Warehouse() {
        this.warehouse = new HashMap<>();
        this.capacity = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.warehouse.put(product, price);
        this.capacity.put(product, stock);
    }

    public int price(String product) {
        int price = -99;
        if (warehouse.get(product) != null) {
            price = warehouse.get(product);
        }
        return price;
    }
   

    public boolean take(String product) {
     Integer stock = capacity.get(product); // Use Integer to allow null values
    if (stock != null && stock > 0) {
        capacity.put(product, stock - 1); // Update the capacity map with the new stock value

//        if (stock > 1) { // Check if the new stock is greater than 0
            return true;
//        }
    }
    return false;
    }

    public int stock(String product) {
        int stock = 0;
        if (capacity.get(product) != null) {
            if (capacity.get(product) > 0) {
                stock = capacity.get(product);
            }
        }
        return stock;
    }
    public Set<String> products() {
        Set<String> names = capacity.keySet();
        Collection<String> nameCollection = names;
        
        return  names;
    }
}
