
import java.util.ArrayList;

public class NullPointerExceptionProgram {

    public static void main(String[] args) {
        // Implement a program, or modify a program so, that it causes 
        // the NullPointerException -error

        ArrayList<Integer> lines = new ArrayList<>();
        lines.add(null);

        int index = 0;
        String arg = null;
        lines.set(0, lines.get(0) + 1);
        while (index < lines.size()) {
            System.out.println(lines.get(index));
            index++;
            
        }

    }
}
