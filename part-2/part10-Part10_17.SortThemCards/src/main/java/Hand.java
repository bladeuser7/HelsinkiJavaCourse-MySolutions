
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ace
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        this.hand.stream().forEach(s -> System.out.println(s));
    }

    public void sort() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);

        Collections.sort(this.hand, comparator);
    }

    @Override
    public int compareTo(Hand enemyHand) {
        int sum1 = this.hand.stream()
                .mapToInt(Card::getValue) // Assuming Card has a getValue() method for the card value.
                .sum();

        int sum2 = enemyHand.hand.stream()
                .mapToInt(Card::getValue) // Assuming Card has a getValue() method for the card value.
                .sum();

        return sum1 - sum2;
    }
    
    public void sortBySuit() {
       Comparator<Card> comparator = Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue);

        Collections.sort(this.hand, comparator);
    }

}
