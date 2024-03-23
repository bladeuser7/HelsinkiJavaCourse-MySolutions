
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ace
 */
public class Suitcase {

    private String item;
    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= this.maximumWeight) {
            this.items.add(item);
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int index = 0;
        for (Item item : items) {
            index += item.getWeight();
        }
        return index;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item temp = this.items.get(0);
        for (Item item : items) {
            if (item.getWeight() > temp.getWeight()) {
                temp = item;
            }
        }
        return temp;
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        if (items.size() == 1) {
            return items.size() + " item (" + totalWeight() + " kg)";
        }
        return items.size() + " items (" + this.totalWeight() + " kg)";

    }
}
