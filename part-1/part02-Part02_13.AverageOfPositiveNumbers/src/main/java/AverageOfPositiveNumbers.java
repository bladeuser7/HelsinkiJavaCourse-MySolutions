
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double average = 0;
        double timesUsed = 0;
        double sum = 0;

        while (true) {
            double value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                break;
            }
            if (value >= 0) {
                timesUsed = (timesUsed + 1) * 1;
            }
            if (value >= 0) {
                sum = value + sum * 1;
            }

            average = sum / timesUsed;

        }
        if (average <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }

    }
}
