
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

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
        double averages = average.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.println("average of the numbers: " + averages);
    }
}
