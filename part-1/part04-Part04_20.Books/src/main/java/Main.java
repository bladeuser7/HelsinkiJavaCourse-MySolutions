
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> index = new ArrayList<>();

        // implement here the program that allows the user to enter 
        // book information and to examine them
        while (true) {
            System.out.println("Title: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());
            index.add(new Books(name, pages, year));

        }
        System.out.println("What information will be printed? ");
        String question = scanner.nextLine();
        if (question.equals("everything")) {
            for (Books indexes : index) {
                System.out.println(indexes);
            }
        }
        if (question.equals("name")) {
            for (Books indexes : index) {
                
                System.out.println(indexes.name());

            }

        }
    }
}