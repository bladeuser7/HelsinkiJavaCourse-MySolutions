
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }
            numbers.add(number);
        }
        int smallest = numbers.get(0);
        int found = numbers.get(0);
        
        ArrayList<Integer> valuesToSave = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (smallest > number) {
                smallest = number;
            }
            if (smallest == number) {
                found = i;
                valuesToSave.add(i); 
            }
//            System.out.println("Found at index: " + found);
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: " + valuesToSave);
        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
    }
}
