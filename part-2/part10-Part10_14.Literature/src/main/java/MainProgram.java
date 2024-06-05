
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList();
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String inputName = scanner.nextLine();
            if (inputName.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation:");
            int inputAge = Integer.valueOf(scanner.nextLine());
            bookList.add(new Book(inputName, inputAge));
        }
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);

        Collections.sort(bookList, comparator);
        System.out.println(bookList.size() + " books in total." + "\n");

        System.out.println("Books: " + "\n");
        for (Book book : bookList) {
            System.out.println(book);
        }

    }

}
