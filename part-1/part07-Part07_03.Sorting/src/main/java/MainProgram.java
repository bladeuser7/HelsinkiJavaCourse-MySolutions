
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(MainProgram.indexOfSmallest(numbers));
        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        
    }

    public static int smallest(int[] array) {
        // write your code here
        int smallest = 9999;
        for (int arr : array) {
            if (smallest > arr) {
                smallest = arr;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int onebyone = -1;
        int smallest = 9999;
        for (int arr : array) {
            onebyone++;
            if (smallest > arr) {
                smallest = arr;
                index = onebyone;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;

        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < table[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tempIndex = 0;
        int ti1 = 0;
        int ti2 = 0;
        int counter = 0;
        for (int index : array) {
            if (counter == index1) {
                ti1 = index;
            }
            if (counter == index2) {
                ti2 = index;
            }
            counter++;
        }
        array[index1] = ti2;
        array[index2] = ti1;
    }

    public static void sort(int[] array) {
        int counter = 0;
        for (int index : array) {
            swap(array, counter, indexOfSmallestFrom(array, counter));
            System.out.println(Arrays.toString(array));
                counter++;
        }
    }
}
