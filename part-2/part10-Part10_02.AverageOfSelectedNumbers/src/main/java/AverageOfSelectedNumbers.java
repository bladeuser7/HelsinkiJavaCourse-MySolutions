
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<Integer> average = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.next();
            if (input.equals("end")) {
                break;
            }
            average.add(Integer.valueOf(input));

        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        while (true) {
            String command = scanner.nextLine();

            double negative = average.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s <= 0)
                    .average()
                    .getAsDouble();

            double possitive = average.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s >= 0)
                    .average()
                    .getAsDouble();

            if (command.equals("n")) {
                System.out.println("average of the numbers: " + negative);
                break;
            }
            if (command.equals("p")) {
                System.out.println("average of the numbers: " + possitive);
                break;
            }
        }

    }
}
