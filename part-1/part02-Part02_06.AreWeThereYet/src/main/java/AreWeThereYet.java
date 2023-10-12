
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("Customer number: ");
        int y =25;

        if (y <= 1000 ) {
            System.out.println("Gets a gift card!");
        } else if (y % 2000 == 0) {
            System.out.println("Gets a large gift card!");
        } else {
            System.out.println("Gets nothing.");
        }
    }
}
