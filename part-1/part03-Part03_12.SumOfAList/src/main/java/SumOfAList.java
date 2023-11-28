
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        int suma = 0;
        int first = 0;

        System.out.println("");

        // toteuta listan lukujen summan laskeminen tänne
        for (int sum : list) {
            suma = sum + suma;

            System.out.println("sum: " + suma);
        }
    }
}
