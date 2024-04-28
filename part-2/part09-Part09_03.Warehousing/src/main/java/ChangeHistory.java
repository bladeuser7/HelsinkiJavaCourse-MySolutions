
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        double maxValue = 0;
        for (Double value : history) {
            if (maxValue <= value) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public double minValue() {
        double maxValue = 0;
        for (Double value : history) {
            if (maxValue >= value || maxValue == 0) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public double average() {
        double average = 0;
        for (Double value : history) {
            average += value;
            } return average / history.size();
        }
                
    public String toString() {
        return String.valueOf(this.history);
    }
}
