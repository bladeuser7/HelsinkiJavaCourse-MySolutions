
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        int helper = 0;

        try (Scanner filename = new Scanner(Paths.get(file))) {
            while (filename.hasNextLine()) {
                String row = filename.nextLine();
                if (row.contains(searchedFor)) {
                    helper = 1;
                }
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        if (helper == 1) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found!");
        }

    }
}
