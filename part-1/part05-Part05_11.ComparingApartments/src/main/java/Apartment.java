
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        int ownSquare = this.squares;
        int camparedSquare = compared.squares;
        if (ownSquare > camparedSquare) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int price = this.princePerSquare * this.squares;
        int comparedPrice = compared.princePerSquare * compared.squares;
        int result = 0;
        if (price <= comparedPrice) {
            result = comparedPrice - price;
        } else if (price >= comparedPrice) {
            result = price - comparedPrice;
        }
        return result;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int price = this.princePerSquare * this.squares;
        int comparedPrice = compared.princePerSquare * compared.squares;
        if (price > comparedPrice) {
            return true;
        } else {
            return false;
        }
    }
}
