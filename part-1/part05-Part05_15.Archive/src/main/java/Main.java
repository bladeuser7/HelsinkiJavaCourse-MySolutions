
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> storage = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }Archive toys = new Archive(id, name);
            if (storage.contains(toys)){
                System.out.println("missed");
                continue;
            } else {
                System.out.println("added");
                 storage.add(toys);
            }
        }
        for (Archive arc : storage) {
            System.out.println(arc);
        }
    }
}
