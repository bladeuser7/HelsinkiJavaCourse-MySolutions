
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int average = 0;
        int counter = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input >= 0) {
                average += input;
                counter++;
            }
        }
        double average2 = 1.0 * average / counter;
        if (average2 >= 0) {
            System.out.println(average2);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
