
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int value = Integer.valueOf(scanner.nextLine()); value <= 100; value++) {
            System.out.println(value);
        }

    }
}
