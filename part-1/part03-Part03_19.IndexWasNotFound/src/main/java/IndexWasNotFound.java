
import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[10];
        myArray[0] = 6;
        myArray[1] = 2;
        myArray[2] = 8;
        myArray[3] = 1;
        myArray[4] = 3;
        myArray[5] = 0;
        myArray[6] = 9;
        myArray[7] = 7;
        myArray[8] = 2;
        
        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        // Implement the search functionality here
        int index;
        for (index = 0; index < myArray.length; index++) {
            if (searching == myArray[index]) {
                break;
            }
        }
        if (index != myArray.length) {
            System.out.println(searching + " is at index " + index  + ".");
        } else {
            System.out.println(searching + " was not found.");
        }
    }
}
