
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> userInputs = new ArrayList();
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            userInputs.add(input);

        }
        userInputs.stream()
                .forEach(s -> System.out.println(s));
    }
}
