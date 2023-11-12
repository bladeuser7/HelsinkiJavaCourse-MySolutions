
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int stars = 0;
        while (stars < number) {
            System.out.print("*");
            stars++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int space = 0;
        while (space < number) {
            System.out.print(" ");
            space++;
        }
//        System.out.println("");

    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int space = size -1;
        int star = 1;
        while (star <= size) {
            printSpaces(space);
            space--;
            printStars(star);
            star++;
            
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int branch = 0;
        int tall = 1;
        int space = height - 1;
        while (branch < height) {
            printSpaces(space);
            space--;
            printStars(tall);
            tall = tall + 2;
            branch++;
        }
        if (true) {
            printSpaces(tall / 2 - 2);
            printStars(3);
            printSpaces(tall / 2 - 2);
            printStars(3);
            
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
