
import java.util.ArrayList;
import java.util.Iterator;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String printOutput = "The collection " + this.name + " has " + this.elements.size() + " element";
        if (this.elements.size() > 1) {
            printOutput += "s:\n";
        } else {
            printOutput += ":\n";
        }

        String loop = "";
        for (int i = 0; i < elements.size(); i++) {
            loop += elements.get(i);
            if (i != elements.size() - 1) {
                loop += "\n";
            }
        }
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        return printOutput + loop;
    }

}
