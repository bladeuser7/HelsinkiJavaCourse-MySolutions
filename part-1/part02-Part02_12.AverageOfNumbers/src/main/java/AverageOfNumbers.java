
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double timesUsed = 0;
        double average = 0;
        double sum = 0;

        while (true) {
            System.out.println("Give a number:");
            double value = Integer.valueOf(scanner.nextLine());

            if (value == 0) {
                break;
            }
            if (value != 0) {
                timesUsed = (timesUsed + 1) * 1;
            }
            if (value != 0) {
                sum = value + sum * 1;
            }

            average = sum / timesUsed;

        }
        System.out.println("Average of the numbers: " + average);

    }
}
