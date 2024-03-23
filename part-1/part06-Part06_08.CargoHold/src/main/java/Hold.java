
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
public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> suitcase;

    public Hold(int maximumWeight) {
        this.suitcase = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            this.suitcase.add(suitcase);
        }
    }

    public int totalWeight() {
        int temp = 0;
        for (Suitcase Suit : suitcase) {
            temp += Suit.totalWeight();
        }
        return temp;
    }

    public void printItems() {
        for (Suitcase suit : suitcase) {
            suit.printItems();
        }
    }

    public String toString() {
        int temp = 0;
        for (Suitcase Suit : suitcase) {
            temp += Suit.totalWeight();
        }
        return this.suitcase.size() + " suitcases (" + totalWeight() + " kg)";
    }
}
