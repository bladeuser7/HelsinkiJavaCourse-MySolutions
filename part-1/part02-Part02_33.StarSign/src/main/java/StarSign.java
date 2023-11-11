
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(1);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(3, 7);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
//         first part of the exercise
        int stars = 0;
        while (stars < number) {
            System.out.print("*");
            stars++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int square = 0;

        while (square < size) {
            printStars(size);
            square++;

        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int hei = 0;
        while (hei < height) {
            printStars(width);
            hei++;
        }

    }

    public static void printTriangle(int tree) {
        // fourth part of the exercise
        int star = 0;
        while (star <= tree) {
            printStars(star);
            star++;
        }
    }
}
