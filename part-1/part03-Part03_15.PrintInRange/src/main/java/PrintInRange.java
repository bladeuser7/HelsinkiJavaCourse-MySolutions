
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(7);
        numbers.add(9);
        numbers.add(2);
        numbers.add(6);

        System.out.println("The numbers in the range [1, 2]");
        printNumbersInRange(numbers, 1, 2);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);

    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int start : numbers) {
            if ( lowerLimit <= start && upperLimit >= start) {
                System.out.println(start);
            }
            
        }

//        for (int start = lowerLimit; start <= upperLimit; start++) {
//            System.out.println(start);
//        }
    }
}
