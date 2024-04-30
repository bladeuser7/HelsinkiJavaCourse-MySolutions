
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> box;

    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() <= this.capacity) {
            box.add(item);
            this.capacity = this.capacity - item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item it : box) {
            if (it.equals(item)) {
                return true;
            }
        }
        return false;
    }

}
