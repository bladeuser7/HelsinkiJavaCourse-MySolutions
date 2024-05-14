
import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> organisms;

    public Herd() {
        this.organisms = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.organisms.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable mov : organisms) {
            mov.move(dx, dy);
        }
    }

    public String toString() {
        String result = " \n";
        for (Movable mov : organisms) {
            result += mov.toString() + "\n";
        }
        return result;
    }
}
