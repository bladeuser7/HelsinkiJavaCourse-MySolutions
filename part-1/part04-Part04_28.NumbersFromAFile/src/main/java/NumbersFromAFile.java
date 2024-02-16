
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int helper = 0;

        try (Scanner scanner2 = new Scanner(Paths.get(file))) {
            while (scanner2.hasNextLine()) {
                int row = Integer.valueOf(scanner2.nextLine());
                System.out.println(row);
                if (row >= lowerBound && row <= upperBound) {
                    helper++;
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } System.out.println("Numbers: " + helper);
    }
    

}
