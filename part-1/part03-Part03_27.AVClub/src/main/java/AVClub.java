
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] splited = input.split(" ");
            for (int i = 0; i < splited.length; i++) {
                if (splited[i].contains("av")) {
                    System.out.println(splited[i]);
                }
            }
            if (input.isEmpty()) {
                break;
            }
        }

    }
}
