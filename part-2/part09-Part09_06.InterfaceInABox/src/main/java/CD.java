
public class CD implements Packable {

    private String name;
    private String author;
    private double weight;
    private int year;

    public CD(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    public String name() {
        return this.name;
    }

    public String toString() {
        return this.author + ": " + this.name + " (" + this.year + ")";
    }
}
