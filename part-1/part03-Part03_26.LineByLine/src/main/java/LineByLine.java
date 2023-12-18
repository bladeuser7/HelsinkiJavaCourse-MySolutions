
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentance;
        while(true) {
            sentance = scanner.next();
            if (sentance.equals(" ")){
                break;
            }
        }
        
        String[] empty = sentance.split(" ");
        
        for (int i = 0; i < empty.length; i++) {
            System.out.println(empty[i]);
        }


    }
}
