
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int helper =0;

        while (true) {
            String line = scanner.nextLine();
            helper++;

            if (line.equals("end")) {
                break;
            }

//            int number = Integer.valueOf(line);
            
        }System.out.println(helper - 1);

    }
}
