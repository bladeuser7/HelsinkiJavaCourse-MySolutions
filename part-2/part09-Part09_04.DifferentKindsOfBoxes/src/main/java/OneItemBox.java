
import java.util.ArrayList;

public class OneItemBox extends Box {

    private ArrayList<Item> box;
    private int capacity;

    public OneItemBox() {
        this.box = new ArrayList<>();
        this.capacity = 1;
    }

    @Override
    public void add(Item item) {
        if (this.box.isEmpty()) {
            System.out.println(box.size());
            box.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.box.contains(item)) {
            return true;
        }
        return false;
    }

}
