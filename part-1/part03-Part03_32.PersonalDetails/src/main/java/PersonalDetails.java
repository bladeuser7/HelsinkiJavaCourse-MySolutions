
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int average = 0;
        String name = " ";
        int length = 0;
        int count = 0;

        while (true) {
            String userInput = scanner.nextLine();
            String[] parts = userInput.split(",");
            if (userInput.isEmpty()) {
                break;
            }
            while (userInput.length() > length) {
                length = userInput.length();
                name = parts[0];

            }
            average = average + Integer.valueOf(parts[1]);
            count++;

        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * average / count);

    }
}
