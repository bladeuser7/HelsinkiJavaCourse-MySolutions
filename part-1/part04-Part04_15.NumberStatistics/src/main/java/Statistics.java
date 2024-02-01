
public class Statistics {

    private int count;
    private int sum;

    public int Statistics(int initialCount) {
        return this.count = initialCount;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum = number + this.sum;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        double average = 1.0 * sum() / getCount();
        if (getCount() == 0) {
            return 0;
        } else {
            return average;
        }
    }
}
