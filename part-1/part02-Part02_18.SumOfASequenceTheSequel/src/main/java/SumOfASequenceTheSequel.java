
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int scan1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int scan2 = Integer.valueOf(scanner.nextLine());
        int i = scan1;
        while (true) {
            scan1 = i + scan1 + 1;
            i++;

            if (i == scan2) {
                break;
            }
        }
        System.out.println("The sum is: " + scan1);
    }
}
