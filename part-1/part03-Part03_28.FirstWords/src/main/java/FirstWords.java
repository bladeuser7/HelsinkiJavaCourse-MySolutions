
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userInput = scanner.nextLine();
            String[] parts = userInput.split(" ");
            System.out.println(parts[0]);
            if (userInput.isEmpty()) {
                break;
            }
        }


    }
}
