
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int ask = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int ask2 = Integer.valueOf (scanner.nextLine());

        for (int value = ask2; value <= ask; value++) {
            System.out.println(value);
        }
    }
}
