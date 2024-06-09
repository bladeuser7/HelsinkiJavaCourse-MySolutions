
public class Main {

    public static void main(String[] args) {
        // test your code here
        Hand hand = new Hand();

        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(4, Suit.SPADE));
        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(7, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        hand.sortBySuit();
        Card first = new Card(10, Suit.HEART);
        Card second = new Card(10, Suit.SPADE);
        System.out.println(first.compareTo(second));

//        hand.print();
    }
}
