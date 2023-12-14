
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {10, 9, 9, 9, 3, 4, 2, 7};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int index = 0;
        int stars = 0;
        while (index < array.length) {
            stars = 0;
            while (stars < array[index]) {
                System.out.print("*");
                stars++;
            }
            System.out.println("");
            index++;
        }
    }

}
