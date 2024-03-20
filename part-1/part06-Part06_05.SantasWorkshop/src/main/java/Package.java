
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
public class Package {

    private ArrayList<Gift> gift;

    public Package() {
        this.gift = new ArrayList<>();

    }

    public void addGift(Gift gift) {
        this.gift.add(gift);
    }
    public int totalWeight() {
        int totals = 0;
        for (Gift i : gift) {
            totals += i.getWeight();
        }
        return totals;
    }

}
