
import java.util.ArrayList;

/**
 *
 * @author Ace
 */
public class Pipe<T> {

    private ArrayList<T> pipes;

    public Pipe() {
        this.pipes = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.pipes.add(value);
    }

    public T takeFromPipe() {
        T gets = null;
        if (this.pipes.size() >= 1) {
            int index = this.pipes.size() - 1;
            gets = this.pipes.get(index);
            this.pipes.remove(index);
        }
        return gets;

    }

    public boolean isInPipe() {
        if (this.pipes.isEmpty()) {
            return false;
        }
        return true;
    }

}
