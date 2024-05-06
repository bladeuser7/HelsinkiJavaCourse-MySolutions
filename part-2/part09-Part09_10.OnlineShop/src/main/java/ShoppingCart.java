
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        Item item1 = new Item(product, 1, price);
        if (cart.containsKey(product)) {
            cart.get(product).increaseQuantity();
        } else {
            cart.put(product, item1);
        }

    }

    public int price() {
        int total = 0;
        for (String product : cart.keySet()) {
            total = total + cart.get(product).price();
        }
        return total;
    }

    public void print() {
        for (String product : cart.keySet()) {
            System.out.println(this.cart.get(product).toString());
        }
    }

}
